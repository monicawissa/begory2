package com.attendance.myproject.begory.di.module;

import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper;
import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper;
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
public final class AppModule_ProvideAppPreferencesHelperFactory implements Factory<IPreferencesHelper> {
  private final Provider<AppPreferencesHelper> appPreferencesHelperProvider;

  public AppModule_ProvideAppPreferencesHelperFactory(
      Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    this.appPreferencesHelperProvider = appPreferencesHelperProvider;
  }

  @Override
  public IPreferencesHelper get() {
    return provideAppPreferencesHelper(appPreferencesHelperProvider.get());
  }

  public static AppModule_ProvideAppPreferencesHelperFactory create(
      Provider<AppPreferencesHelper> appPreferencesHelperProvider) {
    return new AppModule_ProvideAppPreferencesHelperFactory(appPreferencesHelperProvider);
  }

  public static IPreferencesHelper provideAppPreferencesHelper(
      AppPreferencesHelper appPreferencesHelper) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideAppPreferencesHelper(appPreferencesHelper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
