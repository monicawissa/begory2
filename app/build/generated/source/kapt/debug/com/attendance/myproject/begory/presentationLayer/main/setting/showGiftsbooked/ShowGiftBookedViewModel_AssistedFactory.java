package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ShowGiftBookedViewModel_AssistedFactory implements ViewModelAssistedFactory<ShowGiftBookedViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  ShowGiftBookedViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public ShowGiftBookedViewModel create(SavedStateHandle arg0) {
    return new ShowGiftBookedViewModel(appRepository.get(), arg0);
  }
}
