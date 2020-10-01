package com.hend.movieschallenge.network.response

/**
 * Error class used in API response
 */
data class ErrorResponse(val status_code: Int, val status_message: String, val success : Boolean)