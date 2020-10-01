package com.hend.movieschallenge.ui.details;

import java.lang.System;

/**
 * ViewModel to get movie details data from database
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/hend/movieschallenge/ui/details/DetailsViewModel;", "Lcom/hend/movieschallenge/ui/base/BaseViewModel;", "catalogueRepository", "Lcom/hend/movieschallenge/repository/CatalogueRepository;", "(Lcom/hend/movieschallenge/repository/CatalogueRepository;)V", "_uiState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hend/movieschallenge/utils/UIStatus;", "id", "", "movieEntityLiveData", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "uiStatus", "Landroidx/lifecycle/LiveData;", "getUiStatus", "()Landroidx/lifecycle/LiveData;", "getMovieEntity", "setMovieId", "", "showDetails", "movieEntity", "app_debug"})
public final class DetailsViewModel extends com.hend.movieschallenge.ui.base.BaseViewModel {
    private int id = -1;
    
    /**
     * Live Data to get UI Status
     */
    private final androidx.lifecycle.MutableLiveData<com.hend.movieschallenge.utils.UIStatus> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hend.movieschallenge.utils.UIStatus> uiStatus = null;
    
    /**
     * Live Data to get MovieEntity
     */
    private final androidx.lifecycle.MutableLiveData<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> movieEntityLiveData = null;
    private final com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hend.movieschallenge.utils.UIStatus> getUiStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> getMovieEntity() {
        return null;
    }
    
    /**
     * Used to query selected Movie Entity from database
     */
    public final void setMovieId(int id) {
    }
    
    /**
     * Used to observe movie entity in the activity
     */
    private final void showDetails(com.hend.movieschallenge.persistence.dbmodels.MovieEntity movieEntity) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.repository.CatalogueRepository catalogueRepository) {
        super();
    }
}