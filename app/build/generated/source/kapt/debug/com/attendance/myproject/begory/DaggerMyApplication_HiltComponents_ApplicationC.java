package com.attendance.myproject.begory;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.attendance.myproject.begory.data.source.AppRepository;
import com.attendance.myproject.begory.data.source.local.prefs.AppPreferencesHelper;
import com.attendance.myproject.begory.data.source.local.prefs.IPreferencesHelper;
import com.attendance.myproject.begory.data.source.remote.IRemoteDataSource;
import com.attendance.myproject.begory.data.source.remote.RemoteDataSource;
import com.attendance.myproject.begory.di.module.AppModule;
import com.attendance.myproject.begory.di.module.AppModule_ProvideAppPreferencesHelperFactory;
import com.attendance.myproject.begory.di.module.AppModule_ProvideRemoteDataSourceFactory;
import com.attendance.myproject.begory.di.module.AppModule_ProvidefirebaseDatabaseFactory;
import com.attendance.myproject.begory.di.module.NetworkHelper;
import com.attendance.myproject.begory.presentationLayer.login.LoginActivity;
import com.attendance.myproject.begory.presentationLayer.login.LoginViewModel_AssistedFactory;
import com.attendance.myproject.begory.presentationLayer.login.LoginViewModel_AssistedFactory_Factory;
import com.attendance.myproject.begory.presentationLayer.main.MainActivity;
import com.attendance.myproject.begory.presentationLayer.main.MainViewModel_AssistedFactory;
import com.attendance.myproject.begory.presentationLayer.main.MainViewModel_AssistedFactory_Factory;
import com.attendance.myproject.begory.presentationLayer.main.NotificationsFragment;
import com.attendance.myproject.begory.presentationLayer.main.SettingsFragment;
import com.attendance.myproject.begory.presentationLayer.main.attendence.AttendanceFragment;
import com.attendance.myproject.begory.presentationLayer.main.profile.ProfileFragment;
import com.attendance.myproject.begory.presentationLayer.main.shop.ShopFragment;
import com.attendance.myproject.begory.presentationLayer.splash.SplashActivity;
import com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel_AssistedFactory;
import com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel_AssistedFactory_Factory;
import com.google.firebase.database.FirebaseDatabase;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object firebaseDatabase = new MemoizedSentinel();

  private volatile Object iRemoteDataSource = new MemoizedSentinel();

  private volatile Object iPreferencesHelper = new MemoizedSentinel();

  private volatile Object networkHelper = new MemoizedSentinel();

  private volatile Provider<NetworkHelper> networkHelperProvider;

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private FirebaseDatabase getFirebaseDatabase() {
    Object local = firebaseDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = firebaseDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvidefirebaseDatabaseFactory.providefirebaseDatabase();
          firebaseDatabase = DoubleCheck.reentrantCheck(firebaseDatabase, local);
        }
      }
    }
    return (FirebaseDatabase) local;
  }

  private RemoteDataSource getRemoteDataSource() {
    return new RemoteDataSource(getFirebaseDatabase());
  }

  private IRemoteDataSource getIRemoteDataSource() {
    Object local = iRemoteDataSource;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iRemoteDataSource;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRemoteDataSourceFactory.provideRemoteDataSource(getRemoteDataSource());
          iRemoteDataSource = DoubleCheck.reentrantCheck(iRemoteDataSource, local);
        }
      }
    }
    return (IRemoteDataSource) local;
  }

  private AppPreferencesHelper getAppPreferencesHelper() {
    return new AppPreferencesHelper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private IPreferencesHelper getIPreferencesHelper() {
    Object local = iPreferencesHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = iPreferencesHelper;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideAppPreferencesHelperFactory.provideAppPreferencesHelper(getAppPreferencesHelper());
          iPreferencesHelper = DoubleCheck.reentrantCheck(iPreferencesHelper, local);
        }
      }
    }
    return (IPreferencesHelper) local;
  }

  private NetworkHelper getNetworkHelper() {
    Object local = networkHelper;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = networkHelper;
        if (local instanceof MemoizedSentinel) {
          local = new NetworkHelper(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          networkHelper = DoubleCheck.reentrantCheck(networkHelper, local);
        }
      }
    }
    return (NetworkHelper) local;
  }

  private Provider<NetworkHelper> getNetworkHelperProvider() {
    Object local = networkHelperProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      networkHelperProvider = (Provider<NetworkHelper>) local;
    }
    return (Provider<NetworkHelper>) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<AppRepository> appRepositoryProvider;

      private volatile Provider<LoginViewModel_AssistedFactory> loginViewModel_AssistedFactoryProvider;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<SplashViewModel_AssistedFactory> splashViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private AppRepository getAppRepository() {
        return new AppRepository(DaggerMyApplication_HiltComponents_ApplicationC.this.getIRemoteDataSource(), DaggerMyApplication_HiltComponents_ApplicationC.this.getIPreferencesHelper());
      }

      private Provider<AppRepository> getAppRepositoryProvider() {
        Object local = appRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          appRepositoryProvider = (Provider<AppRepository>) local;
        }
        return (Provider<AppRepository>) local;
      }

      private LoginViewModel_AssistedFactory getLoginViewModel_AssistedFactory() {
        return LoginViewModel_AssistedFactory_Factory.newInstance(getAppRepositoryProvider());
      }

      private Provider<LoginViewModel_AssistedFactory> getLoginViewModel_AssistedFactoryProvider() {
        Object local = loginViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          loginViewModel_AssistedFactoryProvider = (Provider<LoginViewModel_AssistedFactory>) local;
        }
        return (Provider<LoginViewModel_AssistedFactory>) local;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(getAppRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private SplashViewModel_AssistedFactory getSplashViewModel_AssistedFactory() {
        return SplashViewModel_AssistedFactory_Factory.newInstance(getAppRepositoryProvider(), DaggerMyApplication_HiltComponents_ApplicationC.this.getNetworkHelperProvider());
      }

      private Provider<SplashViewModel_AssistedFactory> getSplashViewModel_AssistedFactoryProvider(
          ) {
        Object local = splashViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          splashViewModel_AssistedFactoryProvider = (Provider<SplashViewModel_AssistedFactory>) local;
        }
        return (Provider<SplashViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.attendance.myproject.begory.presentationLayer.login.LoginViewModel", (Provider) getLoginViewModel_AssistedFactoryProvider()).put("com.attendance.myproject.begory.presentationLayer.main.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).put("com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel", (Provider) getSplashViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectLoginActivity(LoginActivity loginActivity) {
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public void injectSplashActivity(SplashActivity splashActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectNotificationsFragment(NotificationsFragment notificationsFragment) {
        }

        @Override
        public void injectSettingsFragment(SettingsFragment settingsFragment) {
        }

        @Override
        public void injectAttendanceFragment(AttendanceFragment attendanceFragment) {
        }

        @Override
        public void injectProfileFragment(ProfileFragment profileFragment) {
        }

        @Override
        public void injectShopFragment(ShopFragment shopFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.attendance.myproject.begory.presentationLayer.login.LoginViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getLoginViewModel_AssistedFactory();

            case 1: // com.attendance.myproject.begory.data.source.AppRepository 
            return (T) ActivityCImpl.this.getAppRepository();

            case 2: // com.attendance.myproject.begory.presentationLayer.main.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 3: // com.attendance.myproject.begory.presentationLayer.splash.SplashViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSplashViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.attendance.myproject.begory.di.module.NetworkHelper 
        return (T) DaggerMyApplication_HiltComponents_ApplicationC.this.getNetworkHelper();

        default: throw new AssertionError(id);
      }
    }
  }
}
