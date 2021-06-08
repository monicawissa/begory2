package com.attendance.myproject.begory.presentationLayer.main.setting.addBlaBla;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddBlaBlaViewModel_AssistedFactory implements ViewModelAssistedFactory<AddBlaBlaViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  AddBlaBlaViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public AddBlaBlaViewModel create(SavedStateHandle arg0) {
    return new AddBlaBlaViewModel(appRepository.get(), arg0);
  }
}
