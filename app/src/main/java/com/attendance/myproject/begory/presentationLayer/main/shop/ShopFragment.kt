package com.attendance.myproject.begory.presentationLayer.main.shop

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.attendance.myproject.begory.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShopFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.d(ContentValues.TAG, "showMessage: create shop")

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}