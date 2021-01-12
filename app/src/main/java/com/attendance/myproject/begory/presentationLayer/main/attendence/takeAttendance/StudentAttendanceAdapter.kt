package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance

import android.app.Activity
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Attendance
import com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.StudentAttendanceAdapter.MyViewHolder

class StudentAttendanceAdapter(context: Activity, menuList:List<Attendance>?) : RecyclerView.Adapter<MyViewHolder?>() {
    private val mMenuList: List<Attendance>? = menuList
    private val mContext: Activity = context

    override fun onCreateViewHolder(parent: ViewGroup,
                           viewType: Int): MyViewHolder {
        // create a new view
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_attendance, parent, false) as View
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        if (position % 2 == 0) holder.itemView.setBackgroundColor(Color.parseColor("#aacdcdcd")) else holder.itemView.setBackgroundColor(Color.parseColor("#aaffffff"))
        val attendance: Attendance = mMenuList!![position]
        holder.mTextView.setText(attendance.name)
        if (attendance.isAttend) {
            holder.mattendCheckBox.setOnCheckedChangeListener(null)
            holder.mattendCheckBox.isChecked = true
        } else {
            holder.mattendCheckBox.setOnCheckedChangeListener(null)
            holder.mattendCheckBox.isChecked = false
        }
        if (attendance.iskodas) {
            holder.mKodasCheckBox.setOnCheckedChangeListener(null)
            holder.mKodasCheckBox.isChecked = true
        } else {
            holder.mKodasCheckBox.setOnCheckedChangeListener(null)
            holder.mKodasCheckBox.isChecked = false
        }
        if (attendance.isA3traf) {
            holder.ma3trafCheckBox.setOnCheckedChangeListener(null)
            holder.ma3trafCheckBox.isChecked = true
        } else {
            holder.ma3trafCheckBox.setOnCheckedChangeListener(null)
            holder.ma3trafCheckBox.isChecked = false
        }
        if (attendance.isTnawel) {
            holder.mtnawelCheckBox.setOnCheckedChangeListener(null)
            holder.mtnawelCheckBox.isChecked = true
        } else {
            holder.mtnawelCheckBox.setOnCheckedChangeListener(null)
            holder.mtnawelCheckBox.isChecked = false
        }
        holder.mattendCheckBox.setOnCheckedChangeListener { compoundButton, b ->
            mMenuList[position].isAttend=b
            notifyDataSetChanged()
        }
        holder.ma3trafCheckBox.setOnCheckedChangeListener { compoundButton, b ->
            mMenuList[position].isA3traf=b
            notifyDataSetChanged()
        }
        holder.mtnawelCheckBox.setOnCheckedChangeListener { compoundButton, b ->
            mMenuList[position].isTnawel=b
            notifyDataSetChanged()
        }
        holder.mKodasCheckBox.setOnCheckedChangeListener { compoundButton, b ->
            mMenuList[position].iskodas=b
            notifyDataSetChanged()
        }
    }
    override fun getItemCount(): Int =
        mMenuList!!.size

    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        // each data item is just a string in this case
        var mTextView: TextView = v.findViewById(R.id.tv_title)
        var mKodasCheckBox: CheckBox = v.findViewById(R.id.cb_kodas)
        var mattendCheckBox: CheckBox = v.findViewById(R.id.cb_attend)
        var ma3trafCheckBox: CheckBox = v.findViewById(R.id.cb_a3traf)
        var mtnawelCheckBox: CheckBox = v.findViewById(R.id.cb_tnawel)


    }
}


