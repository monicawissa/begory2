package com.attendance.myproject.begory.di.module;

import android.content.Context;
import com.attendance.myproject.begory.data.Models.User;
import com.attendance.myproject.begory.data.source.local.prefs.SavePrefs;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideSavePrefFactory implements Factory<SavePrefs<User>> {
  private final Provider<Context> activityProvider;

  private final Provider<Class<?>> clsProvider;

  public AppModule_ProvideSavePrefFactory(Provider<Context> activityProvider,
      Provider<Class<?>> clsProvider) {
    this.activityProvider = activityProvider;
    this.clsProvider = clsProvider;
  }

  @Override
  public SavePrefs<User> get() {
    return provideSavePref(activityProvider.get(), clsProvider.get());
  }

  public static AppModule_ProvideSavePrefFactory create(Provider<Context> activityProvider,
      Provider<Class<?>> clsProvider) {
    return new AppModule_ProvideSavePrefFactory(activityProvider, clsProvider);
  }

  public static SavePrefs<User> provideSavePref(Context activity, Class<?> cls) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideSavePref(activity, cls), "Cannot return null from a non-@Nullable @Provides method");
  }
}
