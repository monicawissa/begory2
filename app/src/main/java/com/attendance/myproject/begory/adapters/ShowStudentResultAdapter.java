package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.beans.ResultItem;
import com.attendance.myproject.begory.beans.StudentWithResult;
import com.attendance.myproject.begory.beans.TermItem;

import java.util.ArrayList;

public class ShowStudentResultAdapter extends RecyclerView.Adapter<ShowStudentResultAdapter.MyViewHolder> {

    private ArrayList<StudentWithResult> mMenuList;
    private Activity mContext;

    public ShowStudentResultAdapter(Activity context, ArrayList<StudentWithResult> menuList) {
        mMenuList = menuList;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public ShowStudentResultAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                    int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_show_result, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final StudentWithResult studentWithResult = mMenuList.get(position);
        holder.mTextView.setText(studentWithResult.getName());

        ResultItem resultItem = studentWithResult.getResultItem();

        TermItem mTerm1 = resultItem.getfTerm();
        TermItem mTerm2 = resultItem.getsTerm();
        TermItem mTerm3 = resultItem.gettTerm();


        if (mTerm2.getfSubGrade() == -1 && mTerm2.getsSubGrade() == -1) {
            holder.itemView.findViewById(R.id.v_div1).setVisibility(View.GONE);
        } else {
            holder.itemView.findViewById(R.id.v_div1).setVisibility(View.VISIBLE);
        }


        switch (resultItem.getTotalGrade()) {
            case FBConnenctions.CONST_GRADE_FEAR:
                holder.mTotalGradeTextView.setText(mContext.getString(R.string.total_grade) + " : " +
                        mContext.getString(R.string.t_fear));
                break;
            case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                holder.mTotalGradeTextView.setText(mContext.getString(R.string.total_grade) + " : " +
                        mContext.getString(R.string.t_acceptable));
                break;
            case FBConnenctions.CONST_GRADE_GOOD:
                holder.mTotalGradeTextView.setText(mContext.getString(R.string.total_grade) + " : " +
                        mContext.getString(R.string.t_good));
                break;
            case FBConnenctions.CONST_GRADE_VERY_GOOD:
                holder.mTotalGradeTextView.setText(mContext.getString(R.string.total_grade) + " : " +
                        mContext.getString(R.string.t_very_good));
                break;
            case FBConnenctions.CONST_GRADE_EXCELLENT:
                holder.mTotalGradeTextView.setText(mContext.getString(R.string.total_grade) + " : " +
                        mContext.getString(R.string.t_excellent));
                break;
        }

        if (mTerm1.getfSubGrade() != -1 || mTerm1.getsSubGrade() != -1  || mTerm2.getfSubGrade() != -1
    || mTerm2.getsSubGrade() != -1 || mTerm3.getfSubGrade() != -1 || mTerm3.getsSubGrade() != -1)
        {
            holder.mTotalGradeTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            holder.mTotalGradeTextView.setVisibility(View.INVISIBLE);
        }


        if (mTerm1.getfSubGrade() != -1) {
            holder.mTerm1Sub1TextView.setVisibility(View.VISIBLE);
            switch (mTerm1.getfSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm1Sub1TextView.setText(mContext.getString(R.string.term1_sub1) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm1Sub1TextView.setText(mContext.getString(R.string.term1_sub1) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm1Sub1TextView.setText(mContext.getString(R.string.term1_sub1) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm1Sub1TextView.setText(mContext.getString(R.string.term1_sub1) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm1Sub1TextView.setText(mContext.getString(R.string.term1_sub1) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm1Sub1TextView.setVisibility(View.GONE);

        if (mTerm1.getsSubGrade() != -1) {
            holder.mTerm1Sub2TextView.setVisibility(View.VISIBLE);
            switch (mTerm1.getsSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm1Sub2TextView.setText(mContext.getString(R.string.term1_sub2) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm1Sub2TextView.setText(mContext.getString(R.string.term1_sub2) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm1Sub2TextView.setText(mContext.getString(R.string.term1_sub2) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm1Sub2TextView.setText(mContext.getString(R.string.term1_sub2) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm1Sub2TextView.setText(mContext.getString(R.string.term1_sub2) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm1Sub2TextView.setVisibility(View.GONE);

        if (mTerm2.getfSubGrade() != -1) {
            holder.mTerm2Sub1TextView.setVisibility(View.VISIBLE);
            switch (mTerm2.getfSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm2Sub1TextView.setText(mContext.getString(R.string.term2_sub1) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm2Sub1TextView.setText(mContext.getString(R.string.term2_sub1) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm2Sub1TextView.setText(mContext.getString(R.string.term2_sub1) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm2Sub1TextView.setText(mContext.getString(R.string.term2_sub1) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm2Sub1TextView.setText(mContext.getString(R.string.term2_sub1) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm2Sub1TextView.setVisibility(View.GONE);

        if (mTerm2.getsSubGrade() != -1) {
            holder.mTerm2Sub2TextView.setVisibility(View.VISIBLE);
            switch (mTerm2.getsSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm2Sub2TextView.setText(mContext.getString(R.string.term2_sub2) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm2Sub2TextView.setText(mContext.getString(R.string.term2_sub2) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm2Sub2TextView.setText(mContext.getString(R.string.term2_sub2) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm2Sub2TextView.setText(mContext.getString(R.string.term2_sub2) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm2Sub2TextView.setText(mContext.getString(R.string.term2_sub2) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm2Sub2TextView.setVisibility(View.GONE);

        if (mTerm3.getfSubGrade() != -1) {
            holder.mTerm3Sub1TextView.setVisibility(View.VISIBLE);
            switch (mTerm3.getfSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm3Sub1TextView.setText(mContext.getString(R.string.term3_sub1) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm3Sub1TextView.setText(mContext.getString(R.string.term3_sub1) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm3Sub1TextView.setText(mContext.getString(R.string.term3_sub1) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm3Sub1TextView.setText(mContext.getString(R.string.term3_sub1) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm3Sub1TextView.setText(mContext.getString(R.string.term3_sub1) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm3Sub1TextView.setVisibility(View.GONE);


        if (mTerm3.getsSubGrade() != -1) {
            holder.mTerm3Sub2TextView.setVisibility(View.VISIBLE);
            switch (mTerm3.getsSubGrade()) {
                case FBConnenctions.CONST_GRADE_FEAR:
                    holder.mTerm3Sub2TextView.setText(mContext.getString(R.string.term3_sub2) + " : " +mContext.getString(R.string.t_fear));
                    break;
                case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                    holder.mTerm3Sub2TextView.setText(mContext.getString(R.string.term3_sub2) + " : " +mContext.getString(R.string.t_acceptable));
                    break;
                case FBConnenctions.CONST_GRADE_GOOD:
                    holder.mTerm3Sub2TextView.setText(mContext.getString(R.string.term3_sub2) + " : " +mContext.getString(R.string.t_good));
                    break;
                case FBConnenctions.CONST_GRADE_VERY_GOOD:
                    holder.mTerm3Sub2TextView.setText(mContext.getString(R.string.term3_sub2) + " : " +mContext.getString(R.string.t_very_good));
                    break;
                case FBConnenctions.CONST_GRADE_EXCELLENT:
                    holder.mTerm3Sub2TextView.setText(mContext.getString(R.string.term3_sub2) + " : " +mContext.getString(R.string.t_excellent));
                    break;
            }
        }
        else
            holder.mTerm3Sub2TextView.setVisibility(View.GONE);


    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public TextView mTotalGradeTextView;

        public TextView mTerm1Sub1TextView;
        public TextView mTerm1Sub2TextView;
        public TextView mTerm2Sub1TextView;
        public TextView mTerm2Sub2TextView;
        public TextView mTerm3Sub1TextView;
        public TextView mTerm3Sub2TextView;

        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);
            mTotalGradeTextView = v.findViewById(R.id.tv_total_grade);

            mTerm1Sub1TextView = v.findViewById(R.id.tv_term1_sub1);
            mTerm1Sub2TextView = v.findViewById(R.id.tv_term1_sub2);

            mTerm2Sub1TextView = v.findViewById(R.id.tv_term2_sub1);
            mTerm2Sub2TextView = v.findViewById(R.id.tv_term2_sub2);

            mTerm3Sub1TextView = v.findViewById(R.id.tv_term3_sub1);
            mTerm3Sub2TextView = v.findViewById(R.id.tv_term3_sub2);

        }
    }
}
