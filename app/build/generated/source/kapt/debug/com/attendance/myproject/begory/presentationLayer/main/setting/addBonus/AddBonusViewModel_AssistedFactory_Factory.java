package com.attendance.myproject.begory.presentationLayer.main.setting.addBonus;

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
public final class AddBonusViewModel_AssistedFactory_Factory implements Factory<AddBonusViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public AddBonusViewModel_AssistedFactory_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public AddBonusViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static AddBonusViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new AddBonusViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static AddBonusViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new AddBonusViewModel_AssistedFactory(appRepository);
  }
}
