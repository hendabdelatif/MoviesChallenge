package com.hend.movieschallenge.utils

/**
 * Base class to represent common UI states
 */
sealed class UIStatus

/**
 * the screen is currently loading it's data.
 */
object Loading : UIStatus()

/**
 * data was successfully loaded for the screen.
 */
object HasData : UIStatus()

/**
 * some type of error occurred.
 */
object UIError : UIStatus()