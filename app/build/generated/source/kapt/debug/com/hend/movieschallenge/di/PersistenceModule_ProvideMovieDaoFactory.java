package com.hend.movieschallenge.di;

import com.hend.movieschallenge.persistence.AppDatabase;
import com.hend.movieschallenge.persistence.MovieDao;
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
public final class PersistenceModule_ProvideMovieDaoFactory implements Factory<MovieDao> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public PersistenceModule_ProvideMovieDaoFactory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public MovieDao get() {
    return provideMovieDao(appDatabaseProvider.get());
  }

  public static PersistenceModule_ProvideMovieDaoFactory create(
      Provider<AppDatabase> appDatabaseProvider) {
    return new PersistenceModule_ProvideMovieDaoFactory(appDatabaseProvider);
  }

  public static MovieDao provideMovieDao(AppDatabase appDatabase) {
    return Preconditions.checkNotNull(PersistenceModule.INSTANCE.provideMovieDao(appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
