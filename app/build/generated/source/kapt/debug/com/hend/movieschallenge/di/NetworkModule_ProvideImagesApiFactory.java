package com.hend.movieschallenge.di;

import com.hend.movieschallenge.network.api.images.ImagesService;
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
public final class NetworkModule_ProvideImagesApiFactory implements Factory<ImagesService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideImagesApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ImagesService get() {
    return provideImagesApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvideImagesApiFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideImagesApiFactory(retrofitProvider);
  }

  public static ImagesService provideImagesApi(Retrofit retrofit) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideImagesApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
