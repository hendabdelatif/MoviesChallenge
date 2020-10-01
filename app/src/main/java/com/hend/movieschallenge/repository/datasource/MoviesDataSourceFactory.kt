package com.hend.movieschallenge.repository.datasource

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.hend.movieschallenge.network.connection.NetworkHelper
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.repository.CatalogueRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlin.coroutines.CoroutineContext

/**
 * Retrieving the data using the DataSource and PagedList configuration
 */
@ExperimentalCoroutinesApi
class MoviesDataSourceFactory(private val sortBy : String, private val coroutineContext : CoroutineContext, private val catalogueRepository : CatalogueRepository, private val networkHelper: NetworkHelper) : DataSource.Factory<Int, MovieEntity>() {

    val dataSourceLiveData = MutableLiveData<MoviesDataSource>()

    override fun create(): DataSource<Int, MovieEntity> {
        val dataSource = MoviesDataSource(sortBy, coroutineContext, catalogueRepository, networkHelper)
        dataSourceLiveData.postValue(dataSource)
        return dataSource
    }
}

