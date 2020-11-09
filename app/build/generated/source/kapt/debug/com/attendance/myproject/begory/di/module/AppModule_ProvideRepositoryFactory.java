package com.attendance.myproject.begory.di.module;

import com.attendance.myproject.begory.data.source.BaseDataSource;
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper;
import com.attendance.myproject.begory.data.source.remote.RemoteDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideRepositoryFactory implements Factory<BaseDataSource> {
  private final Provider<RemoteDataSource> mRemoteDataSourceProvider;

  private final Provider<AppPreferencesHelper> mPreferencesHelperProvider;

  public AppModule_ProvideRepositoryFactory(Provider<RemoteDataSource> mRemoteDataSourceProvider,
      Provider<AppPreferencesHelper> mPreferencesHelperProvider) {
    this.mRemoteDataSourceProvider = mRemoteDataSourceProvider;
    this.mPreferencesHelperProvider = mPreferencesHelperProvider;
  }

  @Override
  public BaseDataSource get() {
    return provideRepository(mRemoteDataSourceProvider.get(), mPreferencesHelperProvider.get());
  }

  public static AppModule_ProvideRepositoryFactory create(
      Provider<RemoteDataSource> mRemoteDataSourceProvider,
      Provider<AppPreferencesHelper> mPreferencesHelperProvider) {
    return new AppModule_ProvideRepositoryFactory(mRemoteDataSourceProvider, mPreferencesHelperProvider);
  }

  public static BaseDataSource provideRepository(RemoteDataSource mRemoteDataSource,
      AppPreferencesHelper mPreferencesHelper) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRepository(mRemoteDataSource, mPreferencesHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
