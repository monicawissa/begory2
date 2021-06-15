package com.attendance.myproject.begory.presentationLayer.main.setting.addGift

import android.Manifest
import android.app.Activity
import android.content.ContentResolver
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.androidbuts.multispinnerfilter.KeyPairBoolData
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.data.Models.Level
import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper
import com.attendance.myproject.begory.databinding.ActivityAddgiftBinding
import com.attendance.myproject.begory.presentationLayer.main.setting.BaseActivity1
import com.yalantis.ucrop.UCrop
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_addgift.*
import java.io.File
import java.io.IOException


@AndroidEntryPoint
class AddGiftActivity : BaseActivity1() ,AddGiftNavigator{
    private lateinit var binding: ActivityAddgiftBinding
    private val mLevelsList: ArrayList<Level> = ArrayList<Level>()
    private lateinit var  list :List<Int>
//        val list = listOf(R.string.lev_KG,R.string.lev_1,R.string.lev_2,R.string.lev_3,R.string.lev_4
//                ,R.string.lev_5,R.string.lev_6,R.string.lev_preparatory,R.string.lev_secondary,R.string.lev_college, R.string.lev_Grad)
    var imagePath : String? = null

    // Uri indicates, where the image will be picked from
    private var filePath: Uri? = null

    // request code
    private val PICK_IMAGE_REQUEST = 22

    private  val addGiftViewModel: AddGiftViewModel by viewModels()
    override val layoutId: Int
        get() = R.layout.activity_addgift
    override fun initializeView() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(ContentValues.TAG, "showMessage: create addGift")
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.addGiftViewModel=addGiftViewModel
        binding.lifecycleOwner = this
        list=fillMenu()!!
        subscribeToNavigationChanges(addGiftViewModel)
        initLevelsMultiSelectSpinner()
        binding.btnAddImage.setOnClickListener(View.OnClickListener
            {
                if(hasStoragePermission())
                    selectImage()
            }
        )
    }
    private fun initLevelsMultiSelectSpinner() {
        val mLevelsList: MutableList<KeyPairBoolData> = ArrayList()

        var t=1
        for(i in list){
            var level = KeyPairBoolData()
            level.id= i.toLong()
            t++
            level.name = getString(i)
            level.isSelected = false
            mLevelsList.add(level)
        }
        binding.multipleItemSelectionSpinner.setItems(mLevelsList)

    }
    private fun fillMenu(): List<Int>? {
        val mItems  =ArrayList<Int>()
        val v= AppPreferencesHelper(applicationContext)
        val user=v.getUser()
        if((user!!.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.College).toString())||
                (user!!.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.College).toString()))
            mItems.add(R.string.lev_college)
        if((user!!.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Grad).toString())||
                (user!!.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Grad).toString()))
            mItems.add(R.string.lev_Grad)
        if((user!!.subAdminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Augustine).toString())||
                (user!!.adminLevel.toString()).contains((FirebaseFilterType.LevelFilterType.Augustine).toString()))
            mItems.add(R.string.lev_Augustine)
        return mItems.toList()
    }

    fun openMainActivity() {
        finish()
    }

    private fun subscribeToNavigationChanges(viewModel: AddGiftViewModel) {

        // The activity observes the navigation commands in the ViewModel
        val activity = this@AddGiftActivity
        viewModel.run {
            ishideKeyboard.observe(activity,
                    Observer {
                        if (it == true) hide_Keyboard()
                    })
            snackbarMessage.observe(activity, Observer { showMessage(getString(it.getContentIfNotHandled()!!)) })
            snackbarMessage2.observe(activity, Observer { showMessage(it) })
            isOpenMain.observe(activity,
                    Observer {
                        if (it == true) openMainActivity()
                    })
        }
    }
    private fun hasStoragePermission(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1199)
                false
            } else {
                true
            }
        } else {
            true
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String?>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults.size > 0
                && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            if (requestCode == 1199)
                selectImage()
        }
    }

    // Select Image method
    private fun selectImage() {

        // Defining Implicit Intent to mobile gallery
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
                Intent.createChooser(
                        intent,
                        "Select Image from here..."),
                PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null) {

            // Get the Uri of data
            filePath = data.data
            filePath?.let { cropImage(it) }

        }
        else if (resultCode == RESULT_OK && requestCode == UCrop.REQUEST_CROP) {
            filePath = data?.let { UCrop.getOutput(it) }
            imagePath = filePath.toString()
            addGiftViewModel.image_path= imagePath as String
            try {
                // Setting image on image view using Bitmap
                val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, filePath)
                imageView.setImageBitmap(bitmap)
            } catch (e: IOException) {
                // Log the exception
                e.printStackTrace()
            }

        } else if (resultCode == UCrop.RESULT_ERROR) {
            //final Throwable cropError = UCrop.getError(data);
        }
    }

    private fun cropImage(sourceUri: Uri) {
        val destinationUri = Uri.fromFile(File(cacheDir, queryName(contentResolver, sourceUri)))
        val options = UCrop.Options()
        options.withAspectRatio(16f, 16f)
        UCrop.of(sourceUri, destinationUri)
                .withOptions(options)
                .start(this)
    }

    private fun queryName(resolver: ContentResolver, uri: Uri): String? {
        val returnCursor: Cursor = resolver.query(uri, null, null, null, null)!!
        val nameIndex: Int = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        returnCursor.moveToFirst()
        val name: String = returnCursor.getString(nameIndex)
        returnCursor.close()
        return name
    }
}