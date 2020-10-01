package com.hend.movieschallenge.di;

import com.hend.movieschallenge.network.api.movies.MoviesListClient;
import com.hend.movieschallenge.network.api.movies.MoviesListService;
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
public final class NetworkModule_ProvideMoviesListClientFactory implements Factory<MoviesListClient> {
  private final Provider<MoviesListService> moviesListServiceProvider;

  public NetworkModule_ProvideMoviesListClientFactory(
      Provider<MoviesListService> moviesListServiceProvider) {
    this.moviesListServiceProvider = moviesListServiceProvider;
  }

  @Override
  public MoviesListClient get() {
    return provideMoviesListClient(moviesListServiceProvider.get());
  }

  public static NetworkModule_ProvideMoviesListClientFactory create(
      Provider<MoviesListService> moviesListServiceProvider) {
    return new NetworkModule_ProvideMoviesListClientFactory(moviesListServiceProvider);
  }

  public static MoviesListClient provideMoviesListClient(MoviesListService moviesListService) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideMoviesListClient(moviesListService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
