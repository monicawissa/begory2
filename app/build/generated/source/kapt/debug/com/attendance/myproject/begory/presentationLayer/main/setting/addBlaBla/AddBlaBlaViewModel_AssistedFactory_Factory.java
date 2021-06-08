package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla;

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
public final class AddBlaBlaViewModel_AssistedFactory_Factory implements Factory<AddBlaBlaViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public AddBlaBlaViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public AddBlaBlaViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static AddBlaBlaViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new AddBlaBlaViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static AddBlaBlaViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new AddBlaBlaViewModel_AssistedFactory(appRepository);
  }
}
