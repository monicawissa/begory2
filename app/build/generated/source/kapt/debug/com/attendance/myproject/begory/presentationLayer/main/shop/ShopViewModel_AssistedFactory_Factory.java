package com.attendance.myproject.begory.presentationLayer.main.shop;

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
public final class ShopViewModel_AssistedFactory_Factory implements Factory<ShopViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public ShopViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ShopViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static ShopViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new ShopViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static ShopViewModel_AssistedFactory newInstance(Provider<AppRepository> appRepository) {
    return new ShopViewModel_AssistedFactory(appRepository);
  }
}
