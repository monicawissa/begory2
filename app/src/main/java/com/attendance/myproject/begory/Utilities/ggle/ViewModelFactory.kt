package com.attendance.myproject.begory.Utilities.ggle
//
//import android.annotation.SuppressLint
//import android.app.Application
//import androidx.annotation.VisibleForTesting
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.attendance.myproject.begory.Utilities.Injection
//import com.attendance.myproject.begory.data.source.AppRepository
//import com.attendance.myproject.begory.presentationLayer.login.LoginViewModel
//import com.attendance.myproject.begory.presentationLayer.main.MainViewModel
//import com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel
///**
// * A creator is used to inject the product ID into the ViewModel
// *
// *
// * This creator is to showcase how to inject dependencies into ViewModels. It's not
// * actually necessary in this case, as the product ID can be passed in a public method.
// */
//class ViewModelFactory private constructor(
//        private val appRepository: AppRepository
//) : ViewModelProvider.NewInstanceFactory() {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>) =
//            with(modelClass) {
//                when {
//                    isAssignableFrom(SplashViewModel::class.java) ->
//                        SplashViewModel(appRepository)
//                    isAssignableFrom(LoginViewModel::class.java) ->
//                        LoginViewModel(appRepository)
//                    isAssignableFrom(MainViewModel::class.java)->
//                        MainViewModel(appRepository)
//                    else ->
//                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
//                }
//            } as T
//
//    companion object {
//
//        @SuppressLint("StaticFieldLeak")
//        @Volatile private var INSTANCE: ViewModelFactory? = null
//        fun getInstance(application: Application) {
//            INSTANCE ?: synchronized(ViewModelFactory::class.java) {
//                INSTANCE ?: ViewModelFactory(
//                        Injection.provideAppRepository(application.applicationContext))
//                        .also { INSTANCE = it }
//            }
//        }
//
//
//
//
//        @VisibleForTesting fun destroyInstance() {
//            INSTANCE = null
//        }
//    }
//}
