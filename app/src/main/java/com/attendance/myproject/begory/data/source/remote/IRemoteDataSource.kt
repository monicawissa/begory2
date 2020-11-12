package com.attendance.myproject.begory.data.source.remote

import com.attendance.myproject.begory.data.Models.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.Models.User

//remote
public interface IRemoteDataSource {
    interface LoginCallback {
        fun onResponse(user: User)
        fun onDataNotAvailable(message: Int?)
    }
    interface MessageCallback {
        fun onResponse(message: Int?)
        fun onDataNotAvailable(message: Int?)
    }
    fun login(mobile: String, password: String, callback: LoginCallback)
    fun register(user: User
                 ,callback: IRemoteDataSource.MessageCallback)
//    fun getTopRatedMovies(callback: LoadAllMoviesCallback)
//    fun getMovieActors(callback: IResponseCast, movie_id: Int)
//    fun getMovieTrailer(callback: IResponseTrailer, movie_id: Int)
//    fun getMovieReview(callback: IResponseReview, movie_id: Int)
//    fun clearCache()
}