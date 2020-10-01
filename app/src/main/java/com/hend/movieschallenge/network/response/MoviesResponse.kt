package com.hend.movieschallenge.network.response

/**
 * Movie classes used in API response
 */
data class MoviesResponse(
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<Movie>
)

data class Movie(
    val id: Int,
    val popularity: Double,
    val vote_count: Int,
    val video: Boolean,
    val poster_path: String,
    val adult: Boolean,
    val backdrop_path: String,
    val original_language: String,
    val title: String,
    val vote_average: Double,
    val overview: String,
    val release_date: String
)




