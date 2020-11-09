package com.attendance.myproject.begory.di.module;

import com.google.firebase.database.FirebaseDatabase;
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
public final class AppModule_ProvidefirebaseDatabaseFactory implements Factory<FirebaseDatabase> {
  @Override
  public FirebaseDatabase get() {
    return providefirebaseDatabase();
  }

  public static AppModule_ProvidefirebaseDatabaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseDatabase providefirebaseDatabase() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.providefirebaseDatabase(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvidefirebaseDatabaseFactory INSTANCE = new AppModule_ProvidefirebaseDatabaseFactory();
  }
}
