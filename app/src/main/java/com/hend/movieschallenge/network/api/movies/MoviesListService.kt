package com.hend.movieschallenge.network.api.movies

import com.hend.movieschallenge.network.response.MoviesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Service API to fetch movies list
 */
interface MoviesListService {

  @GET("movie")
  suspend fun fetchMoviesList(
    @Query("api_key") apiKey: String,
    @Query("sort_by") sortBy: String,
    @Query("page") page: Int
  ): Response<MoviesResponse>

}
