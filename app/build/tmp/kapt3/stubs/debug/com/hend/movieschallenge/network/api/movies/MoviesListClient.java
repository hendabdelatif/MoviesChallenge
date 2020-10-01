package com.hend.movieschallenge.network.api.movies;

import java.lang.System;

/**
 * Contains suspended function to invoke
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/hend/movieschallenge/network/api/movies/MoviesListClient;", "", "moviesListService", "Lcom/hend/movieschallenge/network/api/movies/MoviesListService;", "(Lcom/hend/movieschallenge/network/api/movies/MoviesListService;)V", "fetchMoviesList", "Lretrofit2/Response;", "Lcom/hend/movieschallenge/network/response/MoviesResponse;", "sortBy", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MoviesListClient {
    private final com.hend.movieschallenge.network.api.movies.MoviesListService moviesListService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fetchMoviesList(@org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.hend.movieschallenge.network.response.MoviesResponse>> p2) {
        return null;
    }
    
    public MoviesListClient(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.api.movies.MoviesListService moviesListService) {
        super();
    }
}