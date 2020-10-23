package com.attendance.myproject.begory.activites.oldactivities;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.AttendanceAdapter;
import com.attendance.myproject.begory.entites.Attendance;
import com.attendance.myproject.begory.entites.Level;
import com.attendance.myproject.begory.entites.Student;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import static com.attendance.myproject.begory.Utilities.FBConnenctions.CONST_ATTENDANCE;

public class StudentAttendanceActivity extends AppCompatActivity {

    private Spinner mStudentSpinner;
    private ArrayList<Student> mStudentList = new ArrayList<>();

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();

    private AttendanceAdapter mAdapter;
    private ArrayList<Attendance> mAttendanceList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendance);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        setTitle(R.string.m_student_attendance);
        initRecyclerView();
        initStudentSpinner();
        initLevelsSpinner();

    }

    private void initRecyclerView() {

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv_attendance);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new AttendanceAdapter(this,mAttendanceList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initStudentSpinner() {

        mStudentSpinner = (Spinner) findViewById(R.id.sp_student);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Iterable<DataSnapshot> children = dataSnapshot.child(FBConnenctions.CONST_STUDENTS).getChildren();
                        for (DataSnapshot child : children) {

                            Student std1=child.getValue(Student.class);
                            mStudentList.add(std1);
                        }

                        ArrayAdapter<Student> dataAdapter = new ArrayAdapter<Student>(StudentAttendanceActivity.this,
                                android.R.layout.simple_spinner_item, mStudentList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mStudentSpinner.setAdapter(dataAdapter);

                        mStudentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                                getStudentAttendance();
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });

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

    private void initLevelsSpinner() {

        mLevelSpinner = (Spinner) findViewById(R.id.sp_levels);

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));

            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    try {

                        findViewById(R.id.progressBar).setVisibility(View.GONE);
                        Iterable<DataSnapshot> children = dataSnapshot.child(FBConnenctions.CONST_LEVELS).getChildren();
                        for (DataSnapshot child : children) {

                            Level std1=child.getValue(Level.class);

                            if (std1.isLevelActive())
                                mLevelsList.add(std1);
                        }

                        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(StudentAttendanceActivity.this,
                                android.R.layout.simple_spinner_item, mLevelsList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mLevelSpinner.setAdapter(dataAdapter);

                        mLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });


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

    private void getStudentAttendance() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        mAttendanceList.clear();
        mAdapter.notifyDataSetChanged();

        final FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this));
        Query query = databaseReference.child(CONST_ATTENDANCE).orderByChild("studentId").equalTo(mStudentList.get(mStudentSpinner.getSelectedItemPosition()).getStudentId()); //get attendance where studentId = 1000
        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                findViewById(R.id.progressBar).setVisibility(View.GONE);
                try {
                    Iterable<DataSnapshot> children = dataSnapshot.getChildren();
                    for (DataSnapshot child : children) {

                        Attendance attendance=child.getValue(Attendance.class);

                        if (attendance.getLevelId().equals(mLevelsList.get(mLevelSpinner.getSelectedItemPosition()).getLevelId()))
                        {
                            mAttendanceList.add(attendance);
                        }
                    }

                    mAdapter.notifyDataSetChanged();

                } catch (Exception e) {
                    Log.e("Exception is", e.toString());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                findViewById(R.id.progressBar).setVisibility(View.GONE);
            }
        });
    }

}
