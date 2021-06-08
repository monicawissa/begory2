package com.attendance.myproject.begory.presentationLayer.main.setting.userExist;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class UserViewModel_AssistedFactory implements ViewModelAssistedFactory<UserViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  UserViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public UserViewModel create(SavedStateHandle arg0) {
    return new UserViewModel(appRepository.get(), arg0);
  }
}
