package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.beans.StudentWithAttendance;

import java.util.ArrayList;

public class StudentAttendanceAdapter extends RecyclerView.Adapter<StudentAttendanceAdapter.MyViewHolder> {

    private ArrayList<StudentWithAttendance> mMenuList;
    private Activity mContext;

    public StudentAttendanceAdapter(Activity context, ArrayList<StudentWithAttendance> menuList) {
        mMenuList = menuList;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public StudentAttendanceAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                    int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_attendance, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {

        if (position%2==0)
            holder.itemView.setBackgroundColor(Color.parseColor("#aacdcdcd"));
        else
            holder.itemView.setBackgroundColor(Color.parseColor("#aaffffff"));

        final StudentWithAttendance attendance = mMenuList.get(position);
        holder.mTextView.setText(attendance.getName());

        if (attendance.getAttendance().isHesa())
        {
            holder.mHesaCheckBox.setOnCheckedChangeListener (null);
            holder.mHesaCheckBox.setChecked(true);
        }
        else
        {
            holder.mHesaCheckBox.setOnCheckedChangeListener (null);
            holder.mHesaCheckBox.setChecked(false);
        }

        if (attendance.getAttendance().isAlhan())
        {
            holder.mKodasCheckBox.setOnCheckedChangeListener (null);
            holder.mKodasCheckBox.setChecked(true);
        }
        else
        {
            holder.mKodasCheckBox.setOnCheckedChangeListener (null);
            holder.mKodasCheckBox.setChecked(false);
        }

        holder.mHesaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mMenuList.get(position).getAttendance().setHesa(b);
                notifyDataSetChanged();
            }
        });

        holder.mKodasCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mMenuList.get(position).getAttendance().setAlhan(b);
                notifyDataSetChanged();
            }
        });
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public CheckBox mKodasCheckBox;
        public CheckBox mHesaCheckBox;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);
            mKodasCheckBox = v.findViewById(R.id.cb_kodas);
            mHesaCheckBox = v.findViewById(R.id.cb_hesa);
        }
    }
}
