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
public final class AppPreferencesHelper_Factory implements Factory<AppPreferencesHelper> {
  private final Provider<Context> contextProvider;

  public AppPreferencesHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppPreferencesHelper get() {
    return newInstance(contextProvider.get());
  }

  public static AppPreferencesHelper_Factory create(Provider<Context> contextProvider) {
    return new AppPreferencesHelper_Factory(contextProvider);
  }

  public static AppPreferencesHelper newInstance(Context context) {
    return new AppPreferencesHelper(context);
  }
}
