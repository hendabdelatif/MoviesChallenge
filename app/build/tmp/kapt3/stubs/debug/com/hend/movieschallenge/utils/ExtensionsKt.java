package com.hend.movieschallenge.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u00012\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0081\b\u00f8\u0001\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\t\u001a<\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\b*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, d2 = {"callFactory", "Lretrofit2/Retrofit$Builder;", "kotlin.jvm.PlatformType", "body", "Lkotlin/Function1;", "Lokhttp3/Request;", "Lokhttp3/Call;", "cancelIfActive", "", "Lkotlinx/coroutines/Job;", "listen", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "event", "", "Lkotlin/ParameterName;", "name", "position", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function1;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "loadImageUrl", "Landroid/widget/ImageView;", "imageUrl", "", "progressBar", "Landroid/widget/ProgressBar;", "app_debug"})
public final class ExtensionsKt {
    
    /**
     * Extension to set OnClick event on a recyclerview item
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.recyclerview.widget.RecyclerView.ViewHolder>T listen(@org.jetbrains.annotations.NotNull()
    T $this$listen, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> event) {
        return null;
    }
    
    /**
     * Extension to call factory when create a new Retrofit instance
     */
    @kotlin.PublishedApi()
    public static final retrofit2.Retrofit.Builder callFactory(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder $this$callFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super okhttp3.Request, ? extends okhttp3.Call> body) {
        return null;
    }
    
    /**
     * Extension to cancel current job if active
     */
    public static final void cancelIfActive(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job $this$cancelIfActive) {
    }
    
    /**
     * Extension to render, load and cash imageUrl into ImageView
     */
    public static final void loadImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUrl, @org.jetbrains.annotations.Nullable()
    android.widget.ProgressBar progressBar) {
    }
}