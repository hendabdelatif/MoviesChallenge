package com.hend.movieschallenge.ui.base;

import java.lang.System;

/**
 * Abstract class with commonly used abstract methods and network connection handler live data through the app
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H$J\b\u0010\u0007\u001a\u00020\u0006H$J\b\u0010\b\u001a\u00020\u0006H$J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hend/movieschallenge/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "networkConnection", "Lcom/hend/movieschallenge/network/connection/NetworkConnection;", "init", "", "initViewBinding", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.hend.movieschallenge.network.connection.NetworkConnection networkConnection;
    private java.util.HashMap _$_findViewCache;
    
    protected abstract void init();
    
    protected abstract void initViewBinding();
    
    protected abstract void observeViewModel();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseActivity() {
        super();
    }
}