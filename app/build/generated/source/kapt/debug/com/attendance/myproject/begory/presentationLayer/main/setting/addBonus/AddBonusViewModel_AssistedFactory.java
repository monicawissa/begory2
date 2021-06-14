package com.attendance.myproject.begory.presentationLayer.main.setting.addBonus;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class AddBonusViewModel_AssistedFactory implements ViewModelAssistedFactory<AddBonusViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  AddBonusViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public AddBonusViewModel create(SavedStateHandle arg0) {
    return new AddBonusViewModel(appRepository.get(), arg0);
  }
}
