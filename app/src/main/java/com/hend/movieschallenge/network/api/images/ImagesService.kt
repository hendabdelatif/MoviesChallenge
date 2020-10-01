package com.hend.movieschallenge.network.api.images

import com.hend.movieschallenge.network.response.ImageResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

/**
 * Service API to fetch movies list
 */
interface ImagesService {

    @GET
    suspend fun fetchImages(@Url IMAGES_BASE_URL: String, @Query("api_key") apiKey: String)
            : Response<ImageResponse>

}
