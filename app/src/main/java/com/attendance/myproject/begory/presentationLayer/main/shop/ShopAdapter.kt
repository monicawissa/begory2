package com.attendance.myproject.begory.presentationLayer.main.shop

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
import com.attendance.myproject.begory.presentationLayer.main.shop.ShopAdapter.ShopViewHolder
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import java.util.ArrayList


class ShopAdapter(private val mContext: Context, private val mlist: List<Gift>,val user: User,val updatePoints: UpdatePoints)
    : RecyclerView.Adapter<ShopViewHolder?>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ShopViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_book_prize, viewGroup, false)
        return ShopViewHolder(view)
    }

        override fun onBindViewHolder(viewHolder: ShopViewHolder, i: Int) {

        Glide.with(mContext)
                        .load(mlist[i].imagePath)
                        .into(viewHolder.imageView!!)


        viewHolder.nametv?.text = mlist[i].name
        viewHolder.costtv?.text =mlist[i].price!!.toString()+ " " + mContext.getString(R.string.point)
        if (mlist[i].booked==mlist[i].numberOfItem)
        {
            viewHolder.btn!!.text = mContext.getString(R.string.booked)
            viewHolder.btn!!.isClickable = false
            viewHolder.btn!!.isEnabled = false
            viewHolder.btn!!.setBackgroundResource(btn_menu_selector)
        }
        else if (mlist[i].initbooked==true)
        {
            viewHolder.btn!!.text = mContext.getString(R.string.cancel_booking)
            viewHolder.btn!!.isClickable = true
            viewHolder.btn!!.isEnabled = true
        }
        else
        {
            viewHolder.btn!!.text = mContext.getString(R.string.book)
            viewHolder.btn!!.isClickable = true
            viewHolder.btn!!.isEnabled = true
        }
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    inner class ShopViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //public TextView textView;
        var   imageView: ImageView?=null
        var nametv: TextView? = null
        var costtv: TextView? = null
        var btn:Button?=null

        init {

            nametv = itemView.findViewById(R.id.tv_prize_name)
            costtv = itemView.findViewById(R.id.tv_prize_cost)
            imageView = itemView.findViewById(R.id.iv_prize)
            btn=itemView.findViewById(R.id.btn_book)
            btn?.setOnClickListener(View.OnClickListener(){
                val pos = adapterPosition;
                if (pos != RecyclerView.NO_POSITION){
                    //ethagazt
                    if (mlist[pos].initbooked==true)
                    {

                        mlist[pos].initbooked = false

                        user.selectedGifts!!.remove( mlist[pos])
                        var user2:User=user
                        user2!!.price = user2!!.price?.plus(mlist[pos]!!.price!!)
                        updatePoints.onUpdate(user2)
                    }
                    // not ethagazt
                    else
                    {
                        if (mlist[pos].price!! <= user.price!!)
                        {
                            //user.price!! -= mlist[pos].price!!
                            mlist[pos].initbooked = true
                            user!!.selectedGifts!!.add( mlist[pos])
                            var user2:User=user
                            user2!!.price = user2!!.price?.minus(mlist[pos]!!.price!!)
                            updatePoints.onUpdate(user2)
                        }
                        else
                            Toast.makeText(mContext,R.string.points_not_enough,Toast.LENGTH_SHORT).show()
                    }
                    notifyDataSetChanged()
                }

            })

        }
    }}
