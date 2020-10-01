package com.hend.movieschallenge.repository;

import com.hend.movieschallenge.network.api.images.ImagesClient;
import com.hend.movieschallenge.network.api.movies.MoviesListClient;
import com.hend.movieschallenge.persistence.MovieDao;
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
public final class CatalogueRepository_Factory implements Factory<CatalogueRepository> {
  private final Provider<ImagesClient> imagesClientProvider;

  private final Provider<MoviesListClient> moviesListClientProvider;

  private final Provider<MovieDao> movieDaoProvider;

  public CatalogueRepository_Factory(Provider<ImagesClient> imagesClientProvider,
      Provider<MoviesListClient> moviesListClientProvider, Provider<MovieDao> movieDaoProvider) {
    this.imagesClientProvider = imagesClientProvider;
    this.moviesListClientProvider = moviesListClientProvider;
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public CatalogueRepository get() {
    return newInstance(imagesClientProvider.get(), moviesListClientProvider.get(), movieDaoProvider.get());
  }

  public static CatalogueRepository_Factory create(Provider<ImagesClient> imagesClientProvider,
      Provider<MoviesListClient> moviesListClientProvider, Provider<MovieDao> movieDaoProvider) {
    return new CatalogueRepository_Factory(imagesClientProvider, moviesListClientProvider, movieDaoProvider);
  }

  public static CatalogueRepository newInstance(ImagesClient imagesClient,
      MoviesListClient moviesListClient, MovieDao movieDao) {
    return new CatalogueRepository(imagesClient, moviesListClient, movieDao);
  }
}
