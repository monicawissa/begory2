package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.Utilities.UiManager;
import com.attendance.myproject.begory.Utilities.Utils;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {

    private ArrayList<Integer> mMenuList;
    private Activity mContext;

    public MenuAdapter(Activity context, ArrayList<Integer> menuList) {
        mMenuList = menuList;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public MenuAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_menu, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {
        holder.mTextView.setText(mMenuList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mMenuList.get(position))
                {
                    case R.string.a_lev_1:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_1);
                        break;
                    case R.string.a_lev_2:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_2);
                        break;
                    case R.string.a_lev_3:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_3);
                        break;
                    case R.string.a_lev_4:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_4);
                        break;
                    case R.string.a_lev_5:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_5);
                        break;
                    case R.string.a_lev_6:
                        UiManager.startLevelAttendanceActivity(mContext, FBConnenctions.CONST_LEVEL_6);
                        break;

                    case R.string.m_level_attendance:
                        UiManager.startShowLevelAttendanceActivity(mContext);
                        break;

                    case R.string.m_add_results:
                        UiManager.startLevelResultActivity(mContext);
                        break;

                    case R.string.m_show_results:
                        UiManager.startShowLevelResultActivity(mContext);
                        break;

                    case R.string.m_add_student:
                        UiManager.startAddStudentActivity(mContext);
                        break;
                    case R.string.m_edit_student:
                        UiManager.startEditStudentActivity(mContext);
                        break;
                    case R.string.m_add_admin:
                        UiManager.startAddAdminActivity(mContext);
                        break;
                    case R.string.m_add_level:
                        UiManager.startAddLevelActivity(mContext);
                        break;
                    case R.string.m_add_attendance:
                        UiManager.startAddAttendanceActivity(mContext);
                        break;
                    case R.string.m_student_generate_card:
                        UiManager.startQrCodeGeneratorActivity(mContext);
                        break;
                    case R.string.m_deactive_level:
                        UiManager.startDeactivateLevelActivity(mContext);
                        break;
                    case R.string.m_deactive_admin:
                        UiManager.startDeactivateAdminActivity(mContext);
                        break;
                    case R.string.m_student_attendance:
                        UiManager.startStudentAttendanceActivity(mContext);
                        break;
                    case R.string.m_student_list:
                        UiManager.startStudentListActivity(mContext);
                        break;
                    case R.string.m_signout:
                        Utils.saveKey(mContext,null);
                        UiManager.startPreLoginActivity(mContext);
                        mContext.finish();
                        break;
                }
            }
        });


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
