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
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity
import com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla.UpdateBlaBlaViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.ArrayList

@AndroidEntryPoint
class ProfileFragment : Fragment(R.layout.fragment_profile),ProfileNavigator {
    private lateinit var binding:FragmentProfileBinding

    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()

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

    override fun openLoginActivity() {
        UiManager.startActivity(requireContext(), LoginActivity::class.java)
        requireActivity().finish()
    }

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
            isopenLogin.observe(viewLifecycleOwner,
                    Observer {
                        if (it == true) openLoginActivity()
                    })
        }
    }fun showMessage(string: String){
        Toast.makeText(binding.root.context, string, Toast.LENGTH_SHORT).show()
        Log.d(ContentValues.TAG, "showMessage: "+string)
    }
    fun hide_Keyboard() {
        UiManager.hideKeyboard(activity)
    }
}