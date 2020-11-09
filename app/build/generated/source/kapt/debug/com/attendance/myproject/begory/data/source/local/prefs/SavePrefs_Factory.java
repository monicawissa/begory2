package com.attendance.myproject.begory.data.source.local.prefs;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SavePrefs_Factory<T> implements Factory<SavePrefs<T>> {
  private final Provider<Context> activityProvider;

  private final Provider<String> preferenceInfoProvider;

  private final Provider<Class<?>> clsProvider;

  public SavePrefs_Factory(Provider<Context> activityProvider,
      Provider<String> preferenceInfoProvider, Provider<Class<?>> clsProvider) {
    this.activityProvider = activityProvider;
    this.preferenceInfoProvider = preferenceInfoProvider;
    this.clsProvider = clsProvider;
  }

  @Override
  public SavePrefs<T> get() {
    return newInstance(activityProvider.get(), preferenceInfoProvider.get(), clsProvider.get());
  }

  public static <T> SavePrefs_Factory<T> create(Provider<Context> activityProvider,
      Provider<String> preferenceInfoProvider, Provider<Class<?>> clsProvider) {
    return new SavePrefs_Factory<T>(activityProvider, preferenceInfoProvider, clsProvider);
  }

  public static <T> SavePrefs<T> newInstance(Context activity, String preferenceInfo,
      Class<?> cls) {
    return new SavePrefs<T>(activity, preferenceInfo, cls);
  }
}
