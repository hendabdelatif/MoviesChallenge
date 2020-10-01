package com.hend.movieschallenge.repository;

import java.lang.System;

/**
 * Repository used to get data from API service or database
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0007J>\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002JA\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ3\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/hend/movieschallenge/repository/CatalogueRepository;", "", "imagesClient", "Lcom/hend/movieschallenge/network/api/images/ImagesClient;", "moviesListClient", "Lcom/hend/movieschallenge/network/api/movies/MoviesListClient;", "movieDao", "Lcom/hend/movieschallenge/persistence/MovieDao;", "(Lcom/hend/movieschallenge/network/api/images/ImagesClient;Lcom/hend/movieschallenge/network/api/movies/MoviesListClient;Lcom/hend/movieschallenge/persistence/MovieDao;)V", "getDataOrError", "Lcom/hend/movieschallenge/utils/StatusResult;", "", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "throwable", "", "imageBaseURL", "", "imageSize", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDao", "getMovies", "Lkotlinx/coroutines/flow/Flow;", "sortBy", "page", "", "getMoviesFromAPI", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesList", "dbMovie", "Lcom/hend/movieschallenge/persistence/dbmodels/DBMovie;", "(Lcom/hend/movieschallenge/persistence/dbmodels/DBMovie;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesWithImagesUrl", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CatalogueRepository {
    private final com.hend.movieschallenge.network.api.images.ImagesClient imagesClient = null;
    private final com.hend.movieschallenge.network.api.movies.MoviesListClient moviesListClient = null;
    private final com.hend.movieschallenge.persistence.MovieDao movieDao = null;
    
    /**
     * Flow to get image API service then concat to flow of movies list API service
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlinx.coroutines.FlowPreview()
    public final java.lang.Object getMoviesWithImagesUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.hend.movieschallenge.utils.StatusResult<? extends java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>>>> p2) {
        return null;
    }
    
    /**
     * Flow to get movies list from API
     */
    private final kotlinx.coroutines.flow.Flow<com.hend.movieschallenge.utils.StatusResult<java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>>> getMovies(java.lang.String sortBy, int page, java.lang.String imageBaseURL, java.lang.String imageSize) {
        return null;
    }
    
    /**
     * Suspend function to get movies list from API
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public final java.lang.Object getMoviesFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, int page, @org.jetbrains.annotations.Nullable()
    java.lang.String imageBaseURL, @org.jetbrains.annotations.Nullable()
    java.lang.String imageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hend.movieschallenge.utils.StatusResult<? extends java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>>> p4) {
        return null;
    }
    
    /**
     * Get Dao to use outside the repository
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hend.movieschallenge.persistence.MovieDao getMovieDao() {
        return null;
    }
    
    @javax.inject.Inject()
    public CatalogueRepository(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.images.ImagesClient imagesClient, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.movies.MoviesListClient moviesListClient, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.MovieDao movieDao) {
        super();
    }
}