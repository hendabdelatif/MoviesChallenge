package com.hend.movieschallenge.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth
import com.hend.movieschallenge.network.api.movies.MoviesListClient
import com.hend.movieschallenge.network.response.Movie
import com.hend.movieschallenge.utils.SORT_BY_POPULARITY
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

/**
 * Test class to test the behaviour of fetching movies list
 */
@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class CatalogueRepositoryTest {

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var moviesListClient: MoviesListClient


    @Test
    fun `fetch movies list return success`() = runBlockingTest {
        Mockito.doReturn(emptyList<Movie>())
            .`when`(moviesListClient)
            .fetchMoviesList(SORT_BY_POPULARITY, 1)

        Truth.assert_().that(
            moviesListClient.fetchMoviesList(SORT_BY_POPULARITY, 1)
        ).isNotNull()
    }

    @Test
    fun `fetch movies list return error`() = runBlockingTest {
        Mockito.doReturn(emptyList<Movie>())
            .`when`(moviesListClient)
            .fetchMoviesList(SORT_BY_POPULARITY, 1)

        Truth.assert_().that(
            moviesListClient.fetchMoviesList(SORT_BY_POPULARITY, 0)
        ).isNull()
    }


}