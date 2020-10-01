package com.hend.movieschallenge.ui.catalogue;

import java.lang.System;

/**
 * Activity to show four movie list categories with infinitely scrolling
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0014J\b\u0010\u0019\u001a\u00020\rH\u0014J\b\u0010\u001a\u001a\u00020\rH\u0014J\b\u0010\u001b\u001a\u00020\rH\u0002J\b\u0010\u001c\u001a\u00020\rH\u0002J\b\u0010\u001d\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/hend/movieschallenge/ui/catalogue/CatalogueActivity;", "Lcom/hend/movieschallenge/ui/base/BaseActivity;", "()V", "binding", "Lcom/hend/movieschallenge/databinding/ActivityCatalogueBinding;", "catalogueViewModel", "Lcom/hend/movieschallenge/ui/catalogue/CatalogueViewModel;", "popularMoviesAdapter", "Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter;", "releaseDateMoviesAdapter", "revenueMoviesAdapter", "voteAverageMoviesAdapter", "bindPopularData", "", "moviesList", "Landroidx/paging/PagedList;", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "bindReleaseData", "bindRevenueData", "bindVoteAverageData", "handlePopularResponse", "handleReleaseDateResponse", "handleRevenueResponse", "handleVoteAverageResponse", "init", "initViewBinding", "observeViewModel", "viewErrorData", "viewHasData", "viewLoadingData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CatalogueActivity extends com.hend.movieschallenge.ui.base.BaseActivity {
    private com.hend.movieschallenge.ui.catalogue.CatalogueViewModel catalogueViewModel;
    private com.hend.movieschallenge.databinding.ActivityCatalogueBinding binding;
    private final com.hend.movieschallenge.ui.adapters.MoviesAdapter popularMoviesAdapter = null;
    private final com.hend.movieschallenge.ui.adapters.MoviesAdapter releaseDateMoviesAdapter = null;
    private final com.hend.movieschallenge.ui.adapters.MoviesAdapter revenueMoviesAdapter = null;
    private final com.hend.movieschallenge.ui.adapters.MoviesAdapter voteAverageMoviesAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void init() {
    }
    
    @java.lang.Override()
    protected void initViewBinding() {
    }
    
    @java.lang.Override()
    protected void observeViewModel() {
    }
    
    private final void handlePopularResponse(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void handleReleaseDateResponse(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void handleRevenueResponse(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void handleVoteAverageResponse(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void bindPopularData(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void bindReleaseData(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void bindRevenueData(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void bindVoteAverageData(androidx.paging.PagedList<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> moviesList) {
    }
    
    private final void viewHasData() {
    }
    
    private final void viewErrorData() {
    }
    
    private final void viewLoadingData() {
    }
    
    public CatalogueActivity() {
        super();
    }
}