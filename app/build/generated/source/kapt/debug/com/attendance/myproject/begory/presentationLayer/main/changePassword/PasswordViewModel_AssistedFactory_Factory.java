package com.attendance.myproject.begory.presentationLayer.main.changePassword;

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
public final class PasswordViewModel_AssistedFactory_Factory implements Factory<PasswordViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public PasswordViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public PasswordViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static PasswordViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new PasswordViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static PasswordViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new PasswordViewModel_AssistedFactory(appRepository);
  }
}
