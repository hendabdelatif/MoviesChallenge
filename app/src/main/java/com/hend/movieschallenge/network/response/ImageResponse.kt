package com.hend.movieschallenge.network.response

/**
 * Image classes used in API response
 */
data class ImageResponse (val images: Images)

data class Images(
    val base_url: String,
    val secure_base_url: String,
    val backdrop_sizes: List<String>,
    val logo_sizes: List<String>,
    val poster_sizes: List<String>
)