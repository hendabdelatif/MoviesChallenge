package com.hend.movieschallenge.ui.details

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.repository.CatalogueRepository
import com.hend.movieschallenge.ui.base.BaseViewModel
import com.hend.movieschallenge.utils.HasData
import com.hend.movieschallenge.utils.Loading
import com.hend.movieschallenge.utils.UIStatus
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * ViewModel to get movie details data from database
 */
@ExperimentalCoroutinesApi
class DetailsViewModel @ViewModelInject constructor(private val catalogueRepository: CatalogueRepository) :
    BaseViewModel() {

    private var id: Int = -1

    /** Live Data to get UI Status **/
    private val _uiState = MutableLiveData<UIStatus>()
    val uiStatus: LiveData<UIStatus> = _uiState

    /** Live Data to get MovieEntity **/
    private val movieEntityLiveData: MutableLiveData<MovieEntity> = MutableLiveData()
    fun getMovieEntity(): LiveData<MovieEntity> = movieEntityLiveData

    /** Used to query selected Movie Entity from database **/
    fun setMovieId(id: Int) {
        this.id = id
    }

    init {
        viewModelScope.launch {
            _uiState.postValue(Loading)
            delay(500)
            catalogueRepository.getMovieDao().getMovieEntityById(id)?.let {
                _uiState.postValue(HasData)
                showDetails(it)
            }
        }
    }

    /** Used to observe movie entity in the activity **/
    private fun showDetails(movieEntity: MovieEntity) {
        movieEntityLiveData.value = movieEntity
    }
}
