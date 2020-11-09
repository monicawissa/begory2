package com.attendance.myproject.begory.presentationLayer.splash;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import com.attendance.myproject.begory.di.module.NetworkHelper;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SplashViewModel_AssistedFactory implements ViewModelAssistedFactory<SplashViewModel> {
  private final Provider<AppRepository> appRepository;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  SplashViewModel_AssistedFactory(Provider<AppRepository> appRepository,
      Provider<NetworkHelper> networkHelper) {
    this.appRepository = appRepository;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public SplashViewModel create(SavedStateHandle arg0) {
    return new SplashViewModel(appRepository.get(), networkHelper.get());
  }
}
