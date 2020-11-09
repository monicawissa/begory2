package com.attendance.myproject.begory.presentationLayer.login;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class LoginViewModel_AssistedFactory implements ViewModelAssistedFactory<LoginViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  LoginViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public LoginViewModel create(SavedStateHandle arg0) {
    return new LoginViewModel(appRepository.get());
  }
}
