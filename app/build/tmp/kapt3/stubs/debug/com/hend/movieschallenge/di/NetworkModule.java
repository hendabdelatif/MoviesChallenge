package com.hend.movieschallenge.di;

import java.lang.System;

/**
 * Module contains creating Retrofit, HTTPClient, API Services and Clients
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/hend/movieschallenge/di/NetworkModule;", "", "()V", "provideImagesApi", "Lcom/hend/movieschallenge/network/api/images/ImagesService;", "retrofit", "Lretrofit2/Retrofit;", "provideImagesClient", "Lcom/hend/movieschallenge/network/api/images/ImagesClient;", "imagesService", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideMoviesListApi", "Lcom/hend/movieschallenge/network/api/movies/MoviesListService;", "provideMoviesListClient", "Lcom/hend/movieschallenge/network/api/movies/MoviesListClient;", "moviesListService", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "moshi", "provideRetrofit", "client", "Ldagger/Lazy;", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    public static final com.hend.movieschallenge.di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<okhttp3.OkHttpClient> client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.network.api.movies.MoviesListService provideMoviesListApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.network.api.movies.MoviesListClient provideMoviesListClient(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.movies.MoviesListService moviesListService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.network.api.images.ImagesService provideImagesApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.network.api.images.ImagesClient provideImagesClient(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.images.ImagesService imagesService) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}