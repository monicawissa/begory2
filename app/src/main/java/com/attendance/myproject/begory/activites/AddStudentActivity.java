package com.attendance.myproject.begory.activites;

import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.entites.Level;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AddStudentActivity extends AppCompatActivity {

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();
    private LevelItem levelItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        initLevelsSpinner();
        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });
    }


    private void initLevelsSpinner() {

        Level level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_1);
        level.setLevelName(getString(R.string.lev_1));
        mLevelsList.add(level);

        level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_2);
        level.setLevelName(getString(R.string.lev_2));
        mLevelsList.add(level);

        level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_3);
        level.setLevelName(getString(R.string.lev_3));
        mLevelsList.add(level);

        level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_4);
        level.setLevelName(getString(R.string.lev_4));
        mLevelsList.add(level);

        level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_5);
        level.setLevelName(getString(R.string.lev_5));
        mLevelsList.add(level);

        level = new Level();
        level.setLevelId(FBConnenctions.CONST_LEVEL_6);
        level.setLevelName(getString(R.string.lev_6));
        mLevelsList.add(level);

        mLevelSpinner = (Spinner) findViewById(R.id.sp_levels);
        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(AddStudentActivity.this,
                android.R.layout.simple_spinner_item, mLevelsList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mLevelSpinner.setAdapter(dataAdapter);

        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                getStudentsList();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void add() {

        final EditText mIdEditText = (EditText) findViewById(R.id.et_id);
        final EditText mNameEditText = (EditText) findViewById(R.id.et_name);
        final EditText mAddressEditText = (EditText) findViewById(R.id.et_address);
        final EditText mPhoneEditText = (EditText) findViewById(R.id.et_mobile);
        final EditText mPhone2EditText = (EditText) findViewById(R.id.et_mobile2);
        final CheckBox mShamas =  findViewById(R.id.cb_shamas);

        if (TextUtils.isEmpty(mIdEditText.getText().toString()) || TextUtils.isEmpty(mNameEditText.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),R.string.fill_data,Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        final StudentItem student = new StudentItem();
        student.setId(mIdEditText.getText().toString());
        student.setName(mNameEditText.getText().toString());
        student.setAddress(mAddressEditText.getText().toString());
        student.setMobile(mPhoneEditText.getText().toString());
        student.setfMobile(mPhone2EditText.getText().toString());
        student.setShamas(mShamas.isChecked());

        if (levelItem.getStudents()==null)
            levelItem.setStudents(new ArrayList<StudentItem>());

        levelItem.getStudents().add(student);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference databaseReference = mDatabase.child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                mNameEditText.setText("");
                mIdEditText.setText("");
                mPhoneEditText.setText("");
                mPhone2EditText.setText("");
                mAddressEditText.setText("");
                mShamas.setChecked(false);

                Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show();

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

    private void getStudentsList() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this))
                    .child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        levelItem=dataSnapshot.getValue(LevelItem.class);

                    } catch (Exception e) {
                        Log.e("Exception is", e.toString());
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });

        }catch(Exception e){
            Log.e("Exception is",e.toString());
        }

    }
}
