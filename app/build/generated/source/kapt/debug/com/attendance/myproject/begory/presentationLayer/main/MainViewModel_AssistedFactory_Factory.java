package com.attendance.myproject.begory.presentationLayer.main;

import com.attendance.myproject.begory.data.source.AppRepository;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(Provider<AppRepository> appRepository) {
    return new MainViewModel_AssistedFactory(appRepository);
  }
}
