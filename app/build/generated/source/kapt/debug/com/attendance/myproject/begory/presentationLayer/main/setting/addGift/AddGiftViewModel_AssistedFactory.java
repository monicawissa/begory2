package com.attendance.myproject.begory.presentationLayer.main.setting.addGift;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddGiftViewModel_AssistedFactory implements ViewModelAssistedFactory<AddGiftViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  AddGiftViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public AddGiftViewModel create(SavedStateHandle arg0) {
    return new AddGiftViewModel(appRepository.get(), arg0);
  }
}
