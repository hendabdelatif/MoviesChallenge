package com.hend.movieschallenge.ui.catalogue

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.hend.movieschallenge.network.connection.NetworkHelper
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.repository.CatalogueRepository
import com.hend.movieschallenge.repository.datasource.MoviesDataSource
import com.hend.movieschallenge.repository.datasource.MoviesDataSourceFactory
import com.hend.movieschallenge.ui.base.BaseViewModel
import com.hend.movieschallenge.utils.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * ViewModel to get movies paging lists from data source
 */
@ExperimentalCoroutinesApi
class CatalogueViewModel @ViewModelInject constructor(
    catalogueRepository: CatalogueRepository,
    networkHelper: NetworkHelper
) : BaseViewModel() {

    private var popularityMoviesLiveData: LiveData<PagedList<MovieEntity>>
    private var releaseDateMoviesLiveData: LiveData<PagedList<MovieEntity>>
    private var revenueMoviesLiveData: LiveData<PagedList<MovieEntity>>
    private var voteAverageMoviesLiveData: LiveData<PagedList<MovieEntity>>

    private var popularDataSourceFactory: MoviesDataSourceFactory
    private var releaseDataSourceFactory: MoviesDataSourceFactory
    private var revenueDataSourceFactory: MoviesDataSourceFactory
    private var voteAverageDataSourceFactory: MoviesDataSourceFactory


    init {
        val config = PagedList.Config.Builder()
            .setPageSize(20)
            .setEnablePlaceholders(false)
            .build()

        popularDataSourceFactory =
            MoviesDataSourceFactory(SORT_BY_POPULARITY, coroutineContext, catalogueRepository, networkHelper)
        releaseDataSourceFactory =
            MoviesDataSourceFactory(SORT_BY_RELEASE_DATE, coroutineContext, catalogueRepository, networkHelper)
        revenueDataSourceFactory =
            MoviesDataSourceFactory(SORT_BY_REVENUE, coroutineContext, catalogueRepository, networkHelper)
        voteAverageDataSourceFactory =
            MoviesDataSourceFactory(SORT_BY_VOTE_AVERAGE, coroutineContext, catalogueRepository, networkHelper)


        popularityMoviesLiveData = LivePagedListBuilder(popularDataSourceFactory, config).build()
        releaseDateMoviesLiveData = LivePagedListBuilder(releaseDataSourceFactory, config).build()
        revenueMoviesLiveData = LivePagedListBuilder(revenueDataSourceFactory, config).build()
        voteAverageMoviesLiveData = LivePagedListBuilder(voteAverageDataSourceFactory, config).build()
    }

    fun getUIState(): LiveData<UIStatus> = Transformations.switchMap(
        popularDataSourceFactory.dataSourceLiveData,
        MoviesDataSource::uiStatus
    )

    fun getPopularityMovies(): LiveData<PagedList<MovieEntity>> = popularityMoviesLiveData
    fun getReleaseDateMovies(): LiveData<PagedList<MovieEntity>> = releaseDateMoviesLiveData
    fun getRevenueMovies(): LiveData<PagedList<MovieEntity>> = revenueMoviesLiveData
    fun getVoteAverageMovies(): LiveData<PagedList<MovieEntity>> = voteAverageMoviesLiveData

}
