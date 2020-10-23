package com.attendance.myproject.begory.activites.oldactivities;

import android.Manifest;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.UiManager;
import com.attendance.myproject.begory.Utilities.Utils;
import com.attendance.myproject.begory.entites.Attendance;
import com.attendance.myproject.begory.entites.Level;
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

import static com.attendance.myproject.begory.Utilities.FBConnenctions.CONST_ATTENDANCE;

public class AddAttendanceActivity extends AppCompatActivity {

    private Spinner mLevelSpinner;
    private ArrayList<Level> mLevelsList = new ArrayList<>();
    private Calendar myCalendar;
    private EditText mDateEditText;
    private EditText mIdEditText;

    private CheckBox mAddDirectlyCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_attendance);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });

        initLevelsSpinner();


        myCalendar = Calendar.getInstance();


        mAddDirectlyCheckBox = (CheckBox) findViewById(R.id.cb_is_add_direct);
        mDateEditText= (EditText) findViewById(R.id.et_date);
        mIdEditText = (EditText) findViewById(R.id.et_student_id);

        updateLabel();
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
                // TODO Auto-generated method stub
                new DatePickerDialog(AddAttendanceActivity.this, date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        findViewById(R.id.btn_read_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkCameraPermission();
            }
        });
    }

    private void updateLabel() {
        String myFormat = "dd/MM/YYYY"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        mDateEditText.setText(sdf.format(myCalendar.getTime()));
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

                        ArrayAdapter<Level> dataAdapter = new ArrayAdapter<Level>(AddAttendanceActivity.this,
                                android.R.layout.simple_spinner_item, mLevelsList);
                        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        mLevelSpinner.setAdapter(dataAdapter);

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

    private void add() {




        if (TextUtils.isEmpty(mIdEditText.getText().toString())) {
            Toast.makeText(getApplicationContext(), R.string.fill_data, Toast.LENGTH_SHORT).show();
            return;
        }

        if (mLevelsList.size() == 0) {
            Toast.makeText(getApplicationContext(), R.string.choose_level, Toast.LENGTH_SHORT).show();
            return;
        }

        Utils.hideKeyboard(this);

        final Attendance attendance = new Attendance();
        attendance.setStudentId(mIdEditText.getText().toString());
        attendance.setAdminId(Utils.getAdmin(this).getAdminId());
        attendance.setLevelId(mLevelsList.get(mLevelSpinner.getSelectedItemPosition()).getLevelId());
        attendance.setAttendanceDate(myCalendar.getTimeInMillis()+"");
        attendance.setDate(mDateEditText.getText().toString());

        findViewById(R.id.progressBar).setVisibility(View.VISIBLE);

        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child(Utils.getKey(this));
        DatabaseReference attendanceDatabaseReference = mDatabase.child(CONST_ATTENDANCE);

        String key = attendanceDatabaseReference.push().getKey();

        attendance.setId(key);
        attendanceDatabaseReference.child(key).setValue(attendance).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                // Write was successful!
                // ...
                findViewById(R.id.progressBar).setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(), R.string.added, Toast.LENGTH_SHORT).show();
                mIdEditText.setText("");
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


    private void checkCameraPermission()
    {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {

            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {
                // Should we show an explanation?
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CAMERA},
                        1006);
            } else {
                UiManager.openQrCodeReader(this, 1002);
            }
        }
        else
            UiManager.openQrCodeReader(this, 1002);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 1006:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission Granted
                    UiManager.openQrCodeReader(this, 1002);
                } else {
                    // Permission Denied
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1002) {
            if(resultCode == Activity.RESULT_OK){
                String studentId=data.getStringExtra("Id");
                //Utils.showToast(getActivity(),stationId);
                mIdEditText.setText(studentId);

                if (mAddDirectlyCheckBox.isChecked())
                    add();
            }
        }
    }
}
