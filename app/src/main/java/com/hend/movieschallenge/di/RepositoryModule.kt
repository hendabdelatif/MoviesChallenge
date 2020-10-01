package com.hend.movieschallenge.di

import com.hend.movieschallenge.network.api.images.ImagesClient
import com.hend.movieschallenge.network.api.movies.MoviesListClient
import com.hend.movieschallenge.persistence.MovieDao
import com.hend.movieschallenge.repository.CatalogueRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Module contains creating Repository
 */
@ExperimentalCoroutinesApi
@Module
@InstallIn(ActivityRetainedComponent::class)
object RepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideMoviesListRepository(imagesClient: ImagesClient,
        moviesListClient: MoviesListClient, movieDao: MovieDao
    ): CatalogueRepository {
        return CatalogueRepository(imagesClient, moviesListClient, movieDao)
    }

}
