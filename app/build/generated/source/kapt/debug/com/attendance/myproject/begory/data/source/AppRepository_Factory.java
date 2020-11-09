package com.attendance.myproject.begory.data.source;

import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper;
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppRepository_Factory implements Factory<AppRepository> {
  private final Provider<IRemoteDataSource> mRemoteDataSourceProvider;

  private final Provider<IPreferencesHelper> mIPreferencesHelperProvider;

  public AppRepository_Factory(Provider<IRemoteDataSource> mRemoteDataSourceProvider,
      Provider<IPreferencesHelper> mIPreferencesHelperProvider) {
    this.mRemoteDataSourceProvider = mRemoteDataSourceProvider;
    this.mIPreferencesHelperProvider = mIPreferencesHelperProvider;
  }

  @Override
  public AppRepository get() {
    return newInstance(mRemoteDataSourceProvider.get(), mIPreferencesHelperProvider.get());
  }

  public static AppRepository_Factory create(Provider<IRemoteDataSource> mRemoteDataSourceProvider,
      Provider<IPreferencesHelper> mIPreferencesHelperProvider) {
    return new AppRepository_Factory(mRemoteDataSourceProvider, mIPreferencesHelperProvider);
  }

  public static AppRepository newInstance(IRemoteDataSource mRemoteDataSource,
      IPreferencesHelper mIPreferencesHelper) {
    return new AppRepository(mRemoteDataSource, mIPreferencesHelper);
  }
}
