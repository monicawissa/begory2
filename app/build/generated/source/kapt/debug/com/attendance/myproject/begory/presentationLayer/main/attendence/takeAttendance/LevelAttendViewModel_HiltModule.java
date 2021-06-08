package com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance;

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
    topLevelClass = LevelAttendViewModel.class
)
public interface LevelAttendViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.attendance.myproject.begory.presentationLayer.main.attendence.takeAttendance.LevelAttendViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(LevelAttendViewModel_AssistedFactory factory);
}
