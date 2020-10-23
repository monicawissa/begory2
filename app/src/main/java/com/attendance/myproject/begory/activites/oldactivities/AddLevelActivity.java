package com.attendance.myproject.begory.activites.oldactivities;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.ResultItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.beans.TermItem;
import com.attendance.myproject.begory.entites.Level;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_level);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
                //addLevel();
            }
        });
    }

    int count = 1;
    private void add() {

        /*final EditText mYearEditText = (EditText) findViewById(R.id.et_year);
        final EditText mNameEditText = (EditText) findViewById(R.id.et_name);
        if (TextUtils.isEmpty(mYearEditText.getText().toString()) || TextUtils.isEmpty(mNameEditText.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),R.string.fill_data,Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        final Level student = new Level();
        student.setLevelYear(mYearEditText.getText().toString());
        student.setLevelName(mNameEditText.getText().toString());
        student.setLevelActive(true);*/

        count+=1;

        LevelItem levelItem = new LevelItem();
        levelItem.setId(FBConnenctions.CONST_LEVEL_1);
        levelItem.setName("حضانة");
        ArrayList<StudentItem> studentItems = new ArrayList<>();

        StudentItem studentItem = new StudentItem();
        studentItem.setId(count+"");
        studentItem.setName("بيشوى عادل حماية");
        studentItem.setAddress("عنوان تجريبي");
        studentItem.setMobile("0100000000"+count);
        studentItem.setfMobile("01000000000");
        studentItem.setShamas(true);

        ResultItem result = new ResultItem();
        result.setTotalGrade(count);
        TermItem term = new TermItem();
        term.setfSubGrade(count);
        term.setsSubGrade(count);
        result.setfTerm(term);
        result.setsTerm(term);
        result.settTerm(term);

        studentItem.setStudentRes(result);
        studentItems.add(studentItem);

        studentItems.add(studentItem);

        studentItems.add(studentItem);

        studentItems.add(studentItem);

        levelItem.setStudents(studentItems);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVEL_1);

        //String key = databaseReference.push().getKey();
        levelItem.setId(FBConnenctions.CONST_LEVEL_1);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show();
                //mNameEditText.setText("");

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

    private void addLevel() {

        final EditText mYearEditText = (EditText) findViewById(R.id.et_year);
        final EditText mNameEditText = (EditText) findViewById(R.id.et_name);
        if (TextUtils.isEmpty(mYearEditText.getText().toString()) || TextUtils.isEmpty(mNameEditText.getText().toString()))
        {
            Toast.makeText(getApplicationContext(),R.string.fill_data,Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        final Level student = new Level();
        student.setLevelYear(mYearEditText.getText().toString());
        student.setLevelName(mNameEditText.getText().toString());
        student.setLevelActive(true);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(FBConnenctions.CONST_LEVELS);

        String key = databaseReference.push().getKey();
        student.setLevelId(key);

        databaseReference.child(key).setValue(student).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show();
                mNameEditText.setText("");

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
