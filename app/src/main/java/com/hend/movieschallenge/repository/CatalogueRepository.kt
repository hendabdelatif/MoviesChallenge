package com.hend.movieschallenge.repository

import androidx.annotation.WorkerThread
import com.hend.movieschallenge.network.api.images.ImagesClient
import com.hend.movieschallenge.network.api.movies.MoviesListClient
import com.hend.movieschallenge.network.response.ErrorResponse
import com.hend.movieschallenge.persistence.MovieDao
import com.hend.movieschallenge.persistence.dbmodels.DBMovie
import com.hend.movieschallenge.persistence.mappers.MoviesResponseMapper
import com.hend.movieschallenge.ui.errors.ErrorHandler
import com.hend.movieschallenge.ui.errors.NoDataException
import com.hend.movieschallenge.ui.errors.NoResponseException
import com.hend.movieschallenge.utils.Error
import com.hend.movieschallenge.utils.Success
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.flatMapConcat
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Repository used to get data from API service or database
 */
@ExperimentalCoroutinesApi
class CatalogueRepository @Inject constructor(
    private val imagesClient: ImagesClient,
    private val moviesListClient: MoviesListClient,
    private val movieDao: MovieDao
) {

    /**
     * Flow to get image API service then concat to flow of movies list API service
     */
    @FlowPreview
    @WorkerThread
    suspend fun getMoviesWithImagesUrl(sortBy: String, page: Int) = flow {
        emit(imagesClient.fetchImages())
    }.flatMapConcat {

        val url = it.let { response -> response.body()?.images }
        val size = url?.let { size -> size.poster_sizes.size - 1 }
        val imageBaseURL = url?.secure_base_url
        val listSize = url?.let { listSize -> listSize.poster_sizes[size!!] }
        getMovies(sortBy, page, imageBaseURL, listSize)
    }.flowOn(Dispatchers.IO)

    /**
     * Flow to get movies list from API
     */
    private fun getMovies(sortBy: String, page: Int, imageBaseURL: String?, imageSize: String?) =
        flow {
            emit(getMoviesFromAPI(sortBy, page, imageBaseURL, imageSize))
        }.flowOn(Dispatchers.IO)

    /**
     * Suspend function to get movies list from API
     */
    @WorkerThread
    suspend fun getMoviesFromAPI(
        sortBy: String,
        page: Int,
        imageBaseURL: String?,
        imageSize: String?
    ) = moviesListClient.fetchMoviesList(sortBy = sortBy, page = page)
        .run {
            if (isSuccessful && body() != null) {
                movieDao.insertDBMovie(MoviesResponseMapper(body()!!).map())
                getDataOrError(NoDataException(), imageBaseURL, imageSize)
            } else {
                Error(
                    NoResponseException(ErrorHandler.parseError<ErrorResponse>(errorBody())?.status_message)
                )
            }
        }

    /**
     * Suspend function to throw Error if no data found in database
     */
    private suspend fun getDataOrError(
        throwable: Throwable,
        imageBaseURL: String?,
        imageSize: String?
    ) =
        movieDao.get()
            ?.let { dbValue -> Success(getMoviesList(dbValue, imageBaseURL, imageSize)) }
            ?: Error(throwable)

    /**
     * Suspend function to get movies list from Database
     */
    private suspend fun getMoviesList(dbMovie: DBMovie, imageBaseURL: String?, imageSize: String?) =
        withContext(Dispatchers.Default) {
            dbMovie.movieData.results.map {
                it.full_poster_path = imageBaseURL.plus(imageSize).plus(it.poster_path)
                it.full_backdrop_path = imageBaseURL.plus(imageSize).plus(it.backdrop_path)
                movieDao.update(it)
                it
            }
        }

    /**
     * Get Dao to use outside the repository
     */
     fun getMovieDao() : MovieDao{
        return movieDao
    }
}