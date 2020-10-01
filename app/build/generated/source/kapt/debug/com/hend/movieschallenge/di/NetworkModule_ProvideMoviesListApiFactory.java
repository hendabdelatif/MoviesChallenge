package com.hend.movieschallenge.di;

import com.hend.movieschallenge.network.api.movies.MoviesListService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideMoviesListApiFactory implements Factory<MoviesListService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideMoviesListApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MoviesListService get() {
    return provideMoviesListApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideMoviesListApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideMoviesListApiFactory(retrofitProvider);
  }

  public static MoviesListService provideMoviesListApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideMoviesListApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
