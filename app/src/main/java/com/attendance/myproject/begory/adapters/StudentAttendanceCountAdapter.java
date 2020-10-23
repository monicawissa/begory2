package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.beans.StudentWithTotalAttendanceCount;

import java.util.ArrayList;

public class StudentAttendanceCountAdapter extends RecyclerView.Adapter<StudentAttendanceCountAdapter.MyViewHolder> {

    private ArrayList<StudentWithTotalAttendanceCount> mMenuList;
    private Activity mContext;

    private CheckBox mTerm1CheckBox,mTerm2CheckBox,mTerm3CheckBox;

    public StudentAttendanceCountAdapter(Activity context, ArrayList<StudentWithTotalAttendanceCount> menuList,
                                          CheckBox mTerm1CheckBox,CheckBox mTerm2CheckBox,CheckBox mTerm3CheckBox) {
        mMenuList = menuList;
        this.mContext = context;
        this.mTerm1CheckBox = mTerm1CheckBox;
        this.mTerm2CheckBox = mTerm2CheckBox;
        this.mTerm3CheckBox = mTerm3CheckBox;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public StudentAttendanceCountAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                         int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_attendance_count, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {

        if (position%2==0)
            holder.itemView.setBackgroundColor(Color.parseColor("#aacdcdcd"));
        else
            holder.itemView.setBackgroundColor(Color.parseColor("#aaffffff"));

        final StudentWithTotalAttendanceCount attendance = mMenuList.get(position);
        holder.mTextView.setText(attendance.getName());

        int  totalKodas = 0;
        int totalHesa = 0;
        int attendanceTotalKodas = 0;
        int attendanceTotalHesa = 0;

        if (mTerm1CheckBox.isChecked())
        {
            totalHesa += attendance.getHesaTotalCountTerm1();
            totalKodas += attendance.getKodasTotalCountTerm1();

            attendanceTotalHesa += attendance.getHesaAttendanceTotalCountTerm1();
            attendanceTotalKodas += attendance.getKodasAttendanceTotalCountTerm1();
        }

        if (mTerm2CheckBox.isChecked())
        {
            totalHesa += attendance.getHesaTotalCountTerm2();
            totalKodas += attendance.getKodasTotalCountTerm2();

            attendanceTotalHesa += attendance.getHesaAttendanceTotalCountTerm2();
            attendanceTotalKodas += attendance.getKodasAttendanceTotalCountTerm2();
        }

        if (mTerm3CheckBox.isChecked())
        {
            totalHesa += attendance.getHesaTotalCountTerm3();
            totalKodas += attendance.getKodasTotalCountTerm3();

            attendanceTotalHesa += attendance.getHesaAttendanceTotalCountTerm3();
            attendanceTotalKodas += attendance.getKodasAttendanceTotalCountTerm3();
        }

        holder.mHesaTextView.setText(totalHesa+"/"+attendanceTotalHesa);
        holder.mKodasTextView.setText(totalKodas+"/"+attendanceTotalKodas);

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public TextView mKodasTextView;
        public TextView mHesaTextView;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);
            mKodasTextView = v.findViewById(R.id.tv_kodas);
            mHesaTextView = v.findViewById(R.id.tv_hesa);
        }
    }
}
