package com.hend.movieschallenge.di

import com.hend.movieschallenge.network.api.HttpRequestInterceptor
import com.hend.movieschallenge.network.api.images.ImagesClient
import com.hend.movieschallenge.network.api.images.ImagesService
import com.hend.movieschallenge.network.api.movies.MoviesListClient
import com.hend.movieschallenge.network.api.movies.MoviesListService
import com.hend.movieschallenge.ui.errors.ErrorHandler
import com.hend.movieschallenge.utils.BASE_URL
import com.hend.movieschallenge.utils.callFactory
import com.squareup.moshi.Moshi
import dagger.Lazy
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Module contains creating Retrofit, HTTPClient, API Services and Clients
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi.Builder().build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(moshi: Moshi): OkHttpClient {
        ErrorHandler.initialize(moshi)
        return OkHttpClient.Builder()
            .addInterceptor(HttpRequestInterceptor())
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: Lazy<OkHttpClient>): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .callFactory { client.get().newCall(it) }
            .build()
    }

    @Provides
    @Singleton
    fun provideMoviesListApi(retrofit: Retrofit): MoviesListService {
        return retrofit.create(MoviesListService::class.java)
    }

    @Provides
    @Singleton
    fun provideMoviesListClient(moviesListService: MoviesListService): MoviesListClient {
        return MoviesListClient(moviesListService)
    }

    @Provides
    @Singleton
    fun provideImagesApi(retrofit: Retrofit): ImagesService {
        return retrofit.create(ImagesService::class.java)
    }

    @Provides
    @Singleton
    fun provideImagesClient(imagesService: ImagesService): ImagesClient {
        return ImagesClient(imagesService)
    }
}
