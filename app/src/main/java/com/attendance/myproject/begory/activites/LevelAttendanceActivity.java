package com.attendance.myproject.begory.activites;

import android.app.DatePickerDialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.adapters.StudentAttendanceAdapter;
import com.attendance.myproject.begory.beans.AttendanceItem;
import com.attendance.myproject.begory.beans.LevelItem;
import com.attendance.myproject.begory.beans.StudentItem;
import com.attendance.myproject.begory.beans.StudentWithAttendance;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;


public class LevelAttendanceActivity extends AppCompatActivity {

    private ArrayList<StudentItem> mStudentList = new ArrayList<>();

    private StudentAttendanceAdapter mAdapter;
    private ArrayList<StudentWithAttendance> mStudentAttendancesList = new ArrayList<>();

    private String mSelectedDate;
    private int mSelectedTermId = 0;
    private LevelItem levelItem;

    private Calendar myCalendar;
    private EditText mDateEditText;
    private RadioGroup mTermsRadioGroup;
    private String mLevelKey = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_attendance);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        String level = getIntent().getStringExtra("level");
        mLevelKey = level;
        screenTitle(level);

        initRecyclerView();

        myCalendar = Calendar.getInstance();

        mTermsRadioGroup = findViewById(R.id.rg_terms);
        mDateEditText= (EditText) findViewById(R.id.et_date);

        final  DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
                // TODO Auto-generated method stub
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, monthOfYear);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }

        };

        mDateEditText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mSelectedTermId ==0)
                {
                    Toast.makeText(getApplicationContext(),R.string.choose_term,Toast.LENGTH_LONG).show();
                    return;
                }
                new DatePickerDialog(LevelAttendanceActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        mTermsRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if (id == R.id.rb_term1)
                    mSelectedTermId = 1;
                else  if (id == R.id.rb_term2)
                    mSelectedTermId = 2;
               else
                    mSelectedTermId = 3;
            }
        });


        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mSelectedDate!=null && mSelectedTermId>0 && mStudentAttendancesList.size()>0)
                onSave();
            }
        });
    }

    private void screenTitle(String level) {
        if (level.equals(FBConnenctions.CONST_LEVEL_1))
        {
            setTitle(R.string.a_lev_1);
        }
        else  if (level.equals(FBConnenctions.CONST_LEVEL_2))
        {
            setTitle(R.string.a_lev_2);
        }
        else  if (level.equals(FBConnenctions.CONST_LEVEL_3))
        {
            setTitle(R.string.a_lev_3);
        }
        else  if (level.equals(FBConnenctions.CONST_LEVEL_4))
        {
            setTitle(R.string.a_lev_4);
        }
        else  if (level.equals(FBConnenctions.CONST_LEVEL_5))
        {
            setTitle(R.string.a_lev_5);
        }
        else if (level.equals(FBConnenctions.CONST_LEVEL_6))
        {
            setTitle(R.string.a_lev_6);
        }
    }

    private void updateLabel() {
        String myFormat = "dd-MM-YYYY"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        mDateEditText.setText(sdf.format(myCalendar.getTime()));
        mSelectedDate = mDateEditText.getText().toString();

        mStudentList.clear();
        mStudentAttendancesList.clear();
        mAdapter.notifyDataSetChanged();

        for(int i = 0; i < mTermsRadioGroup.getChildCount(); i++){
            ((RadioButton)mTermsRadioGroup.getChildAt(i)).setEnabled(false);
        }

        getStudentsList();
    }

    private void initRecyclerView() {

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rv_attendance);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,1);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new StudentAttendanceAdapter(this,mStudentAttendancesList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void getStudentsList() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);
        try{
            final FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference databaseReference=database.getReference().child(Utils.getKey(this)).child(mLevelKey);

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
            if (mStudentList.get(i).getAttendanceItems()==null || mStudentList.get(i).getAttendanceItems().size()==0)
            {
                setEmptyAttendance(i);
            }
            else
            {
                boolean found = false;
                for (int n=0;n< mStudentList.get(i).getAttendanceItems().size();n++)
                {
                    if (mSelectedDate.equals(mStudentList.get(i).getAttendanceItems().get(n).getDate()))
                    {
                        found = true;
                        StudentWithAttendance studentWithAttendance = new StudentWithAttendance();
                        studentWithAttendance.setId(mStudentList.get(i).getId());
                        studentWithAttendance.setName(mStudentList.get(i).getName());
                        studentWithAttendance.setAttendance(mStudentList.get(i).getAttendanceItems().get(n));
                        mStudentAttendancesList.add(studentWithAttendance);
                        break;
                    }
                }
                if (!found)
                {
                    setEmptyAttendance(i);
                }
            }
        }

        mAdapter.notifyDataSetChanged();
    }

    private void setEmptyAttendance(int index) {
        StudentWithAttendance studentWithAttendance = new StudentWithAttendance();
        studentWithAttendance.setId(mStudentList.get(index).getId());
        studentWithAttendance.setName(mStudentList.get(index).getName());
        AttendanceItem attendanceItem = new AttendanceItem();
        attendanceItem.setDate(mSelectedDate);
        attendanceItem.setAlhan(false);
        attendanceItem.setHesa(false);
        attendanceItem.setTermId(mSelectedTermId);
        studentWithAttendance.setAttendance(attendanceItem);
        mStudentAttendancesList.add(studentWithAttendance);
    }

    private void onSave()
    {
        for (int i=0;i<mStudentList.size();i++)
        {
            if (mStudentList.get(i).getAttendanceItems()==null || mStudentList.get(i).getAttendanceItems().size()==0)
            {
                ArrayList<AttendanceItem> attendanceItems = new ArrayList<>();
                attendanceItems.add(mStudentAttendancesList.get(i).getAttendance());
                mStudentList.get(i).setAttendanceItems(attendanceItems);
            }
            else
            {
                boolean found = false;
                for (int n=0;n< mStudentList.get(i).getAttendanceItems().size();n++)
                {
                    if (mSelectedDate.equals(mStudentList.get(i).getAttendanceItems().get(n).getDate()))
                    {
                        found = true;
                        mStudentList.get(i).getAttendanceItems().set(n,mStudentAttendancesList.get(i).getAttendance());
                        break;
                    }
                }
                if (!found)
                {
                    mStudentList.get(i).getAttendanceItems().add(mStudentAttendancesList.get(i).getAttendance());
                }
            }
        }

        //here save data to database
        add();
    }

    private void add() {

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));

        DatabaseReference databaseReference = mDatabase.child(mLevelKey);

        levelItem.setId(mLevelKey);
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
