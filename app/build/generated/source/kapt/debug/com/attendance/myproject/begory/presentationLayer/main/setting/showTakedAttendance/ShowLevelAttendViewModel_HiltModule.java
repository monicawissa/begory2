package com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance;

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
    topLevelClass = ShowLevelAttendViewModel.class
)
public interface ShowLevelAttendViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.attendance.myproject.begory.presentationLayer.main.setting.showTakedAttendance.ShowLevelAttendViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      ShowLevelAttendViewModel_AssistedFactory factory);
}
