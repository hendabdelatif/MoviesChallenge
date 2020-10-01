package com.hend.movieschallenge.repository.datasource;

import java.lang.System;

/**
 * Retrieving the data using the DataSource and PagedList configuration
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hend/movieschallenge/repository/datasource/MoviesDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "sortBy", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "catalogueRepository", "Lcom/hend/movieschallenge/repository/CatalogueRepository;", "networkHelper", "Lcom/hend/movieschallenge/network/connection/NetworkHelper;", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lcom/hend/movieschallenge/repository/CatalogueRepository;Lcom/hend/movieschallenge/network/connection/NetworkHelper;)V", "dataSourceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hend/movieschallenge/repository/datasource/MoviesDataSource;", "getDataSourceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class MoviesDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.hend.movieschallenge.repository.datasource.MoviesDataSource> dataSourceLiveData = null;
    private final java.lang.String sortBy = null;
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    private final com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository = null;
    private final com.hend.movieschallenge.network.connection.NetworkHelper networkHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.hend.movieschallenge.repository.datasource.MoviesDataSource> getDataSourceLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> create() {
        return null;
    }
    
    public MoviesDataSourceFactory(@org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.connection.NetworkHelper networkHelper) {
        super();
    }
}