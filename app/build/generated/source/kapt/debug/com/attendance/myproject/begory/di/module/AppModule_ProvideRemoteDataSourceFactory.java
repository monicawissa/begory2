package com.attendance.myproject.begory.di.module;

import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource;
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
public final class AppModule_ProvideRemoteDataSourceFactory implements Factory<IRemoteDataSource> {
  private final Provider<RemoteDataSource> mRemoteDataSourceProvider;

  public AppModule_ProvideRemoteDataSourceFactory(
      Provider<RemoteDataSource> mRemoteDataSourceProvider) {
    this.mRemoteDataSourceProvider = mRemoteDataSourceProvider;
  }

  @Override
  public IRemoteDataSource get() {
    return provideRemoteDataSource(mRemoteDataSourceProvider.get());
  }

  public static AppModule_ProvideRemoteDataSourceFactory create(
      Provider<RemoteDataSource> mRemoteDataSourceProvider) {
    return new AppModule_ProvideRemoteDataSourceFactory(mRemoteDataSourceProvider);
  }

  public static IRemoteDataSource provideRemoteDataSource(RemoteDataSource mRemoteDataSource) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRemoteDataSource(mRemoteDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
