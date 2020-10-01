package com.hend.movieschallenge.ui.errors;

import java.lang.System;

/**
 * Singleton Handler to parse and handle errors
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004J\"\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\u0006\b\u0000\u0010\u0014\u0018\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0086\b\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/hend/movieschallenge/ui/errors/ErrorHandler;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "setMoshi", "(Lcom/squareup/moshi/Moshi;)V", "handleError", "", "view", "Landroid/view/View;", "throwable", "Lcom/hend/movieschallenge/utils/Error;", "shouldToast", "", "shouldShowSnackBar", "initialize", "parseError", "T", "responseBody", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "showLongToast", "context", "Landroid/content/Context;", "message", "", "app_debug"})
public final class ErrorHandler {
    @org.jetbrains.annotations.NotNull()
    public static com.squareup.moshi.Moshi moshi;
    public static final com.hend.movieschallenge.ui.errors.ErrorHandler INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    public final void setMoshi(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi p0) {
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
    }
    
    public final void handleError(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.hend.movieschallenge.utils.Error throwable, boolean shouldToast, boolean shouldShowSnackBar) {
    }
    
    private final void showLongToast(android.content.Context context, java.lang.String message) {
    }
    
    private ErrorHandler() {
        super();
    }
}