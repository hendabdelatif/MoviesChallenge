package com.hend.movieschallenge.persistence.mappers

import androidx.annotation.WorkerThread
import com.hend.movieschallenge.network.response.MoviesResponse
import com.hend.movieschallenge.persistence.dbmodels.DBMovie
import com.hend.movieschallenge.persistence.dbmodels.MovieData
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity

/**
 * Mapping Movie object retrieved from API to a new MovieEntity object used as a database entity
 */
class MoviesResponseMapper (private val moviesResponse: MoviesResponse) : Mapper<DBMovie> {

    @WorkerThread
    override fun getMapping(): DBMovie {

        return DBMovie(
            MovieData(
                moviesResponse.page, moviesResponse.total_results, moviesResponse.total_pages,
                moviesResponse.results.asSequence().map {
                    MovieEntity(
                        it.id,
                        it.popularity,
                        it.vote_count,
                        it.video,
                        it.poster_path,
                        it.adult,
                        it.backdrop_path,
                        it.original_language,
                        it.title,
                        it.vote_average,
                        it.overview,
                        it.release_date,
                        ""
                    )

                }.toList()
            )
        )
    }
}