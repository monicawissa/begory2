package com.attendance.myproject.begory.presentationLayer.main.profile

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.UiManager
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.databinding.ActivityUpdateblablaBinding
import com.attendance.myproject.begory.databinding.FragmentProfileBinding
import com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private lateinit var binding:FragmentProfileBinding

    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    val list = listOf(R.string.lev_college, R.string.lev_Grad)
//        val list = listOf(R.string.lev_KG,R.string.lev_1,R.string.lev_2,R.string.lev_3,R.string.lev_4
//                ,R.string.lev_5,R.string.lev_6,R.string.lev_preparatory,R.string.lev_secondary,R.string.lev_college, R.string.lev_Grad)

    private  val profileViewModel: ProfileViewModel by viewModels()
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.d(ContentValues.TAG, "showMessage: create profile")
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.profileViewModel=profileViewModel
        binding.lifecycleOwner = this
        subscribeToNavigationChanges(profileViewModel)
        return view
    }

//    override fun openMainActivity() {
//        UiManager.startActivity(this@UpdateBlaBlaActivity, MainActivity::class.java)
//        finish()
//    }

    private fun subscribeToNavigationChanges(viewModel: ProfileViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@ProfileFragment
        viewModel.run {
            ishideKeyboard.observe(viewLifecycleOwner,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            snackbarMessage.observe(viewLifecycleOwner, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(viewLifecycleOwner, Observer { showMessage(it) })
        }
    }fun showMessage(string: String){
        Toast.makeText(binding.root.context, string, Toast.LENGTH_SHORT).show()
        Log.d(ContentValues.TAG, "showMessage: "+string)
    }
    fun hide_Keyboard() {
        UiManager.hideKeyboard(activity)
    }
}