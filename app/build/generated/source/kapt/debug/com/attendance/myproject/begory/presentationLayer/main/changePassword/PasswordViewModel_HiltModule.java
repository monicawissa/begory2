package com.attendance.myproject.begory.presentationLayer.main.changePassword;

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
    topLevelClass = PasswordViewModel.class
)
public interface PasswordViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.attendance.myproject.begory.presentationLayer.main.changePassword.PasswordViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PasswordViewModel_AssistedFactory factory);
}
