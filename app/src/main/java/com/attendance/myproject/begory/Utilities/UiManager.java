package com.attendance.myproject.begory.Utilities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.attendance.myproject.begory.activites.AddAdminActivity;
import com.attendance.myproject.begory.activites.EditStudentActivity;
import com.attendance.myproject.begory.activites.LevelResultActivity;
import com.attendance.myproject.begory.activites.ShowLevelResultActivity;
import com.attendance.myproject.begory.activites.oldactivities.AddAttendanceActivity;
import com.attendance.myproject.begory.activites.oldactivities.AddLevelActivity;
import com.attendance.myproject.begory.activites.AddStudentActivity;
import com.attendance.myproject.begory.activites.DeactivateAdminActivity;
import com.attendance.myproject.begory.activites.oldactivities.DeactivateLevelActivity;
import com.attendance.myproject.begory.activites.HomeActivity;
import com.attendance.myproject.begory.activites.LevelAttendanceActivity;
import com.attendance.myproject.begory.activites.LoginActivity;
import com.attendance.myproject.begory.activites.PreLoginActivity;
import com.attendance.myproject.begory.activites.oldactivities.QrCodeGeneratorActivity;
import com.attendance.myproject.begory.activites.oldactivities.QrCodeStationReaderActivity;
import com.attendance.myproject.begory.activites.ShowLevelAttendanceActivity;
import com.attendance.myproject.begory.activites.oldactivities.StudentAttendanceActivity;
import com.attendance.myproject.begory.activites.oldactivities.StudentListActivity;

public class UiManager {

    public static void startPreLoginActivity(Context context)
    {
        Intent mIntent = new Intent(context, PreLoginActivity.class);
        context.startActivity(mIntent);
    }

    public static void startLoginActivity(Context context)
    {
        Intent mIntent = new Intent(context, LoginActivity.class);
        context.startActivity(mIntent);
    }

    public static void startHomeActivity(Context context)
    {
        Intent mIntent = new Intent(context, HomeActivity.class);
        context.startActivity(mIntent);
    }

    public static void startAddStudentActivity(Context context)
    {
        Intent mIntent = new Intent(context, AddStudentActivity.class);
        context.startActivity(mIntent);
    }

    public static void startEditStudentActivity(Context context)
    {
        Intent mIntent = new Intent(context, EditStudentActivity.class);
        context.startActivity(mIntent);
    }

    public static void startAddAdminActivity(Context context)
    {
        Intent mIntent = new Intent(context, AddAdminActivity.class);
        context.startActivity(mIntent);
    }

    public static void startAddLevelActivity(Context context)
    {
        Intent mIntent = new Intent(context, AddLevelActivity.class);
        context.startActivity(mIntent);
    }

    public static void startAddAttendanceActivity(Context context)
    {
        Intent mIntent = new Intent(context, AddAttendanceActivity.class);
        context.startActivity(mIntent);
    }

    public static void startDeactivateLevelActivity(Context context)
    {
        Intent mIntent = new Intent(context, DeactivateLevelActivity.class);
        context.startActivity(mIntent);
    }

    public static void startDeactivateAdminActivity(Context context)
    {
        Intent mIntent = new Intent(context, DeactivateAdminActivity.class);
        context.startActivity(mIntent);
    }

    public static void openQrCodeReader(Activity context,int code)
    {
        Intent mIntent = new Intent(context, QrCodeStationReaderActivity.class);
        context.startActivityForResult(mIntent,code);
    }

    public static void startQrCodeGeneratorActivity(Context context)
    {
        Intent mIntent = new Intent(context, QrCodeGeneratorActivity.class);
        context.startActivity(mIntent);
    }

    public static void startStudentAttendanceActivity(Context context)
    {
        Intent mIntent = new Intent(context, StudentAttendanceActivity.class);
        context.startActivity(mIntent);
    }

    public static void startStudentListActivity(Context context)
    {
        Intent mIntent = new Intent(context, StudentListActivity.class);
        context.startActivity(mIntent);
    }

    public static void startLevelAttendanceActivity(Context context,String level)
    {
        Intent mIntent = new Intent(context, LevelAttendanceActivity.class);
        mIntent.putExtra("level",level);
        context.startActivity(mIntent);
    }

    public static void startShowLevelAttendanceActivity(Context context)
    {
        Intent mIntent = new Intent(context, ShowLevelAttendanceActivity.class);
        context.startActivity(mIntent);
    }

    public static void startLevelResultActivity(Context context)
    {
        Intent mIntent = new Intent(context, LevelResultActivity.class);
        context.startActivity(mIntent);
    }

    public static void startShowLevelResultActivity(Context context)
    {
        Intent mIntent = new Intent(context, ShowLevelResultActivity.class);
        context.startActivity(mIntent);
    }
}
