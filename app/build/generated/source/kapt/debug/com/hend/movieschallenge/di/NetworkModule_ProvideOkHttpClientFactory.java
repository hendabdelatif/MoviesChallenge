package com.hend.movieschallenge.di;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<Moshi> moshiProvider;

  public NetworkModule_ProvideOkHttpClientFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(moshiProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(Provider<Moshi> moshiProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(moshiProvider);
  }

  public static OkHttpClient provideOkHttpClient(Moshi moshi) {
    return Preconditions.checkNotNull(NetworkModule.INSTANCE.provideOkHttpClient(moshi), "Cannot return null from a non-@Nullable @Provides method");
  }
}
