package com.attendance.myproject.begory.activites;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.StudentResultAdapter;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.ResultItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.beans.StudentWithResult;
import com.attendance.myproject.begory.beans.TermItem;
import com.attendance.myproject.begory.entites.Level;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class LevelResultActivity extends AppCompatActivity {

    private ArrayList<StudentItem> mStudentList = new ArrayList<>();

    private StudentResultAdapter mAdapter;
    private ArrayList<StudentWithResult> mStudentWithResultsList = new ArrayList<>();

    private LevelItem levelItem;

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_result);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        setTitle(R.string.m_add_results);

      initLevelsSpinner();
      initRecyclerView();

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStudentWithResultsList.size()>0)
                    onSave();
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
        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(LevelResultActivity.this,
                android.R.layout.simple_spinner_item, mLevelsList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mLevelSpinner.setAdapter(dataAdapter);

        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (mLevelSpinner.getSelectedItemPosition()>0) {
                    mStudentList.clear();
                    mStudentWithResultsList.clear();
                    mAdapter.notifyDataSetChanged();
                    getStudentsList();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    private void initRecyclerView() {

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv_attendance);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new StudentResultAdapter(this,mStudentWithResultsList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void getStudentsList() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this)).child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        levelItem=dataSnapshot.getValue(LevelItem.class);
                        if (levelItem.getStudents()!=null) {
                            mStudentList.addAll(levelItem.getStudents());
                            manageStudentWithAttendance();
                        }

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

    private void manageStudentWithAttendance() {
        for (int i=0;i<mStudentList.size();i++)
        {
            if (mStudentList.get(i).getStudentRes()==null)
            {
                setEmptyResult(i);
            }
            else
            {
                StudentWithResult studentWithResult = new StudentWithResult();
                studentWithResult.setId(mStudentList.get(i).getId());
                studentWithResult.setName(mStudentList.get(i).getName());
                studentWithResult.setResultItem(mStudentList.get(i).getStudentRes());
                mStudentWithResultsList.add(studentWithResult);
            }
        }

        mAdapter.notifyDataSetChanged();
    }

    private void setEmptyResult(int index) {
        StudentWithResult studentWithResult = new StudentWithResult();
        studentWithResult.setId(mStudentList.get(index).getId());
        studentWithResult.setName(mStudentList.get(index).getName());

        ResultItem resultItem = new ResultItem();

        TermItem termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.setfTerm(termItem);
        termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.setsTerm(termItem);
        termItem = new TermItem();
        termItem.setsSubGrade(-1);
        termItem.setfSubGrade(-1);
        resultItem.settTerm(termItem);
        resultItem.setTotalGrade(-1);
        studentWithResult.setResultItem(resultItem);

        mStudentWithResultsList.add(studentWithResult);
    }

    private void onSave()
    {
        for (int i=0;i<mStudentList.size();i++)
        {
            mStudentList.get(i).setStudentRes(mStudentWithResultsList.get(i).getResultItem());
        }

        //here save data to database
        add();
    }

    private void add() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(((Level)mLevelSpinner.getSelectedItem()).getLevelId());

        levelItem.setId(((Level)mLevelSpinner.getSelectedItem()).getLevelId());
        levelItem.setStudents(mStudentList);

        databaseReference.setValue(levelItem).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
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
