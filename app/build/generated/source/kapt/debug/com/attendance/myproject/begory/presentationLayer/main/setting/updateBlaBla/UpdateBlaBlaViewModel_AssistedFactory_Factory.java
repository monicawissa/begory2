package com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla;

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
public final class UpdateBlaBlaViewModel_AssistedFactory_Factory implements Factory<UpdateBlaBlaViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public UpdateBlaBlaViewModel_AssistedFactory_Factory(
      Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public UpdateBlaBlaViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static UpdateBlaBlaViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new UpdateBlaBlaViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static UpdateBlaBlaViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new UpdateBlaBlaViewModel_AssistedFactory(appRepository);
  }
}
