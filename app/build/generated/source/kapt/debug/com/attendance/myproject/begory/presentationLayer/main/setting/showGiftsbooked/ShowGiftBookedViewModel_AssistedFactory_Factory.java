package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked;

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
public final class ShowGiftBookedViewModel_AssistedFactory_Factory implements Factory<ShowGiftBookedViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public ShowGiftBookedViewModel_AssistedFactory_Factory(
      Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ShowGiftBookedViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static ShowGiftBookedViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new ShowGiftBookedViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static ShowGiftBookedViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new ShowGiftBookedViewModel_AssistedFactory(appRepository);
  }
}
