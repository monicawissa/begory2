package com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ShowLevelAttendViewModel_AssistedFactory implements ViewModelAssistedFactory<ShowLevelAttendViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  ShowLevelAttendViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public ShowLevelAttendViewModel create(SavedStateHandle arg0) {
    return new ShowLevelAttendViewModel(appRepository.get(), arg0);
  }
}
