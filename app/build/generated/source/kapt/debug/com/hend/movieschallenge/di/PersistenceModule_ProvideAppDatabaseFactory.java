package com.hend.movieschallenge.di;

import android.app.Application;
import com.hend.movieschallenge.persistence.AppDatabase;
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
public final class PersistenceModule_ProvideAppDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Application> applicationProvider;

  public PersistenceModule_ProvideAppDatabaseFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideAppDatabase(applicationProvider.get());
  }

  public static PersistenceModule_ProvideAppDatabaseFactory create(
      Provider<Application> applicationProvider) {
    return new PersistenceModule_ProvideAppDatabaseFactory(applicationProvider);
  }

  public static AppDatabase provideAppDatabase(Application application) {
    return Preconditions.checkNotNull(PersistenceModule.INSTANCE.provideAppDatabase(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
