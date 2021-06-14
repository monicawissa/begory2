package com.attendance.myproject.begory.presentationLayer.main.setting

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
import com.attendance.myproject.begory.presentationLayer.main.setting.SettingsAdapter.SettingsViewHolder
import com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla.AddBlaBlaActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.addBonus.AddBonusActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.addGift.AddGiftActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.userExist.UserActivity

class SettingsAdapter(private val mContext: Context, private val mlist: List<Int>)
    : RecyclerView.Adapter<SettingsViewHolder?>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SettingsViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_menu, viewGroup, false)
        return SettingsViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: SettingsViewHolder, i: Int) {
        viewHolder.mTextView?.text = mContext.getString(mlist[i])
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    inner class SettingsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
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
                            m_add_student -> UiManager.startActivity(mContext,AddBlaBlaActivity::class.java, mContext.getString(settingType),mContext.getString(m_add_student) )
                            m_edit_student -> UiManager.startActivity(mContext,UserActivity::class.java, mContext.getString(settingType),mContext.getString(m_edit_student) )

                            m_add_subadmin -> UiManager.startActivity(mContext,AddBlaBlaActivity::class.java, mContext.getString(settingType),mContext.getString(m_add_subadmin) )
                            m_edit_subadmin -> UiManager.startActivity(mContext,UserActivity::class.java, mContext.getString(settingType),mContext.getString(m_edit_subadmin) )

                            m_add_admin -> UiManager.startActivity(mContext,AddBlaBlaActivity::class.java, mContext.getString(settingType),mContext.getString(m_add_admin) )
                            m_edit_admin -> UiManager.startActivity(mContext, UserActivity::class.java, mContext.getString(settingType),mContext.getString(m_edit_admin) )
                            m_levels_attendance -> UiManager.startActivity(mContext,ShowLevelAttendActivity::class.java, mContext.getString(settingType),mContext.getString(m_levels_attendance) )
                            m_add_Gift -> UiManager.startActivity(mContext,AddGiftActivity::class.java, mContext.getString(settingType),mContext.getString(m_add_Gift) )
                            //m_edit_Gift -> UiManager.startActivity(mContext, UserActivity::class.java, mContext.getString(settingType),mContext.getString(m_edit_admin) )
                            //m_delete_Gift -> UiManager.startActivity(mContext,AddBlaBlaActivity::class.java, mContext.getString(settingType),mContext.getString(m_add_admin) )
                            m_Gifts_booked -> UiManager.startActivity(mContext, ShowGiftBookedActivity::class.java, mContext.getString(settingType),mContext.getString(m_Gifts_booked) )
                            m_Add_Bonus -> UiManager.startActivity(mContext, AddBonusActivity::class.java, mContext.getString(settingType),mContext.getString(m_Add_Bonus) )
                        }
                    }
                })

        }
    }}
