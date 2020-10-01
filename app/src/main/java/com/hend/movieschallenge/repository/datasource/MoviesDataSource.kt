package com.hend.movieschallenge.repository.datasource

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.hend.movieschallenge.network.connection.NetworkHelper
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.repository.CatalogueRepository
import com.hend.movieschallenge.utils.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

/**
 * DataSource and PagedList configuration
 */
@ExperimentalCoroutinesApi
class MoviesDataSource(
    private val sortBy: String,
    coroutineContext: CoroutineContext,
    private val catalogueRepository: CatalogueRepository,
    private val networkHelper: NetworkHelper
) : PageKeyedDataSource<Int, MovieEntity>() {

    private val scope = CoroutineScope(coroutineContext)

    private val _uiState = MutableLiveData<UIStatus>()
    val uiStatus: LiveData<UIStatus> = _uiState


    @FlowPreview
    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, MovieEntity>
    ) {
        scope.launch {

            if (networkHelper.isNetworkConnected())
                catalogueRepository.getMoviesWithImagesUrl(sortBy, FIRST_PAGE)
                    .collect {
                        when (it) {
                            is Success -> {
                                _uiState.postValue(HasData)
                                callback.onResult(
                                    it.data, null,
                                    FIRST_PAGE
                                )
                            }
                            is Error -> _uiState.postValue(UIError)
                            is Progress -> _uiState.postValue(Loading)
                        }
                    }
            else
                _uiState.postValue(UIError)
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, MovieEntity>) {
        // Nothing to implement
    }

    @FlowPreview
    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, MovieEntity>) {
        scope.launch {

            if (networkHelper.isNetworkConnected())
                catalogueRepository.getMoviesWithImagesUrl(
                    sortBy,
                    params.key + 1
                )
                    .collect {
                        when (it) {
                            is Success -> {
                                _uiState.postValue(HasData)
                                callback.onResult(it.data, params.key + 1)
                            }
                            is Error -> _uiState.postValue(UIError)
                            is Progress -> _uiState.postValue(Loading)
                        }
                    }
            else
                _uiState.postValue(UIError)
        }
    }

    companion object {
        private const val FIRST_PAGE = 1
    }


}