package com.attendance.myproject.begory.presentationLayer.login;

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
public final class LoginViewModel_AssistedFactory_Factory implements Factory<LoginViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public LoginViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public LoginViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static LoginViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new LoginViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static LoginViewModel_AssistedFactory newInstance(Provider<AppRepository> appRepository) {
    return new LoginViewModel_AssistedFactory(appRepository);
  }
}
