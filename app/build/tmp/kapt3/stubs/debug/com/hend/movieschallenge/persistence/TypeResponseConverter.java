package com.hend.movieschallenge.persistence;

import java.lang.System;

/**
 * Used to put it on list of MovieEntity in order to save it to Room database
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/hend/movieschallenge/persistence/TypeResponseConverter;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "fromMovieType", "", "type", "", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "fromStringType", "value", "app_debug"})
public final class TypeResponseConverter {
    private static final com.squareup.moshi.Moshi moshi = null;
    public static final com.hend.movieschallenge.persistence.TypeResponseConverter INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> fromStringType(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public static final java.lang.String fromMovieType(@org.jetbrains.annotations.Nullable()
    java.util.List<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> type) {
        return null;
    }
    
    private TypeResponseConverter() {
        super();
    }
}