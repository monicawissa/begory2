package com.attendance.myproject.begory.presentationLayer.main.shop;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ShopViewModel_AssistedFactory implements ViewModelAssistedFactory<ShopViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  ShopViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public ShopViewModel create(SavedStateHandle arg0) {
    return new ShopViewModel(appRepository.get(), arg0);
  }
}
