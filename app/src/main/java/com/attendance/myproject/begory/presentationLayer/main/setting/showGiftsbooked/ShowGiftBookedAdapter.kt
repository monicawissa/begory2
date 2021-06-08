package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.UserBooked
import kotlinx.android.synthetic.main.row_show_rank.view.*
import java.util.*

class ShowGiftBookedAdapter(context: Activity, val mStudentsList: ArrayList<UserBooked>?) : RecyclerView.Adapter<ShowGiftBookedAdapter.MyViewHolder?>() {
    //private val mMenuList: ArrayList<StudentWithTotalAttendanceCount> ? = menuList
    private val mContext: Activity = context
    //    private val mTerm1CheckBox: CheckBox? = mTerm1CheckBox
//    private  var mTerm2CheckBox:CheckBox? = mTerm2CheckBox
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        // create a new view
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_show_rank, parent, false) as View
        return MyViewHolder(v)
    }
    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // each data item is just a string in this case
//        var mTextView: TextView = v.findViewById(R.id.tv_name)
//        var mKodasTextView: TextView = v.findViewById(R.id.tv_kodas)
//        var mHesaTextView: TextView = v.findViewById(R.id.tv_hesa)
//        var ma3trafTextView: TextView = v.findViewById(R.id.tv_a3traf)
//        var mtnawelTextView: TextView = v.findViewById(R.id.tv_tnawel)
        var mNameTextView :TextView= v.tv_student_name
        var mTotalGradeTextView:TextView = v.tv_total_grade
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val studentItem: UserBooked = mStudentsList!![position]
        val viewHolder = holder

        viewHolder.mNameTextView.text = studentItem.name
            val points = studentItem.price?.let { studentItem.realPrice!!.minus(it) }
            viewHolder.mTotalGradeTextView.text = points.toString()

        when {
            studentItem.top ==1 -> {
                viewHolder.mTotalGradeTextView.setBackgroundResource(R.drawable.circle_score_top2)
                //viewHolder.itemView.setBackgroundResource(R.drawable.rect_trans_box_lev1)//we will need to add static arrays for ids of each level
            }
            studentItem.top ==2 -> {
                viewHolder.mTotalGradeTextView.setBackgroundResource(R.drawable.circle_score_top1)
                //viewHolder.itemView.setBackgroundResource(R.drawable.rect_trans_box_lev2)
            }
            studentItem.top ==3 -> {
                viewHolder.mTotalGradeTextView.setBackgroundResource(R.drawable.circle_score_top3)
                //viewHolder.itemView.setBackgroundResource(R.drawable.rect_trans_box_lev3)
            }
            else -> {
                viewHolder.mTotalGradeTextView.setBackgroundResource(R.drawable.circle_score)
                viewHolder.itemView.setBackgroundResource(R.drawable.rect_trans_box)
            }
        }

    }
    override fun getItemCount(): Int =
            mStudentsList!!.size


}


