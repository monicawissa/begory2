package com.attendance.myproject.begory.presentationLayer.login
import android.text.TextUtils
import androidx.annotation.StringRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.attendance.myproject.begory.R
import com.attendance.myproject.begory.Utilities.ggle.Event
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.AppRepository
import com.attendance.myproject.begory.data.source.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource
import java.util.*

class LoginViewModel(private val appRepository: AppRepository) :
        ViewModel() {
    var mobile:String? = ""
    var password :String?=""

    private val _isDataAvailable = MutableLiveData<Boolean>()
    val isDataAvailable: LiveData<Boolean>
        get() = _isDataAvailable

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean>
        get() = _dataLoading


    private val msnackbarText = MutableLiveData<Event<Int>>()
    val snackbarMessage: LiveData<Event<Int>>
        get() = msnackbarText
    private val msnackbarText2 = MutableLiveData<String>()
    val snackbarMessage2: LiveData<String>
        get() = msnackbarText2

//    // This LiveData depends on another so we can use a transformation.
//    val completed: LiveData<Boolean> = Transformations.map(_task) { input -> input.isCompleted
//    }
//
//    val taskId: String?
//        get() = _task.value?.id
//
//    fun setCompleted(completed: Boolean) {
//        val task = _task.value ?: return
//        if (completed) {
//            tasksRepository.completeTask(task)
//            showSnackbarMessage(R.string.task_marked_complete)
//        } else {
//            tasksRepository.activateTask(task)
//            showSnackbarMessage(R.string.task_marked_active)
//        }
//    }
//
//    fun start(taskId: String?) {
//        if (taskId != null) {
//            _dataLoading.value = true
//            tasksRepository.getTask(taskId, this)
//        }
//    }
//
//    private fun setTask(task: Task?) {
//        this._task.value = task
//        _isDataAvailable.value = task != null
//    }
//

    private fun showSnackbarMessage(@StringRes message: Int) {
        msnackbarText.value = Event(message)
    }
    private fun showSnackbarMessage2( message: String) {
        msnackbarText2.value = message
    }

    private fun ismobileAndPasswordValid(): Boolean {
        // validate email and password
        if (TextUtils.isEmpty(mobile)||mobile!!.length!=11) {
            showSnackbarMessage(R.string.fill_data)
            return false
        }
        if( TextUtils.isEmpty(password)){
            showSnackbarMessage(R.string.fill_data)
            return false
        }
        return true
    }
    fun login(){
        _dataLoading.value=true
        if(ismobileAndPasswordValid()){
            appRepository.register(mobile!!,admin = FirebaseFilterType.LevelFilterType.Grad,null,null,object :IRemoteDataSource.MessageCallback{
                override fun onResponse(message: Int?) {
                    showSnackbarMessage2("Welcome")
                    _isDataAvailable.value=true
                }

                override fun onDataNotAvailable(message: Int?) {
                    showSnackbarMessage(message!!)
                    _isDataAvailable.value=false
                }

            })
        }
        _dataLoading.value=false

    }
}
