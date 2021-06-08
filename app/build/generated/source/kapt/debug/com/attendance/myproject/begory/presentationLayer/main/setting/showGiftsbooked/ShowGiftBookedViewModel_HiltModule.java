package com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = ShowGiftBookedViewModel.class
)
public interface ShowGiftBookedViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.attendance.myproject.begory.presentationLayer.main.setting.showGiftsbooked.ShowGiftBookedViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      ShowGiftBookedViewModel_AssistedFactory factory);
}
