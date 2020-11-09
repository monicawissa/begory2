package com.attendance.myproject.begory.data.source.remote;

import com.google.firebase.database.FirebaseDatabase;
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<FirebaseDatabase> firebaseDatabaseProvider;

  public RemoteDataSource_Factory(Provider<FirebaseDatabase> firebaseDatabaseProvider) {
    this.firebaseDatabaseProvider = firebaseDatabaseProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(firebaseDatabaseProvider.get());
  }

  public static RemoteDataSource_Factory create(
      Provider<FirebaseDatabase> firebaseDatabaseProvider) {
    return new RemoteDataSource_Factory(firebaseDatabaseProvider);
  }

  public static RemoteDataSource newInstance(FirebaseDatabase firebaseDatabase) {
    return new RemoteDataSource(firebaseDatabase);
  }
}
