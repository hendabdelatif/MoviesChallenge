package com.hend.movieschallenge.ui.details;

import java.lang.System;

/**
 * Activity to show Movies details
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hend/movieschallenge/ui/details/DetailsActivity;", "Lcom/hend/movieschallenge/ui/base/BaseActivity;", "()V", "binding", "Lcom/hend/movieschallenge/databinding/ActivityDetailsBinding;", "detailsViewModel", "Lcom/hend/movieschallenge/ui/details/DetailsViewModel;", "movieId", "", "init", "", "initViewBinding", "observeViewModel", "viewErrorData", "viewHasData", "viewLoadingData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailsActivity extends com.hend.movieschallenge.ui.base.BaseActivity {
    private com.hend.movieschallenge.ui.details.DetailsViewModel detailsViewModel;
    private com.hend.movieschallenge.databinding.ActivityDetailsBinding binding;
    private int movieId = 0;
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
    
    private final void viewHasData() {
    }
    
    private final void viewErrorData() {
    }
    
    private final void viewLoadingData() {
    }
    
    public DetailsActivity() {
        super();
    }
}