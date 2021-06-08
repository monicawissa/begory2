package com.attendance.myproject.begory.presentationLayer.main.changePassword;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PasswordViewModel_AssistedFactory implements ViewModelAssistedFactory<PasswordViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  PasswordViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public PasswordViewModel create(SavedStateHandle arg0) {
    return new PasswordViewModel(appRepository.get(), arg0);
  }
}
