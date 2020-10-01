package com.hend.movieschallenge.di;

import com.hend.movieschallenge.network.api.images.ImagesClient;
import com.hend.movieschallenge.network.api.movies.MoviesListClient;
import com.hend.movieschallenge.persistence.MovieDao;
import com.hend.movieschallenge.repository.CatalogueRepository;
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
public final class RepositoryModule_ProvideMoviesListRepositoryFactory implements Factory<CatalogueRepository> {
  private final Provider<ImagesClient> imagesClientProvider;

  private final Provider<MoviesListClient> moviesListClientProvider;

  private final Provider<MovieDao> movieDaoProvider;

  public RepositoryModule_ProvideMoviesListRepositoryFactory(
      Provider<ImagesClient> imagesClientProvider,
      Provider<MoviesListClient> moviesListClientProvider, Provider<MovieDao> movieDaoProvider) {
    this.imagesClientProvider = imagesClientProvider;
    this.moviesListClientProvider = moviesListClientProvider;
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public CatalogueRepository get() {
    return provideMoviesListRepository(imagesClientProvider.get(), moviesListClientProvider.get(), movieDaoProvider.get());
  }

  public static RepositoryModule_ProvideMoviesListRepositoryFactory create(
      Provider<ImagesClient> imagesClientProvider,
      Provider<MoviesListClient> moviesListClientProvider, Provider<MovieDao> movieDaoProvider) {
    return new RepositoryModule_ProvideMoviesListRepositoryFactory(imagesClientProvider, moviesListClientProvider, movieDaoProvider);
  }

  public static CatalogueRepository provideMoviesListRepository(ImagesClient imagesClient,
      MoviesListClient moviesListClient, MovieDao movieDao) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideMoviesListRepository(imagesClient, moviesListClient, movieDao), "Cannot return null from a non-@Nullable @Provides method");
  }
}
