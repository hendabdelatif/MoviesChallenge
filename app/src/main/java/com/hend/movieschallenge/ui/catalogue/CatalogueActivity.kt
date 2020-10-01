package com.hend.movieschallenge.ui.catalogue

import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import com.hend.movieschallenge.R
import com.hend.movieschallenge.databinding.ActivityCatalogueBinding
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.ui.adapters.MoviesAdapter
import com.hend.movieschallenge.ui.base.BaseActivity
import com.hend.movieschallenge.ui.errors.ErrorHandler
import com.hend.movieschallenge.ui.errors.NoResponseException
import com.hend.movieschallenge.utils.Error
import com.hend.movieschallenge.utils.HasData
import com.hend.movieschallenge.utils.Loading
import com.hend.movieschallenge.utils.UIError
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Activity to show four movie list categories with infinitely scrolling
 */
@AndroidEntryPoint
@ExperimentalCoroutinesApi
class CatalogueActivity : BaseActivity() {

    private lateinit var catalogueViewModel: CatalogueViewModel
    private lateinit var binding: ActivityCatalogueBinding

    private val popularMoviesAdapter = MoviesAdapter()
    private val releaseDateMoviesAdapter = MoviesAdapter()
    private val revenueMoviesAdapter = MoviesAdapter()
    private val voteAverageMoviesAdapter = MoviesAdapter()

    override fun init() {
        catalogueViewModel = ViewModelProvider(this).get(CatalogueViewModel::class.java)
    }

    override fun initViewBinding() {
        binding = ActivityCatalogueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvHorizontalPopular.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.rvHorizontalReleaseDate.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.rvHorizontalRevenue.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        binding.rvHorizontalVoteAverage.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }

    override fun observeViewModel() {

        catalogueViewModel.getPopularityMovies()
            .observe(this, { moviesList -> handlePopularResponse(moviesList) })

        catalogueViewModel.getReleaseDateMovies()
            .observe(this, { moviesList -> handleReleaseDateResponse(moviesList) })

        catalogueViewModel.getRevenueMovies()
            .observe(this, { moviesList -> handleRevenueResponse(moviesList) })

        catalogueViewModel.getVoteAverageMovies()
            .observe(this, { moviesList -> handleVoteAverageResponse(moviesList) })

    }

    private fun handlePopularResponse(moviesList: PagedList<MovieEntity>) {

        catalogueViewModel.getUIState().observe(this, { state ->
            when (state) {
                is HasData -> {
                    viewHasData()
                    bindPopularData(moviesList)
                }
                is UIError -> {
                    viewErrorData()
                }
                is Loading -> {
                    viewLoadingData()
                }
            }
        })
    }

    private fun handleReleaseDateResponse(moviesList: PagedList<MovieEntity>) {
        catalogueViewModel.getUIState().observe(this, { state ->
            when (state) {
                is HasData -> {
                    viewHasData()
                    bindReleaseData(moviesList)
                }
                is UIError -> {
                    viewErrorData()
                }
                is Loading -> {
                    viewLoadingData()
                }
            }
        })
    }


    private fun handleRevenueResponse(moviesList: PagedList<MovieEntity>) {
        catalogueViewModel.getUIState().observe(this, { state ->
            when (state) {
                is HasData -> {
                    viewHasData()
                    bindRevenueData(moviesList)
                }
                is UIError -> {
                    viewErrorData()
                }
                is Loading -> {
                    viewLoadingData()
                }
            }
        })
    }

    private fun handleVoteAverageResponse(moviesList: PagedList<MovieEntity>) {
        catalogueViewModel.getUIState().observe(this, { state ->
            when (state) {
                is HasData -> {
                    viewHasData()
                    bindVoteAverageData(moviesList)
                }
                is UIError -> {
                    viewErrorData()
                }
                is Loading -> {
                    viewLoadingData()
                }
            }
        })
    }


    private fun bindPopularData(moviesList: PagedList<MovieEntity>) {
        binding.rvHorizontalPopular.adapter = popularMoviesAdapter
        popularMoviesAdapter.submitList(moviesList)
    }

    private fun bindReleaseData(moviesList: PagedList<MovieEntity>) {
        binding.rvHorizontalReleaseDate.adapter = releaseDateMoviesAdapter
        releaseDateMoviesAdapter.submitList(moviesList)
    }

    private fun bindRevenueData(moviesList: PagedList<MovieEntity>) {
        binding.rvHorizontalRevenue.adapter = revenueMoviesAdapter
        revenueMoviesAdapter.submitList(moviesList)
    }

    private fun bindVoteAverageData(moviesList: PagedList<MovieEntity>) {
        binding.rvHorizontalVoteAverage.adapter = voteAverageMoviesAdapter
        voteAverageMoviesAdapter.submitList(moviesList)
    }

    private fun viewHasData() {
        binding.mainLayout.visibility = View.VISIBLE
        binding.progressBar.visibility = View.GONE
    }

    private fun viewErrorData() {
        binding.mainLayout.visibility = View.GONE
        binding.progressBar.visibility = View.GONE
        ErrorHandler.handleError(
            findViewById(android.R.id.content),
            Error(NoResponseException(getString(R.string.no_internet_connection))),
            shouldShowSnackBar = true
        )
    }

    private fun viewLoadingData() {
        binding.mainLayout.visibility = View.GONE
        binding.progressBar.visibility = View.VISIBLE
    }

}