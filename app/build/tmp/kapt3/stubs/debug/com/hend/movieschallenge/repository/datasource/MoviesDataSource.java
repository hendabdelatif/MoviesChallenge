package com.hend.movieschallenge.repository.datasource;

import java.lang.System;

/**
 * DataSource and PagedList configuration
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ*\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001bH\u0017J*\u0010\u001c\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001bH\u0016J*\u0010\u001d\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001fH\u0017R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/hend/movieschallenge/repository/datasource/MoviesDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "sortBy", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "catalogueRepository", "Lcom/hend/movieschallenge/repository/CatalogueRepository;", "networkHelper", "Lcom/hend/movieschallenge/network/connection/NetworkHelper;", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;Lcom/hend/movieschallenge/repository/CatalogueRepository;Lcom/hend/movieschallenge/network/connection/NetworkHelper;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hend/movieschallenge/utils/UIStatus;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "uiStatus", "Landroidx/lifecycle/LiveData;", "getUiStatus", "()Landroidx/lifecycle/LiveData;", "loadAfter", "", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "callback", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "Companion", "app_debug"})
public final class MoviesDataSource extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> {
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final androidx.lifecycle.MutableLiveData<com.hend.movieschallenge.utils.UIStatus> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hend.movieschallenge.utils.UIStatus> uiStatus = null;
    private final java.lang.String sortBy = null;
    private final com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository = null;
    private final com.hend.movieschallenge.network.connection.NetworkHelper networkHelper = null;
    private static final int FIRST_PAGE = 1;
    public static final com.hend.movieschallenge.repository.datasource.MoviesDataSource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hend.movieschallenge.utils.UIStatus> getUiStatus() {
        return null;
    }
    
    @kotlinx.coroutines.FlowPreview()
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> callback) {
    }
    
    @kotlinx.coroutines.FlowPreview()
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.hend.movieschallenge.persistence.dbmodels.MovieEntity> callback) {
    }
    
    public MoviesDataSource(@org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.network.connection.NetworkHelper networkHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hend/movieschallenge/repository/datasource/MoviesDataSource$Companion;", "", "()V", "FIRST_PAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}