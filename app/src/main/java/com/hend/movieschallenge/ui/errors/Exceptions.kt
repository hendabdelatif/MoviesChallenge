package com.hend.movieschallenge.ui.errors

import com.hend.movieschallenge.MainApplication.Companion.applicationContext
import com.hend.movieschallenge.R

/**
 * Throwable exception when to pass throw Error object when API throw exception
 */
class NoResponseException(message: String? = applicationContext.getString(R.string.unknown_error)) :
    Exception(message)

/**
 * Throwable exception when no data found in database
 */
class NoDataException(message: String? = applicationContext.getString(R.string.data_not_found_in_database)) :
    Exception()