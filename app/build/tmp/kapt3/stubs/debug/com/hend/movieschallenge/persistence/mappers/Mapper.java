package com.hend.movieschallenge.persistence.mappers;

import java.lang.System;

/**
 * Mapper Interface used for mapping objects
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00028\u0000H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/hend/movieschallenge/persistence/mappers/Mapper;", "T", "", "getMapping", "()Ljava/lang/Object;", "map", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface Mapper<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    public abstract java.lang.Object map(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> p0);
    
    @androidx.annotation.WorkerThread()
    public abstract T getMapping();
    
    /**
     * Mapper Interface used for mapping objects
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.WorkerThread()
        public static <T extends java.lang.Object>java.lang.Object map(@org.jetbrains.annotations.NotNull()
        com.hend.movieschallenge.persistence.mappers.Mapper<T> $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super T> p1) {
            return null;
        }
    }
}