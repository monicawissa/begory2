package com.attendance.myproject.begory.di.module;

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
public final class NetworkHelper_Factory implements Factory<NetworkHelper> {
  private final Provider<Context> contextProvider;

  public NetworkHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NetworkHelper get() {
    return newInstance(contextProvider.get());
  }

  public static NetworkHelper_Factory create(Provider<Context> contextProvider) {
    return new NetworkHelper_Factory(contextProvider);
  }

  public static NetworkHelper newInstance(Context context) {
    return new NetworkHelper(context);
  }
}
