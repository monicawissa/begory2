package com.attendance.myproject.begory.activites;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.entites.Admin;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_admin);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });
    }

    private void add() {

        final EditText mPasswordEditText = (EditText) findViewById(R.id.et_password);
        final EditText mNameEditText = (EditText) findViewById(R.id.et_name);
        if (TextUtils.isEmpty(mPasswordEditText.getText().toString()) || TextUtils.isEmpty(mNameEditText.getText().toString())) {
            Toast.makeText(getApplicationContext(), R.string.fill_data, Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        final Admin admin = new Admin();
        admin.setAdminName(mNameEditText.getText().toString());
        admin.setAdminPassword(mPasswordEditText.getText().toString());
        admin.setAccountActive(true);
        admin.setMainAdmin(((CheckBox) findViewById(R.id.cb_is_Admin)).isChecked());

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(FBConnenctions.CONST_ADMINS);

        String key = attendanceDatabaseReference.push().getKey();

        admin.setAdminId(key);
        attendanceDatabaseReference.child(key).setValue(admin).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show();
                finish();
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        // Write failed
                        // ...
                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Toast.makeText(getApplicationContext(), R.string.error, Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
