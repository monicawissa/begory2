package com.attendance.myproject.begory.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.attendance.myproject.begory.R;
import com.attendance.myproject.begory.Utilities.FBConnenctions;
import com.attendance.myproject.begory.beans.ResultItem;
import com.attendance.myproject.begory.beans.StudentWithResult;
import com.attendance.myproject.begory.beans.TermItem;

import java.util.ArrayList;

public class StudentResultAdapter extends RecyclerView.Adapter<StudentResultAdapter.MyViewHolder> {

    private ArrayList<StudentWithResult> mMenuList;
    private Activity mContext;

    public StudentResultAdapter(Activity context, ArrayList<StudentWithResult> menuList) {
        mMenuList = menuList;
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mMenuList.size();
    }

    @Override
    public StudentResultAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                                int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_result, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,final int position) {

        final StudentWithResult studentWithResult = mMenuList.get(position);
        holder.mTextView.setText(studentWithResult.getName());


        if (studentWithResult.getResultItem()!=null) {
            ResultItem resultItem = studentWithResult.getResultItem();

            TermItem mTerm1 = resultItem.getfTerm();
            TermItem mTerm2 = resultItem.getsTerm();
            TermItem mTerm3 = resultItem.gettTerm();

            if (mTerm1.getfSubGrade() != -1) {
                holder.mTerm1Sub1.setOnCheckedChangeListener(null);
                switch (mTerm1.getfSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm1Sub1.check(R.id.rb_term1_s1_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm1Sub1.check(R.id.rb_term1_s1_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm1Sub1.check(R.id.rb_term1_s1_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm1Sub1.check(R.id.rb_term1_s1_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm1Sub1.check(R.id.rb_term1_s1_5);
                        break;
                }
            }
            else {
                holder.mTerm1Sub1.setOnCheckedChangeListener(null);
                holder.mTerm1Sub1.clearCheck();
            }

            if (mTerm1.getsSubGrade() != -1) {
                holder.mTerm1Sub2.setOnCheckedChangeListener(null);
                switch (mTerm1.getsSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm1Sub2.check(R.id.rb_term1_s2_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm1Sub2.check(R.id.rb_term1_s2_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm1Sub2.check(R.id.rb_term1_s2_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm1Sub2.check(R.id.rb_term1_s2_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm1Sub2.check(R.id.rb_term1_s2_5);
                        break;
                }
            }
            else {
                holder.mTerm1Sub2.setOnCheckedChangeListener(null);
                holder.mTerm1Sub2.clearCheck();
            }


            if (mTerm2.getfSubGrade() != -1) {
                holder.mTerm2Sub1.setOnCheckedChangeListener(null);
                switch (mTerm2.getfSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm2Sub1.check(R.id.rb_term2_s1_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm2Sub1.check(R.id.rb_term2_s1_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm2Sub1.check(R.id.rb_term2_s1_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm2Sub1.check(R.id.rb_term2_s1_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm2Sub1.check(R.id.rb_term2_s1_5);
                        break;
                }
            }
            else {
                holder.mTerm2Sub1.setOnCheckedChangeListener(null);
                holder.mTerm2Sub1.clearCheck();
            }

            if (mTerm2.getsSubGrade() != -1) {
                holder.mTerm2Sub2.setOnCheckedChangeListener(null);
                switch (mTerm2.getsSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm2Sub2.check(R.id.rb_term2_s2_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm2Sub2.check(R.id.rb_term2_s2_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm2Sub2.check(R.id.rb_term2_s2_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm2Sub2.check(R.id.rb_term2_s2_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm2Sub2.check(R.id.rb_term2_s2_5);
                        break;
                }
            }
            else {
                holder.mTerm2Sub2.setOnCheckedChangeListener(null);
                holder.mTerm2Sub2.clearCheck();
            }

            if (mTerm3.getfSubGrade() != -1) {
                holder.mTerm3Sub1.setOnCheckedChangeListener(null);
                switch (mTerm3.getfSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm3Sub1.check(R.id.rb_term3_s1_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm3Sub1.check(R.id.rb_term3_s1_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm3Sub1.check(R.id.rb_term3_s1_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm3Sub1.check(R.id.rb_term3_s1_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm3Sub1.check(R.id.rb_term3_s1_5);
                        break;
                }
            }
            else {
                holder.mTerm3Sub1.setOnCheckedChangeListener(null);
                holder.mTerm3Sub1.clearCheck();
            }

            if (mTerm3.getsSubGrade() != -1) {
                holder.mTerm3Sub2.setOnCheckedChangeListener(null);
                switch (mTerm3.getsSubGrade()) {
                    case FBConnenctions.CONST_GRADE_FEAR:
                        holder.mTerm3Sub2.check(R.id.rb_term3_s2_1);
                        break;
                    case FBConnenctions.CONST_GRADE_ACCEPTABLE:
                        holder.mTerm3Sub2.check(R.id.rb_term3_s2_2);
                        break;
                    case FBConnenctions.CONST_GRADE_GOOD:
                        holder.mTerm3Sub2.check(R.id.rb_term3_s2_3);
                        break;
                    case FBConnenctions.CONST_GRADE_VERY_GOOD:
                        holder.mTerm3Sub2.check(R.id.rb_term3_s2_4);
                        break;
                    case FBConnenctions.CONST_GRADE_EXCELLENT:
                        holder.mTerm3Sub2.check(R.id.rb_term3_s2_5);
                        break;
                }
            }
            else {
                holder.mTerm3Sub2.setOnCheckedChangeListener(null);
                holder.mTerm3Sub2.clearCheck();
            }
        }

        holder.mTerm1Sub1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term1_s1_1:
                        mMenuList.get(position).getResultItem().getfTerm().setfSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term1_s1_2:
                        mMenuList.get(position).getResultItem().getfTerm().setfSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term1_s1_3:
                        mMenuList.get(position).getResultItem().getfTerm().setfSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term1_s1_4:
                        mMenuList.get(position).getResultItem().getfTerm().setfSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term1_s1_5:
                        mMenuList.get(position).getResultItem().getfTerm().setfSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });

        holder.mTerm1Sub2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term1_s2_1:
                        mMenuList.get(position).getResultItem().getfTerm().setsSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term1_s2_2:
                        mMenuList.get(position).getResultItem().getfTerm().setsSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term1_s2_3:
                        mMenuList.get(position).getResultItem().getfTerm().setsSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term1_s2_4:
                        mMenuList.get(position).getResultItem().getfTerm().setsSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term1_s2_5:
                        mMenuList.get(position).getResultItem().getfTerm().setsSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });

        holder.mTerm2Sub1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term2_s1_1:
                        mMenuList.get(position).getResultItem().getsTerm().setfSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term2_s1_2:
                        mMenuList.get(position).getResultItem().getsTerm().setfSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term2_s1_3:
                        mMenuList.get(position).getResultItem().getsTerm().setfSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term2_s1_4:
                        mMenuList.get(position).getResultItem().getsTerm().setfSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term2_s1_5:
                        mMenuList.get(position).getResultItem().getsTerm().setfSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });

        holder.mTerm2Sub2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term2_s2_1:
                        mMenuList.get(position).getResultItem().getsTerm().setsSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term2_s2_2:
                        mMenuList.get(position).getResultItem().getsTerm().setsSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term2_s2_3:
                        mMenuList.get(position).getResultItem().getsTerm().setsSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term2_s2_4:
                        mMenuList.get(position).getResultItem().getsTerm().setsSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term2_s2_5:
                        mMenuList.get(position).getResultItem().getsTerm().setsSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });


        holder.mTerm3Sub1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term3_s1_1:
                        mMenuList.get(position).getResultItem().gettTerm().setfSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term3_s1_2:
                        mMenuList.get(position).getResultItem().gettTerm().setfSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term3_s1_3:
                        mMenuList.get(position).getResultItem().gettTerm().setfSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term3_s1_4:
                        mMenuList.get(position).getResultItem().gettTerm().setfSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term3_s1_5:
                        mMenuList.get(position).getResultItem().gettTerm().setfSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });

        holder.mTerm3Sub2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_term3_s2_1:
                        mMenuList.get(position).getResultItem().gettTerm().setsSubGrade(FBConnenctions.CONST_GRADE_FEAR);
                        break;
                    case R.id.rb_term3_s2_2:
                        mMenuList.get(position).getResultItem().gettTerm().setsSubGrade(FBConnenctions.CONST_GRADE_ACCEPTABLE);
                        break;
                    case R.id.rb_term3_s2_3:
                        mMenuList.get(position).getResultItem().gettTerm().setsSubGrade(FBConnenctions.CONST_GRADE_GOOD);
                        break;
                    case R.id.rb_term3_s2_4:
                        mMenuList.get(position).getResultItem().gettTerm().setsSubGrade(FBConnenctions.CONST_GRADE_VERY_GOOD);
                        break;
                    case R.id.rb_term3_s2_5:
                        mMenuList.get(position).getResultItem().gettTerm().setsSubGrade(FBConnenctions.CONST_GRADE_EXCELLENT);
                        break;
                }
                notifyDataSetChanged();
            }
        });

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public RadioGroup mTerm1Sub1;
        public RadioGroup mTerm1Sub2;
        public RadioGroup mTerm2Sub1;
        public RadioGroup mTerm2Sub2;
        public RadioGroup mTerm3Sub1;
        public RadioGroup mTerm3Sub2;
        public MyViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);

            mTerm1Sub1 = v.findViewById(R.id.rg_term1_s1);
            mTerm1Sub2 = v.findViewById(R.id.rg_term1_s2);

            mTerm2Sub1 = v.findViewById(R.id.rg_term2_s1);
            mTerm2Sub2 = v.findViewById(R.id.rg_term2_s2);

            mTerm3Sub1 = v.findViewById(R.id.rg_term3_s1);
            mTerm3Sub2 = v.findViewById(R.id.rg_term3_s2);

        }
    }
}
