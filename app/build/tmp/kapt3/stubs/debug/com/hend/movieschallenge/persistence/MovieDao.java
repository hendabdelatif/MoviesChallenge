package com.hend.movieschallenge.persistence;

import java.lang.System;

/**
 * Contains all queries required on database
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/hend/movieschallenge/persistence/MovieDao;", "", "get", "Lcom/hend/movieschallenge/persistence/dbmodels/DBMovie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieEntityById", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieEntityByTitle", "title", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "movieData", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieData;", "(Lcom/hend/movieschallenge/persistence/dbmodels/MovieData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDBMovie", "dbMovie", "(Lcom/hend/movieschallenge/persistence/dbmodels/DBMovie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMovie", "movieEntity", "(Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.dbmodels.MovieData movieData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.dbmodels.MovieEntity movieEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.dbmodels.MovieEntity movieEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Transaction()
    public abstract java.lang.Object insertDBMovie(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.dbmodels.DBMovie dbMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM MovieData LIMIT 1")
    @androidx.room.Transaction()
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hend.movieschallenge.persistence.dbmodels.DBMovie> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM MovieEntity WHERE id = :id LIMIT 1")
    @androidx.room.Transaction()
    public abstract java.lang.Object getMovieEntityById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hend.movieschallenge.persistence.dbmodels.MovieEntity> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM MovieEntity WHERE title = :title LIMIT 1")
    @androidx.room.Transaction()
    public abstract java.lang.Object getMovieEntityByTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hend.movieschallenge.persistence.dbmodels.MovieEntity> p1);
    
    /**
     * Contains all queries required on database
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.room.Transaction()
        public static java.lang.Object insertDBMovie(@org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.MovieDao $this, @org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.DBMovie dbMovie, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
            return null;
        }
    }
}