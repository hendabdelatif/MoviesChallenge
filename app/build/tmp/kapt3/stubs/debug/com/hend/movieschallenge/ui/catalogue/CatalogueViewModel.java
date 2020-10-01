package com.hend.movieschallenge.ui.catalogue;

import java.lang.System;

/**
 * ViewModel to get movies paging lists from data source
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\nJ\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/hend/movieschallenge/ui/catalogue/CatalogueViewModel;", "Lcom/hend/movieschallenge/ui/base/BaseViewModel;", "catalogueRepository", "Lcom/hend/movieschallenge/repository/CatalogueRepository;", "networkHelper", "Lcom/hend/movieschallenge/network/connection/NetworkHelper;", "(Lcom/hend/movieschallenge/repository/CatalogueRepository;Lcom/hend/movieschallenge/network/connection/NetworkHelper;)V", "popularDataSourceFactory", "Lcom/hend/movieschallenge/repository/datasource/MoviesDataSourceFactory;", "popularityMoviesLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "releaseDataSourceFactory", "releaseDateMoviesLiveData", "revenueDataSourceFactory", "revenueMoviesLiveData", "voteAverageDataSourceFactory", "voteAverageMoviesLiveData", "getPopularityMovies", "getReleaseDateMovies", "getRevenueMovies", "getUIState", "Lcom/hend/movieschallenge/utils/UIStatus;", "getVoteAverageMovies", "app_debug"})
public final class CatalogueViewModel extends com.hend.movieschallenge.ui.base.BaseViewModel {
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> popularityMoviesLiveData;
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> releaseDateMoviesLiveData;
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> revenueMoviesLiveData;
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> voteAverageMoviesLiveData;
    private com.hend.movieschallenge.repository.datasource.MoviesDataSourceFactory popularDataSourceFactory;
    private com.hend.movieschallenge.repository.datasource.MoviesDataSourceFactory releaseDataSourceFactory;
    private com.hend.movieschallenge.repository.datasource.MoviesDataSourceFactory revenueDataSourceFactory;
    private com.hend.movieschallenge.repository.datasource.MoviesDataSourceFactory voteAverageDataSourceFactory;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hend.movieschallenge.utils.UIStatus> getUIState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> getPopularityMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> getReleaseDateMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> getRevenueMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity>> getVoteAverageMovies() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public CatalogueViewModel(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.connection.NetworkHelper networkHelper) {
        super();
    }
}