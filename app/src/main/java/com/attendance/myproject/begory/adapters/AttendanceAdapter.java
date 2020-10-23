package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.entites.Attendance;

import java.util.ArrayList;

public class AttendanceAdapter extends RecyclerView.Adapter<AttendanceAdapter.MyViewHolder> {

    private ArrayList<Attendance> mMenuList;
    private Activity mContext;

    public AttendanceAdapter(Activity context, ArrayList<Attendance> menuList) {
        mMenuList = menuList;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public AttendanceAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_attendance, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {

        Attendance attendance = mMenuList.get(position);
        holder.mTextView.setText(attendance.getDate());

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);
        }
    }
}
