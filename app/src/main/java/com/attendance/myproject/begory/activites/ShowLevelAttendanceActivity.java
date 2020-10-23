package com.attendance.myproject.begory.activites;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.StudentAttendanceCountAdapter;
import com.attendance.myproject.begory.beans.AttendanceItem;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.beans.StudentWithTotalAttendanceCount;
import com.attendance.myproject.begory.entites.Admin;
import com.attendance.myproject.begory.entites.Level;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class ShowLevelAttendanceActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ArrayList<StudentItem> mStudentList = new ArrayList<>();

    private StudentAttendanceCountAdapter mAdapter;
    private ArrayList<StudentWithTotalAttendanceCount> mStudentAttendancesList = new ArrayList<>();

    private LevelItem levelItem;

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();

    private CheckBox mTerm1CheckBox,mTerm2CheckBox,mTerm3CheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_level_attendance);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        setTitle(R.string.m_level_attendance);

        mTerm1CheckBox = findViewById(R.id.cb_term1);
        mTerm2CheckBox = findViewById(R.id.cb_term2);
        mTerm3CheckBox = findViewById(R.id.cb_term3);
        mTerm1CheckBox.setOnCheckedChangeListener(this);
        mTerm2CheckBox.setOnCheckedChangeListener(this);
        mTerm3CheckBox.setOnCheckedChangeListener(this);

        initRecyclerView();
        initLevelsSpinner();
    }

    private void initLevelsSpinner() {

        Level level = new Level();
        level.setLevelId("-1");
        level.setLevelName(getString(R.string.choose_level));
        mLevelsList.add(level);

        Admin mAdmin = Utils.getAdmin(this);
        if (mAdmin.isMainAdmin()) {

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

        }
        else
        {
            if (mAdmin.getLevels()!=null)
            {
                for (int i=0;i<mAdmin.getLevels().size();i++)
                {
                    if (mAdmin.getLevels().get(i).isSelected())
                    {
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_1))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_1);
                            level.setLevelName(getString(R.string.lev_1));
                            mLevelsList.add(level);
                        }
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_2))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_2);
                            level.setLevelName(getString(R.string.lev_2));
                            mLevelsList.add(level);
                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_3))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_3);
                            level.setLevelName(getString(R.string.lev_3));
                            mLevelsList.add(level);

                        }
                        if (mAdmin.getLevels().get(i).getId().equals(FBConnenctions.CONST_LEVEL_4))
                        {

                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_4);
                            level.setLevelName(getString(R.string.lev_4));
                            mLevelsList.add(level);

                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_5))
                        {

                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_5);
                            level.setLevelName(getString(R.string.lev_5));
                            mLevelsList.add(level);


                        }
                        if (mAdmin.getLevels().get(i).getId().equals( FBConnenctions.CONST_LEVEL_6))
                        {
                            level = new Level();
                            level.setLevelId(FBConnenctions.CONST_LEVEL_6);
                            level.setLevelName(getString(R.string.lev_6));
                            mLevelsList.add(level);
                        }
                    }
                }
            }
        }

        mLevelSpinner = (Spinner) findViewById(R.id.sp_levels);
        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(ShowLevelAttendanceActivity.this,
                android.R.layout.simple_spinner_item, mLevelsList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mLevelSpinner.setAdapter(dataAdapter);

        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (mLevelSpinner.getSelectedItemPosition()>0) {
                    mStudentList.clear();
                    mStudentAttendancesList.clear();
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

        mAdapter = new StudentAttendanceCountAdapter(this,mStudentAttendancesList,mTerm1CheckBox,mTerm2CheckBox,mTerm3CheckBox);
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
            StudentWithTotalAttendanceCount studentWithAttendance = new StudentWithTotalAttendanceCount();
            studentWithAttendance.setId(mStudentList.get(i).getId());
            studentWithAttendance.setName(mStudentList.get(i).getName());
            if (mStudentList.get(i).getAttendanceItems()==null || mStudentList.get(i).getAttendanceItems().size()==0)
            {
                studentWithAttendance.setHesaAttendanceTotalCountTerm1(0);
                studentWithAttendance.setHesaAttendanceTotalCountTerm2(0);
                studentWithAttendance.setHesaAttendanceTotalCountTerm3(0);
                studentWithAttendance.setKodasAttendanceTotalCountTerm1(0);
                studentWithAttendance.setKodasAttendanceTotalCountTerm2(0);
                studentWithAttendance.setKodasAttendanceTotalCountTerm3(0);

                studentWithAttendance.setHesaTotalCountTerm1(0);
                studentWithAttendance.setHesaTotalCountTerm2(0);
                studentWithAttendance.setHesaTotalCountTerm3(0);
                studentWithAttendance.setKodasTotalCountTerm1(0);
                studentWithAttendance.setKodasTotalCountTerm2(0);
                studentWithAttendance.setKodasTotalCountTerm3(0);
            }
            else
            {
                for (int n=0;n<mStudentList.get(i).getAttendanceItems().size();n++)
                {
                    AttendanceItem attendanceItem = mStudentList.get(i).getAttendanceItems().get(n);
                    if (attendanceItem.getTermId() == 1)
                    {
                        studentWithAttendance.setHesaTotalCountTerm1(studentWithAttendance.getHesaTotalCountTerm1()+1);
                        studentWithAttendance.setKodasTotalCountTerm1(studentWithAttendance.getKodasTotalCountTerm1()+1);

                        if (attendanceItem.isAlhan())
                            studentWithAttendance.setKodasAttendanceTotalCountTerm1(studentWithAttendance.getKodasAttendanceTotalCountTerm1()+1);

                        if (attendanceItem.isHesa())
                            studentWithAttendance.setHesaAttendanceTotalCountTerm1(studentWithAttendance.getHesaAttendanceTotalCountTerm1()+1);
                    }
                    else if (attendanceItem.getTermId() == 2)
                    {
                        studentWithAttendance.setHesaTotalCountTerm2(studentWithAttendance.getHesaTotalCountTerm2()+1);
                        studentWithAttendance.setKodasTotalCountTerm2(studentWithAttendance.getKodasTotalCountTerm2()+1);

                        if (attendanceItem.isAlhan())
                            studentWithAttendance.setKodasAttendanceTotalCountTerm2(studentWithAttendance.getKodasAttendanceTotalCountTerm2()+1);

                        if (attendanceItem.isHesa())
                            studentWithAttendance.setHesaAttendanceTotalCountTerm2(studentWithAttendance.getHesaAttendanceTotalCountTerm2()+1);
                    }
                    else
                    {
                        studentWithAttendance.setHesaTotalCountTerm3(studentWithAttendance.getHesaTotalCountTerm3()+1);
                        studentWithAttendance.setKodasTotalCountTerm3(studentWithAttendance.getKodasTotalCountTerm3()+1);

                        if (attendanceItem.isAlhan())
                            studentWithAttendance.setKodasAttendanceTotalCountTerm3(studentWithAttendance.getKodasAttendanceTotalCountTerm3()+1);

                        if (attendanceItem.isHesa())
                            studentWithAttendance.setHesaAttendanceTotalCountTerm3(studentWithAttendance.getHesaAttendanceTotalCountTerm3()+1);
                    }
                }
            }

            mStudentAttendancesList.add(studentWithAttendance);
        }

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        mAdapter.notifyDataSetChanged();
    }
}
