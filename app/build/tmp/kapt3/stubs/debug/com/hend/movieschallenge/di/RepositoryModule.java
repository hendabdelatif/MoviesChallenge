package com.hend.movieschallenge.di;

import java.lang.System;

/**
 * Module contains creating Repository
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityRetainedComponent.class})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/hend/movieschallenge/di/RepositoryModule;", "", "()V", "provideMoviesListRepository", "Lcom/hend/movieschallenge/repository/CatalogueRepository;", "imagesClient", "Lcom/hend/movieschallenge/network/api/images/ImagesClient;", "moviesListClient", "Lcom/hend/movieschallenge/network/api/movies/MoviesListClient;", "movieDao", "Lcom/hend/movieschallenge/persistence/MovieDao;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    public static final com.hend.movieschallenge.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityRetainedScoped()
    @dagger.Provides()
    public final com.hend.movieschallenge.repository.CatalogueRepository provideMoviesListRepository(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.images.ImagesClient imagesClient, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.movies.MoviesListClient moviesListClient, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.MovieDao movieDao) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}