package com.hend.movieschallenge.persistence.mappers;

import java.lang.System;

/**
 * Mapping Movie object retrieved from API to a new MovieEntity object used as a database entity
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/hend/movieschallenge/persistence/mappers/MoviesResponseMapper;", "Lcom/hend/movieschallenge/persistence/mappers/Mapper;", "Lcom/hend/movieschallenge/persistence/dbmodels/DBMovie;", "moviesResponse", "Lcom/hend/movieschallenge/network/response/MoviesResponse;", "(Lcom/hend/movieschallenge/network/response/MoviesResponse;)V", "getMapping", "app_debug"})
public final class MoviesResponseMapper implements com.hend.movieschallenge.persistence.mappers.Mapper<com.hend.movieschallenge.persistence.dbmodels.DBMovie> {
    private final com.hend.movieschallenge.network.response.MoviesResponse moviesResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public com.hend.movieschallenge.persistence.dbmodels.DBMovie getMapping() {
        return null;
    }
    
    public MoviesResponseMapper(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.response.MoviesResponse moviesResponse) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public java.lang.Object map(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hend.movieschallenge.persistence.dbmodels.DBMovie> p0) {
        return null;
    }
}