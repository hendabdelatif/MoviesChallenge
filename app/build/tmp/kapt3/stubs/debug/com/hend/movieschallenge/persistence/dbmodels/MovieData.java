package com.hend.movieschallenge.persistence.dbmodels;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"page"})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/hend/movieschallenge/persistence/dbmodels/MovieData;", "", "page", "", "total_results", "total_pages", "results", "", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "(IIILjava/util/List;)V", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotal_pages", "getTotal_results", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieData {
    private final int page = 0;
    private final int total_results = 0;
    private final int total_pages = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> results = null;
    
    public final int getPage() {
        return 0;
    }
    
    public final int getTotal_results() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> getResults() {
        return null;
    }
    
    public MovieData(int page, int total_results, int total_pages, @org.jetbrains.annotations.NotNull()
    java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> results) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hend.movieschallenge.persistence.dbmodels.MovieData copy(int page, int total_results, int total_pages, @org.jetbrains.annotations.NotNull()
    java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> results) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}