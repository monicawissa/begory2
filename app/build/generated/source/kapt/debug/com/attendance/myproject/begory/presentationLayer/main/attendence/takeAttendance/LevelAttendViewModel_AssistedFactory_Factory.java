package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

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
public final class LevelAttendViewModel_AssistedFactory_Factory implements Factory<LevelAttendViewModel_AssistedFactory> {
  private final Provider<AppRepository> appRepositoryProvider;

  public LevelAttendViewModel_AssistedFactory_Factory(
      Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public LevelAttendViewModel_AssistedFactory get() {
    return newInstance(appRepositoryProvider);
  }

  public static LevelAttendViewModel_AssistedFactory_Factory create(
      Provider<AppRepository> appRepositoryProvider) {
    return new LevelAttendViewModel_AssistedFactory_Factory(appRepositoryProvider);
  }

  public static LevelAttendViewModel_AssistedFactory newInstance(
      Provider<AppRepository> appRepository) {
    return new LevelAttendViewModel_AssistedFactory(appRepository);
  }
}
