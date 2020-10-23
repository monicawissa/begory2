package com.attendance.myproject.begory.activites.oldactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.entites.Admin;

public class AddNewStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_student);

        //Get All Students
        FBConnenctions.getStudents(this);


        //Get specific Student info using studentId
        //FBConnenctions.getStudentInfo(this,"1000");

        //Add Level
        /*Level level = new Level();
        level.setLevelId("2");
        level.setLevelName("Level2");
        level.setLevelYear("2018");
        FBConnenctions.addLevel(this,level);*/

        //Get All Levels
        //FBConnenctions.getLevels();

        //Add Attendance
        /*Attendance attendance = new Attendance();
        attendance.setAdminId("1");
        attendance.setStudentId("999");
        attendance.setLevelId("2");
        attendance.setAttendanceDate(Calendar.getInstance().getTimeInMillis()+"");
        FBConnenctions.addAttendance(this,attendance);*/

       //Get allaendance
       // FBConnenctions.getAttendance();

        //FBConnenctions.getSpecificAttendanceInfoByStudentId(this,"999");

       // FBConnenctions.getSpecificAttendanceInfoByLevelId(this,"1");

        //addMainAdmin();
        //addSubAdmin();

        //Deactivate Admin
        /*Admin admin = new Admin();
        admin.setMainAdmin(false);
        admin.setAdminName("Tony");
        admin.setAdminPassword("12345678");
        admin.setAccountActive(false);
        admin.setAdminId("-LMbwQs6f91INj3eohCc");
        FBConnenctions.deactivateAdmin(this,admin.getAdminId(),admin);*/

       // FBConnenctions.getAllAdmins();
    }

    private void addMainAdmin()
    {
        Admin admin = new Admin();
        admin.setMainAdmin(true);
        admin.setAdminName("Beshoy");
        admin.setAdminPassword("12345678");
        admin.setAccountActive(true);

        FBConnenctions.addAdmin(this,admin);
    }

    private void addSubAdmin()
    {
        Admin admin = new Admin();
        admin.setMainAdmin(false);
        admin.setAdminName("Tony");
        admin.setAdminPassword("12345678");
        admin.setAccountActive(false);

        FBConnenctions.addAdmin(this,admin);
    }
}
