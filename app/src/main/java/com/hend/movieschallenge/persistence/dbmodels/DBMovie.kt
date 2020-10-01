package com.hend.movieschallenge.persistence.dbmodels

import androidx.room.Embedded
import androidx.room.Entity

/**
 * Entity classes used in database
 */
data class DBMovie(@Embedded val movieData: MovieData)

@Entity(primaryKeys = ["page"])
data class MovieData(
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<MovieEntity>
)


@Entity(primaryKeys = ["id"])
data class MovieEntity(
    val id: Int,
    val popularity: Double,
    val vote_count: Int,
    val video: Boolean,
    var poster_path: String? = "",
    val adult: Boolean,
    var backdrop_path: String? = "",
    var original_language: String? = "",
    var title: String? = "",
    val vote_average: Double,
    var overview: String? = "",
    var release_date: String? = "",
    var full_poster_path: String? = "",
    var full_backdrop_path: String? = ""
)