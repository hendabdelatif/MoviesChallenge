package com.hend.movieschallenge.di;

import java.lang.System;

/**
 * Module contains creating Database and DAO
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/hend/movieschallenge/di/PersistenceModule;", "", "()V", "provideAppDatabase", "Lcom/hend/movieschallenge/persistence/AppDatabase;", "application", "Landroid/app/Application;", "provideMovieDao", "Lcom/hend/movieschallenge/persistence/MovieDao;", "appDatabase", "app_debug"})
@dagger.Module()
public final class PersistenceModule {
    public static final com.hend.movieschallenge.di.PersistenceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.persistence.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.hend.movieschallenge.persistence.MovieDao provideMovieDao(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.persistence.AppDatabase appDatabase) {
        return null;
    }
    
    private PersistenceModule() {
        super();
    }
}