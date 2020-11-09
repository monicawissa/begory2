package com.attendance.myproject.begory.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidePreferenceNameFactory implements Factory<String> {
  @Override
  public String get() {
    return providePreferenceName();
  }

  public static AppModule_ProvidePreferenceNameFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String providePreferenceName() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.providePreferenceName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidePreferenceNameFactory INSTANCE = new AppModule_ProvidePreferenceNameFactory();
  }
}
