package com.hend.movieschallenge.utils

import com.hend.movieschallenge.MainApplication.Companion.applicationContext
import com.hend.movieschallenge.R

/**
 * Base class to represent common Server states
 */
sealed class StatusResult<out T : Any>

class Success<out T : Any>(val data: T) : StatusResult<T>()

class Error(
    val exception: Throwable,
    val message: String = exception.message ?: applicationContext.getString(R.string.unknown_error)
) : StatusResult<Nothing>()

object Progress : StatusResult<Nothing>()


