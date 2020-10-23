package com.attendance.myproject.begory.activites;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.attendance.myproject.begory.BaseActivity;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.UiManager;
import com.attendance.myproject.begory.Utilities.Utils;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class PreLoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_login);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText mKeyEditText = (EditText) findViewById(R.id.et_secret_key);

                if (!TextUtils.isEmpty(mKeyEditText.getText().toString()))
                {
                    try{
                        Utils.hideKeyboard(PreLoginActivity.this);
                        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
                        final FirebaseDatabase database=FirebaseDatabase.getInstance();
                        Query databaseReference=database.getReference().child(mKeyEditText.getText().toString());
                        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                try {

                                    findViewById(R.id.progressBar).setVisibility(View.GONE);

                                    if (dataSnapshot.exists()) {
                                        Utils.hideKeyboard(PreLoginActivity.this);
                                        Utils.saveKey(PreLoginActivity.this, mKeyEditText.getText().toString());
                                        UiManager.startLoginActivity(PreLoginActivity.this);
                                        finish();
                                    }
                                    else
                                        Toast.makeText(getApplicationContext(),R.string.error_code,Toast.LENGTH_SHORT).show();

                                } catch (Exception e) {
                                    Log.e("Exception is", e.toString());
                                    findViewById(R.id.progressBar).setVisibility(View.GONE);
                                    Toast.makeText(getApplicationContext(),R.string.error,Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(getApplicationContext(),R.string.account_key,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
