package com.attendance.myproject.begory.presentationLayer.main.setting.updateBlaBla;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.attendance.myproject.begory.data.source.AppRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class UpdateBlaBlaViewModel_AssistedFactory implements ViewModelAssistedFactory<UpdateBlaBlaViewModel> {
  private final Provider<AppRepository> appRepository;

  @Inject
  UpdateBlaBlaViewModel_AssistedFactory(Provider<AppRepository> appRepository) {
    this.appRepository = appRepository;
  }

  @Override
  @NonNull
  public UpdateBlaBlaViewModel create(SavedStateHandle arg0) {
    return new UpdateBlaBlaViewModel(appRepository.get(), arg0);
  }
}
