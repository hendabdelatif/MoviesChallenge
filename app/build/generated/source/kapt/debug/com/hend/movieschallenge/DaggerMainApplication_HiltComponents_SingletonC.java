package com.hend.movieschallenge;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.hend.movieschallenge.di.NetworkModule;
import com.hend.movieschallenge.di.NetworkModule_ProvideImagesApiFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideImagesClientFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideMoshiFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideMoviesListApiFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideMoviesListClientFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideOkHttpClientFactory;
import com.hend.movieschallenge.di.NetworkModule_ProvideRetrofitFactory;
import com.hend.movieschallenge.di.PersistenceModule;
import com.hend.movieschallenge.di.PersistenceModule_ProvideAppDatabaseFactory;
import com.hend.movieschallenge.di.PersistenceModule_ProvideMovieDaoFactory;
import com.hend.movieschallenge.di.RepositoryModule_ProvideMoviesListRepositoryFactory;
import com.hend.movieschallenge.network.api.images.ImagesClient;
import com.hend.movieschallenge.network.api.images.ImagesService;
import com.hend.movieschallenge.network.api.movies.MoviesListClient;
import com.hend.movieschallenge.network.api.movies.MoviesListService;
import com.hend.movieschallenge.network.connection.NetworkHelper;
import com.hend.movieschallenge.persistence.AppDatabase;
import com.hend.movieschallenge.persistence.MovieDao;
import com.hend.movieschallenge.repository.CatalogueRepository;
import com.hend.movieschallenge.ui.catalogue.CatalogueActivity;
import com.hend.movieschallenge.ui.catalogue.CatalogueViewModel_AssistedFactory;
import com.hend.movieschallenge.ui.catalogue.CatalogueViewModel_AssistedFactory_Factory;
import com.hend.movieschallenge.ui.details.DetailsActivity;
import com.hend.movieschallenge.ui.details.DetailsViewModel_AssistedFactory;
import com.hend.movieschallenge.ui.details.DetailsViewModel_AssistedFactory_Factory;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
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
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object moshi = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Provider<OkHttpClient> provideOkHttpClientProvider;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object imagesService = new MemoizedSentinel();

  private volatile Object imagesClient = new MemoizedSentinel();

  private volatile Object moviesListService = new MemoizedSentinel();

  private volatile Object moviesListClient = new MemoizedSentinel();

  private volatile Object appDatabase = new MemoizedSentinel();

  private volatile Object movieDao = new MemoizedSentinel();

  private volatile Object networkHelper = new MemoizedSentinel();

  private volatile Provider<NetworkHelper> networkHelperProvider;

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Moshi moshi() {
    Object local = moshi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moshi;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideMoshiFactory.provideMoshi();
          moshi = DoubleCheck.reentrantCheck(moshi, local);
        }
      }
    }
    return (Moshi) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(moshi());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Provider<OkHttpClient> okHttpClientProvider() {
    Object local = provideOkHttpClientProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideOkHttpClientProvider = (Provider<OkHttpClient>) local;
    }
    return (Provider<OkHttpClient>) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitFactory.provideRetrofit(DoubleCheck.lazy(okHttpClientProvider()));
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private ImagesService imagesService() {
    Object local = imagesService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = imagesService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideImagesApiFactory.provideImagesApi(retrofit());
          imagesService = DoubleCheck.reentrantCheck(imagesService, local);
        }
      }
    }
    return (ImagesService) local;
  }

  private ImagesClient imagesClient() {
    Object local = imagesClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = imagesClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideImagesClientFactory.provideImagesClient(imagesService());
          imagesClient = DoubleCheck.reentrantCheck(imagesClient, local);
        }
      }
    }
    return (ImagesClient) local;
  }

  private MoviesListService moviesListService() {
    Object local = moviesListService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moviesListService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideMoviesListApiFactory.provideMoviesListApi(retrofit());
          moviesListService = DoubleCheck.reentrantCheck(moviesListService, local);
        }
      }
    }
    return (MoviesListService) local;
  }

  private MoviesListClient moviesListClient() {
    Object local = moviesListClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moviesListClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideMoviesListClientFactory.provideMoviesListClient(moviesListService());
          moviesListClient = DoubleCheck.reentrantCheck(moviesListClient, local);
        }
      }
    }
    return (MoviesListClient) local;
  }

  private AppDatabase appDatabase() {
    Object local = appDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = appDatabase;
        if (local instanceof MemoizedSentinel) {
          local = PersistenceModule_ProvideAppDatabaseFactory.provideAppDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          appDatabase = DoubleCheck.reentrantCheck(appDatabase, local);
        }
      }
    }
    return (AppDatabase) local;
  }

  private MovieDao movieDao() {
    Object local = movieDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieDao;
        if (local instanceof MemoizedSentinel) {
          local = PersistenceModule_ProvideMovieDaoFactory.provideMovieDao(appDatabase());
          movieDao = DoubleCheck.reentrantCheck(movieDao, local);
        }
      }
    }
    return (MovieDao) local;
  }

  private NetworkHelper networkHelper() {
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

  private Provider<NetworkHelper> networkHelperProvider() {
    Object local = networkHelperProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      networkHelperProvider = (Provider<NetworkHelper>) local;
    }
    return (Provider<NetworkHelper>) local;
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
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

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder persistenceModule(PersistenceModule persistenceModule) {
      Preconditions.checkNotNull(persistenceModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private volatile Object catalogueRepository = new MemoizedSentinel();

    private volatile Provider<CatalogueRepository> provideMoviesListRepositoryProvider;

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    private CatalogueRepository catalogueRepository() {
      Object local = catalogueRepository;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = catalogueRepository;
          if (local instanceof MemoizedSentinel) {
            local = RepositoryModule_ProvideMoviesListRepositoryFactory.provideMoviesListRepository(DaggerMainApplication_HiltComponents_SingletonC.this.imagesClient(), DaggerMainApplication_HiltComponents_SingletonC.this.moviesListClient(), DaggerMainApplication_HiltComponents_SingletonC.this.movieDao());
            catalogueRepository = DoubleCheck.reentrantCheck(catalogueRepository, local);
          }
        }
      }
      return (CatalogueRepository) local;
    }

    private Provider<CatalogueRepository> catalogueRepositoryProvider() {
      Object local = provideMoviesListRepositoryProvider;
      if (local == null) {
        local = new SwitchingProvider<>(0);
        provideMoviesListRepositoryProvider = (Provider<CatalogueRepository>) local;
      }
      return (Provider<CatalogueRepository>) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<CatalogueViewModel_AssistedFactory> catalogueViewModel_AssistedFactoryProvider;

      private volatile Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private CatalogueViewModel_AssistedFactory catalogueViewModel_AssistedFactory() {
        return CatalogueViewModel_AssistedFactory_Factory.newInstance(ActivityRetainedCImpl.this.catalogueRepositoryProvider(), DaggerMainApplication_HiltComponents_SingletonC.this.networkHelperProvider());
      }

      private Provider<CatalogueViewModel_AssistedFactory> catalogueViewModel_AssistedFactoryProvider(
          ) {
        Object local = catalogueViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          catalogueViewModel_AssistedFactoryProvider = (Provider<CatalogueViewModel_AssistedFactory>) local;
        }
        return (Provider<CatalogueViewModel_AssistedFactory>) local;
      }

      private DetailsViewModel_AssistedFactory detailsViewModel_AssistedFactory() {
        return DetailsViewModel_AssistedFactory_Factory.newInstance(ActivityRetainedCImpl.this.catalogueRepositoryProvider());
      }

      private Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          detailsViewModel_AssistedFactoryProvider = (Provider<DetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> mapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("com.hend.movieschallenge.ui.catalogue.CatalogueViewModel", (Provider) catalogueViewModel_AssistedFactoryProvider()).put("com.hend.movieschallenge.ui.details.DetailsViewModel", (Provider) detailsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), mapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectCatalogueActivity(CatalogueActivity catalogueActivity) {
      }

      @Override
      public void injectDetailsActivity(DetailsActivity detailsActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.mapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
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
            case 0: // com.hend.movieschallenge.ui.catalogue.CatalogueViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.catalogueViewModel_AssistedFactory();

            case 1: // com.hend.movieschallenge.ui.details.DetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.detailsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
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
          case 0: // com.hend.movieschallenge.repository.CatalogueRepository 
          return (T) ActivityRetainedCImpl.this.catalogueRepository();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
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
        case 0: // okhttp3.OkHttpClient 
        return (T) DaggerMainApplication_HiltComponents_SingletonC.this.okHttpClient();

        case 1: // com.hend.movieschallenge.network.connection.NetworkHelper 
        return (T) DaggerMainApplication_HiltComponents_SingletonC.this.networkHelper();

        default: throw new AssertionError(id);
      }
    }
  }
}
