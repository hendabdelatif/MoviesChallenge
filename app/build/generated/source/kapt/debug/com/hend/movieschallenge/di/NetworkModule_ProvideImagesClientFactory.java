package com.hend.movieschallenge.di;

import com.hend.movieschallenge.network.api.images.ImagesClient;
import com.hend.movieschallenge.network.api.images.ImagesService;
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
public final class NetworkModule_ProvideImagesClientFactory implements Factory<ImagesClient> {
  private final Provider<ImagesService> imagesServiceProvider;

  public NetworkModule_ProvideImagesClientFactory(Provider<ImagesService> imagesServiceProvider) {
    this.imagesServiceProvider = imagesServiceProvider;
  }

  @Override
  public ImagesClient get() {
    return provideImagesClient(imagesServiceProvider.get());
  }

  public static NetworkModule_ProvideImagesClientFactory create(
      Provider<ImagesService> imagesServiceProvider) {
    return new NetworkModule_ProvideImagesClientFactory(imagesServiceProvider);
  }

  public static ImagesClient provideImagesClient(ImagesService imagesService) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideImagesClient(imagesService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
