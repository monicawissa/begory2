package com.attendance.myproject.begory.presentationLayer.main.setting.addBonus

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.Models.UserBooked
import kotlinx.android.synthetic.main.row_show_rank.view.*
import java.util.*

class AddBonusAdapter(context: Activity, var mStudentsList: ArrayList<User>?) : RecyclerView.Adapter<AddBonusAdapter.MyViewHolder?>() {
    //private val mMenuList: ArrayList<StudentWithTotalAttendanceCount> ? = menuList
    private val mContext: Activity = context
    //    private val mTerm1CheckBox: CheckBox? = mTerm1CheckBox
//    private  var mTerm2CheckBox:CheckBox? = mTerm2CheckBox
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        // create a new view
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_add_bonus, parent, false) as View
        return MyViewHolder(v)
    }
    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // each data item is just a string in this case
        var mAdd: ImageView = v.findViewById(R.id.iv_add)
        var mMinus: ImageView = v.findViewById(R.id.iv_minus)
//        var mHesaTextView: TextView = v.findViewById(R.id.tv_hesa)
//        var ma3trafTextView: TextView = v.findViewById(R.id.tv_a3traf)
//        var mtnawelTextView: TextView = v.findViewById(R.id.tv_tnawel)
        var mNameTextView :TextView= v.tv_student_name
        var mTotalGradeTextView:TextView = v.tv_total_grade
        //val pos = adapterPosition;

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val studentItem: User = mStudentsList!![position]
        val viewHolder = holder

        viewHolder.mNameTextView.text = studentItem.name
            viewHolder.mTotalGradeTextView.text = studentItem.price.toString()

        viewHolder.mAdd.setOnClickListener(View.OnClickListener {
            mStudentsList!![position].price=mStudentsList!![position].price!!.plus(5)
            mStudentsList!![position].realPrice=mStudentsList!![position].realPrice!!.plus(5)
            notifyDataSetChanged()

        })
        viewHolder.mMinus.setOnClickListener(View.OnClickListener {
            mStudentsList!![position].price=mStudentsList!![position].price!!.minus(5)
            mStudentsList!![position].realPrice=mStudentsList!![position].realPrice!!.minus(5)
            notifyDataSetChanged()
        })

         //viewHolder.mTotalGradeTextView.setBackgroundResource(R.drawable.circle_score)

    }
    override fun getItemCount(): Int =
            mStudentsList!!.size


}


