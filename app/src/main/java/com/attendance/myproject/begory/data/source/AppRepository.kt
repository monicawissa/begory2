package com.attendance.myproject.begory.data.source
import com.attendance.myproject.begory.data.Models.User
import com.attendance.myproject.begory.data.source.local.prefs.PreferencesHelper
import com.attendance.myproject.begory.data.source.remote.FirebaseFilterType
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource


/**
 * Concrete implementation to load tasks from the data sources into a cache.
 *
 *
 * For simplicity, this implements a dumb synchronisation between locally persisted data and data
 * obtained from the server, by using the remote data source only if the local database doesn't
 * exist or is empty.
 */
class AppRepository (private val mRemoteDataSource: IRemoteDataSource,private val mPreferencesHelper: PreferencesHelper)
    : BaseDataSource {

    override fun getUser(callback: IRemoteDataSource.LoginCallback) {
         mPreferencesHelper.getUser(callback)
    }

    override fun setUser(user: User) {
        mPreferencesHelper.setUser(user)    }

    override fun setUserAsLoggedOut() {
        mPreferencesHelper.setUserAsLoggedOut()
    }

    override fun login(mobile: String, password: String, callback: IRemoteDataSource.LoginCallback) {
        mRemoteDataSource.login(mobile,password,object :IRemoteDataSource.LoginCallback{
            override fun onResponse(user: User) {
                mPreferencesHelper.setUser(user)
                callback.onResponse(user)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }

    override fun register(mobile: String, admin: FirebaseFilterType.LevelFilterType?,
                          subAdmin: FirebaseFilterType.LevelFilterType?,
                          studentLevel: FirebaseFilterType.LevelFilterType?,
                          callback: IRemoteDataSource.MessageCallback) {
        mRemoteDataSource.register(mobile,admin,subAdmin,studentLevel,object :IRemoteDataSource.MessageCallback{
            override fun onResponse(message: Int?) {
                callback.onResponse(message)
            }

            override fun onDataNotAvailable(message: Int?) {
                callback.onDataNotAvailable(message)
            }

        })
    }



//    /**
//     * This variable has package local visibility so it can be accessed from tests.
//     */
//    //type , List
//    var mCachedMovies: MutableMap<MoviesFilterType, List<Movie?>?>? = null
//
//    //movie_id ,
//    var mCachedMoviesTrailes: MutableMap<Int, List<Trailer?>?>? = null
//    var mCachedMoviesReviews: MutableMap<Int, List<Review?>?>? = null
//
//    /**
//     * Marks the cache as invalid, to force an update the next time data is requested. This variable
//     * has package local visibility so it can be accessed from tests.
//     */
//    var mCacheIsDirty = false
//    private var context: Context? = null
//    var cic: CheckInternetConnection? = null
//    fun setContext(context: Context?) {
//        this.context = context
//        cic = CheckInternetConnection(context)
//    }
//
//    override fun getAllFavorite(callback: LoadAllFavoriteCallback) {
//        checkNotNull(callback)
//        mFavoritesLocalDataSource.getAllFavorite(object : LoadAllFavoriteCallback {
//            override fun onAllFavoriteLoaded(Favorites: List<Movie?>?) {
//                callback.onAllFavoriteLoaded(Favorites)
//            }
//
//            override fun onDataNotAvailable(table_is_empty: String?) {
//                callback.onDataNotAvailable("table is empty")
//            }
//        })
//    }
//
//    override fun getFavorite(FavoriteId: Int, callback: GetFavoriteCallback) {
//        mFavoritesLocalDataSource.getFavorite(FavoriteId, object : GetFavoriteCallback {
//            override fun onFavoriteLoaded(Favorite: Movie?) {
//                callback.onFavoriteLoaded(Favorite)
//            }
//
//            override fun onDataNotAvailable() {
//                callback.onDataNotAvailable()
//            }
//        })
//    }
//
//    override fun addFavorite(Favorite: Movie) {
//        mFavoritesLocalDataSource.addFavorite(Favorite)
//    }
//
//    override fun updateFavorite(Favorite: Movie) {
//        mFavoritesLocalDataSource.updateFavorite(Favorite)
//    }
//
//    override fun deleteAllFavorite() {
//        mFavoritesLocalDataSource.deleteAllFavorite()
//    }
//
//    override fun deleteFavorite(FavoriteId: Int) {
//        mFavoritesLocalDataSource.deleteFavorite(FavoriteId)
//    }
//
//    override fun getpopularMovies(callback: LoadAllMoviesCallback) {
//        checkNotNull(callback)
//        if (mCachedMovies != null && mCachedMovies!!.containsKey(MoviesFilterType.popular) &&
//                !mCacheIsDirty) {
//            callback.onResponse(ArrayList<Movie?>(mCachedMovies!![MoviesFilterType.popular]))
//            return
//        }
//        val Ch: Boolean = cic.isConnectingToInternet()
//        if (!Ch) {
//            callback.onDataNotAvailable(context!!.getString(R.string.no_internet_connection))
//            return
//        }
//        mMoviesRemoteDataSource.getpopularMovies(object : LoadAllMoviesCallback {
//            override fun onResponse(Movies: List<Movie?>?) {
//                // save to cache
//                if (mCachedMovies == null) mCachedMovies = LinkedHashMap<MoviesFilterType, List<Movie?>?>()
//                if (!mCachedMovies!!.containsKey(MoviesFilterType.popular)) mCachedMovies!![MoviesFilterType.popular] = Movies
//                mCacheIsDirty = false
//                //
//                callback.onResponse(Movies)
//            }
//
//            override fun onDataNotAvailable(message: String?) {
//                callback.onDataNotAvailable(message)
//            }
//        })
//    }
//
//    override fun getMovieActors(callback: IResponseCast, movie_id: Int) {
//        checkNotNull(callback)
//        // Respond immediately with cache if available and not dirty
//        if (mCachedMoviesCasts != null && mCachedMoviesCasts!!.containsKey(movie_id) && !mCacheIsDirty) {
//            callback.OnResponseCast(ArrayList<Cast?>(mCachedMoviesCasts!![movie_id]))
//            return
//        }
//        val Ch: Boolean = cic.isConnectingToInternet()
//        if (!Ch) {
//            callback.onDataNotAvailable(context!!.getString(R.string.no_internet_connection))
//            return
//        }
//        mMoviesRemoteDataSource.getMovieActors(object : IResponseCast {
//            override fun OnResponseCast(data: List<Cast?>?) {
//                // save to cache
//                if (mCachedMoviesCasts == null) mCachedMoviesCasts = LinkedHashMap<Int, List<Cast?>?>()
//                if (!mCachedMoviesCasts!!.containsKey(movie_id)) mCachedMoviesCasts!![movie_id] = data
//                mCacheIsDirty = false
//                //
//                callback.OnResponseCast(data)
//            }
//
//            override fun onDataNotAvailable(message: String?) {
//                callback.onDataNotAvailable(message)
//            }
//        }, movie_id)
//    }
//
//    override fun clearCache() {
//        mCacheIsDirty = true
//    }

    companion object {
        private var INSTANCE: AppRepository? = null

        /**
         * Returns the single instance of this class, creating it if necessary.
         *
         * @param tasksRemoteDataSource the backend data source
         * @param tasksLocalDataSource  the device storage data source
         * @return the [AppRepository] instance
         */
        @JvmStatic fun getInstance(mRemoteDataSource: IRemoteDataSource,mPreferencesHelper: PreferencesHelper)=INSTANCE ?: synchronized(AppRepository::class.java) {
            INSTANCE ?: synchronized(AppRepository::class.java) {
                INSTANCE ?: AppRepository(mRemoteDataSource,mPreferencesHelper)
                        .also { INSTANCE = it }
            }
        }

        /**
         * Used to force [getInstance] to create a new instance
         * next time it's called.
         */
        @JvmStatic fun destroyInstance() {
            INSTANCE = null
        }
    }
}