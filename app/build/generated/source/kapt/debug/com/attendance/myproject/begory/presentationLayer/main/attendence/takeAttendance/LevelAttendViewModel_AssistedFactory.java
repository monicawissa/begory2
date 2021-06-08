package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class LevelAttendViewModel_AssistedFactory implements ViewModelAssistedFactory<LevelAttendViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  LevelAttendViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public LevelAttendViewModel create(SavedStateHandle arg0) {
    return new LevelAttendViewModel(appRepository.get(), arg0);
  }
}
