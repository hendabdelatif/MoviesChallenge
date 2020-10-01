package com.hend.movieschallenge.ui.adapters;

import java.lang.System;

/**
 * Movies paging list adapter to display paging feature
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0017\u00a8\u0006\u0010"}, d2 = {"Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter$MyViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffUtilCallBack", "MyViewHolder", "app_debug"})
public final class MoviesAdapter extends androidx.paging.PagedListAdapter<com.hend.movieschallenge.persistence.dbmodels.MovieEntity, com.hend.movieschallenge.ui.adapters.MoviesAdapter.MyViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    @java.lang.Override()
    public com.hend.movieschallenge.ui.adapters.MoviesAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.ui.adapters.MoviesAdapter.MyViewHolder holder, int position) {
    }
    
    public MoviesAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter$DiffUtilCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    static final class DiffUtilCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.hend.movieschallenge.persistence.dbmodels.MovieEntity> {
        public static final com.hend.movieschallenge.ui.adapters.MoviesAdapter.DiffUtilCallBack INSTANCE = null;
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.MovieEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.MovieEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.MovieEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.MovieEntity newItem) {
            return false;
        }
        
        private DiffUtilCallBack() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgMovie", "Landroidx/appcompat/widget/AppCompatImageView;", "kotlin.jvm.PlatformType", "progressBar", "Landroid/widget/ProgressBar;", "bindMovie", "", "movie", "Lcom/hend/movieschallenge/persistence/dbmodels/MovieEntity;", "Companion", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.appcompat.widget.AppCompatImageView imgMovie = null;
        private final android.widget.ProgressBar progressBar = null;
        public static final com.hend.movieschallenge.ui.adapters.MoviesAdapter.MyViewHolder.Companion Companion = null;
        
        public final void bindMovie(@org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.dbmodels.MovieEntity movie) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter$MyViewHolder$Companion;", "", "()V", "create", "Lcom/hend/movieschallenge/ui/adapters/MoviesAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.hend.movieschallenge.ui.adapters.MoviesAdapter.MyViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}