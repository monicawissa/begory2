package com.attendance.myproject.begory.presentationLayer.splash;

import com.attendance.myproject.begory.data.source.AppRepository;
import com.attendance.myproject.begory.di.module.NetworkHelper;
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
public final class SplashViewModel_AssistedFactory_Factory implements Factory<SplashViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public SplashViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public SplashViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider, networkHelperProvider);
  }

  public static SplashViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new SplashViewModel_AssistedFactory_Factory(appRepositoryProvider, networkHelperProvider);
  }

  public static SplashViewModel_AssistedFactory newInstance(Provider<AppRepository> appRepository,
      Provider<NetworkHelper> networkHelper) {
    return new SplashViewModel_AssistedFactory(appRepository, networkHelper);
  }
}
