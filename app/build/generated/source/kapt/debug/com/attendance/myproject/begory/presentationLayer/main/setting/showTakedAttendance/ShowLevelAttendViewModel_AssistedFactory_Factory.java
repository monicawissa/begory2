package com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance;

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
public final class ShowLevelAttendViewModel_AssistedFactory_Factory implements Factory<ShowLevelAttendViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public ShowLevelAttendViewModel_AssistedFactory_Factory(
      Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ShowLevelAttendViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static ShowLevelAttendViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new ShowLevelAttendViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static ShowLevelAttendViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new ShowLevelAttendViewModel_AssistedFactory(appRepository);
  }
}
