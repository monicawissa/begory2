package com.attendance.myproject.begory.activites;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.attendance.myproject.begory.BaseActivity;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.UiManager;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.entites.Admin;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText mNameEditText = (EditText) findViewById(R.id.et_username);
                final EditText PasswordEditText = (EditText) findViewById(R.id.et_password);

                if (!TextUtils.isEmpty(mNameEditText.getText().toString()) &&
                        !TextUtils.isEmpty(PasswordEditText.getText().toString()))
                {
                    try{
                        Utils.hideKeyboard(LoginActivity.this);
                        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
                        final FirebaseDatabase database=FirebaseDatabase.getInstance();
                        Query databaseReference=database.getReference().child(Utils.getKey(LoginActivity.this))
                                .child(FBConnenctions.CONST_ADMINS).orderByChild("adminName").equalTo(mNameEditText.getText().toString());
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                try {
                                    findViewById(R.id.progressBar).setVisibility(View.GONE);
                                    Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                                    boolean isFound = false;
                                    for (DataSnapshot child : children) {

                                        Admin admin=child.getValue(Admin.class);

                                        isFound = true;
                                        if (admin.isAccountActive())
                                        {
                                            if (!PasswordEditText.getText().toString().equals(admin.getAdminPassword()))
                                            {
                                                Toast.makeText(getApplicationContext(),R.string.wrong_password,Toast.LENGTH_SHORT).show();
                                                return;
                                            }
                                            else
                                            {
                                                Utils.saveAdmin(LoginActivity.this,admin);
                                                UiManager.startHomeActivity(LoginActivity.this);
                                                finish();
                                            }

                                        }
                                        else
                                            Toast.makeText(getApplicationContext(),R.string.account_deactivated,Toast.LENGTH_SHORT).show();
                                    }

                                    if (!isFound)
                                        Toast.makeText(getApplicationContext(),R.string.account_not_found,Toast.LENGTH_SHORT).show();


                                } catch (Exception e) {
                                    Log.e("Exception is", e.toString());
                                    findViewById(R.id.progressBar).setVisibility(View.GONE);
                                }
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                                findViewById(R.id.progressBar).setVisibility(View.GONE);
                                Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_SHORT).show();
                            }
                        });

                    }catch(Exception e){
                        Log.e("Exception is",e.toString());
                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(getApplicationContext(),R.string.fill_data,Toast.LENGTH_SHORT).show();
            }
        });

    }


}
