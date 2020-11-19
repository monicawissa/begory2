package com.attendance.myproject.begory.presentationLayer.main.attendence

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.R.string.*
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendActivity

class AttendanceAdapter(private val mContext: Context, private val mlist: List<Int>)
    : RecyclerView.Adapter<AttendanceAdapter.AttendanceViewHolder?>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): AttendanceViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_menu, viewGroup, false)
        return AttendanceViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: AttendanceViewHolder, i: Int) {
        viewHolder.mTextView?.text = mContext.getString(mlist[i])
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    inner class AttendanceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //public TextView textView;
        //public ImageView imageView;
            var mTextView: TextView? = null
        init {

            mTextView = itemView.findViewById(R.id.tv_title)

            itemView.setOnClickListener(View.OnClickListener(){
                    val pos = adapterPosition;
                    if (pos != RecyclerView.NO_POSITION){
                        val clickedDataItem = mlist[pos];
                        when (mlist[pos]) {
                            a_lev_college -> UiManager.startActivity(mContext, LevelAttendActivity::class.java, mContext.getString(settingType),lev_college)
                            a_lev_Grad -> UiManager.startActivity(mContext,LevelAttendActivity::class.java, mContext.getString(settingType),lev_Grad )

                        }
                        Toast.makeText(it.context, "You clicked $clickedDataItem", Toast.LENGTH_SHORT).show()
                    }
                })

        }
    }}
