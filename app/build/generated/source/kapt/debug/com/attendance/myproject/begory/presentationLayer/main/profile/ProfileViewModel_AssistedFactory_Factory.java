package com.attendance.myproject.begory.presentationLayer.main.profile;

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
public final class ProfileViewModel_AssistedFactory_Factory implements Factory<ProfileViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public ProfileViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ProfileViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static ProfileViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new ProfileViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static ProfileViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new ProfileViewModel_AssistedFactory(appRepository);
  }
}
