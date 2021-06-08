package com.attendance.myproject.begory.presentationLayer.main.setting.userExist;

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
public final class UserViewModel_AssistedFactory_Factory implements Factory<UserViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public UserViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public UserViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static UserViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new UserViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static UserViewModel_AssistedFactory newInstance(Provider<AppRepository> appRepository) {
    return new UserViewModel_AssistedFactory(appRepository);
  }
}
