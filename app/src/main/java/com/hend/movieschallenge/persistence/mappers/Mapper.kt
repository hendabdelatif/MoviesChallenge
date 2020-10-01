package com.hend.movieschallenge.persistence.mappers

import androidx.annotation.WorkerThread
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Mapper Interface used for mapping objects
 */
interface Mapper<T> {

    @WorkerThread
    suspend fun map(): T {
        return withContext(Dispatchers.Default) {
            getMapping()
        }
    }

    @WorkerThread
    fun getMapping(): T
}