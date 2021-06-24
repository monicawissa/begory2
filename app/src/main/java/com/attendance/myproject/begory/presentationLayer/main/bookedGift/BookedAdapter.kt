package com.attendance.myproject.begory.presentationLayer.main.bookedGift

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.R.drawable
import com.attendance.myproject.begory.R.drawable.*
import com.attendance.myproject.begory.R.string.*
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.Gift
import com.attendance.myproject.begory.data.Models.User
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import java.util.ArrayList


class BookedAdapter(private val mContext: Context, private val mlist: List<Gift>,val user: User,val updatePoints: UpdatePoints)
    : RecyclerView.Adapter<BookedAdapter.BookedViewHolder?>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): BookedViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_booked, viewGroup, false)
        return BookedViewHolder(view)
    }

        override fun onBindViewHolder(viewHolder: BookedViewHolder, i: Int) {

        Glide.with(mContext)
                        .load(mlist[i].imagePath)
                        .into(viewHolder.imageView!!)


        viewHolder.nametv?.text = mlist[i].name
        viewHolder.costtv?.text =mlist[i].price!!.toString()+ " " + mContext.getString(R.string.point)

    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    inner class BookedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //public TextView textView;
        var   imageView: ImageView?=null
        var nametv: TextView? = null
        var costtv: TextView? = null

        init {

            nametv = itemView.findViewById(R.id.tv_prize_name)
            costtv = itemView.findViewById(R.id.tv_prize_cost)
            imageView = itemView.findViewById(R.id.iv_prize)


        }
    }}
