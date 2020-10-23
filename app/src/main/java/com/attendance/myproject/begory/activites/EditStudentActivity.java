package com.attendance.myproject.begory.activites;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

public class EditStudentActivity extends AppCompatActivity {

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();
    private Spinner mStudentsSpinner;
    private ArrayList<StudentItem> mStudentsList = new ArrayList<>();
    private LevelItem levelItem;
    private StudentItem mSelectedStudent =null;

    private  EditText mIdEditText,mNameEditText,mAddressEditText,mPhoneEditText,mPhone2EditText;
    private  CheckBox mShamas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        mIdEditText = (EditText) findViewById(R.id.et_id);
        mNameEditText = (EditText) findViewById(R.id.et_name);
        mAddressEditText = (EditText) findViewById(R.id.et_address);
        mPhoneEditText = (EditText) findViewById(R.id.et_mobile);
        mPhone2EditText = (EditText) findViewById(R.id.et_mobile2);
        mShamas =  findViewById(R.id.cb_shamas);

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
        level.setLevelId("-1");
        level.setLevelName(getString(R.string.choose_level));
        mLevelsList.add(level);

        level = new Level();
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
        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(EditStudentActivity.this,
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

    private void setStudentsSpinner ()
    {
        mStudentsSpinner = (Spinner) findViewById(R.id.sp_students);
        ArrayAdapter<StudentItem> dataAdapter = new ArrayAdapter<>(EditStudentActivity.this,
                android.R.layout.simple_spinner_item, mStudentsList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mStudentsSpinner.setAdapter(dataAdapter);

        mStudentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mSelectedStudent = mStudentsList.get(i);

                mIdEditText.setText(mSelectedStudent.getId());
                mAddressEditText.setText(mSelectedStudent.getAddress());
                mNameEditText.setText(mSelectedStudent.getName());
                mPhoneEditText.setText(mSelectedStudent.getMobile());
                mPhone2EditText.setText(mSelectedStudent.getfMobile());
                mShamas.setChecked(mSelectedStudent.isShamas());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void add() {

        if (TextUtils.isEmpty(mIdEditText.getText().toString()) || TextUtils.isEmpty(mNameEditText.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),R.string.fill_data,Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        mSelectedStudent.setId(mIdEditText.getText().toString());
        mSelectedStudent.setName(mNameEditText.getText().toString());
        mSelectedStudent.setAddress(mAddressEditText.getText().toString());
        mSelectedStudent.setMobile(mPhoneEditText.getText().toString());
        mSelectedStudent.setfMobile(mPhone2EditText.getText().toString());
        mSelectedStudent.setShamas(mShamas.isChecked());


        levelItem.getStudents().set(mStudentsSpinner.getSelectedItemPosition(),mSelectedStudent);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference databaseReference = mDatabase.child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.edited, Toast.LENGTH_SHORT).show();
                mSelectedStudent = null;

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

                        mStudentsList.clear();
                        if (levelItem.getStudents()!=null)
                            mStudentsList.addAll(levelItem.getStudents());
                        setStudentsSpinner();

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
