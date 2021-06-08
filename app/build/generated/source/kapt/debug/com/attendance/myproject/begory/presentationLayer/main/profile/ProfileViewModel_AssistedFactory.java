package com.attendance.myproject.begory.presentationLayer.main.profile;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ProfileViewModel_AssistedFactory implements ViewModelAssistedFactory<ProfileViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  ProfileViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public ProfileViewModel create(SavedStateHandle arg0) {
    return new ProfileViewModel(appRepository.get(), arg0);
  }
}
