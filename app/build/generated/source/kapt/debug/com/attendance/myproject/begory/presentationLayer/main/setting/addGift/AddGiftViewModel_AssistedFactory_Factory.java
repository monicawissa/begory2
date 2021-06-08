package com.attendance.myproject.begory.presentationLayer.main.setting.addGift;

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
public final class AddGiftViewModel_AssistedFactory_Factory implements Factory<AddGiftViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public AddGiftViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public AddGiftViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static AddGiftViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new AddGiftViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static AddGiftViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new AddGiftViewModel_AssistedFactory(appRepository);
  }
}
