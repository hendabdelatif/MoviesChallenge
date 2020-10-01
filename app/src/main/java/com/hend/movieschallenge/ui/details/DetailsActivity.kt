package com.hend.movieschallenge.ui.details

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.hend.movieschallenge.databinding.ActivityDetailsBinding
import com.hend.movieschallenge.ui.base.BaseActivity
import com.hend.movieschallenge.ui.errors.ErrorHandler
import com.hend.movieschallenge.ui.errors.NoResponseException
import com.hend.movieschallenge.utils.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Activity to show Movies details
 */
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class DetailsActivity : BaseActivity(){

    private lateinit var detailsViewModel: DetailsViewModel
    private lateinit var binding: ActivityDetailsBinding
    private var movieId : Int = 0

    override fun init() {
        movieId = intent.getIntExtra("id" , 0)
        detailsViewModel = ViewModelProvider(this).get(DetailsViewModel ::class.java)
        detailsViewModel.setMovieId(movieId)
    }

    override fun initViewBinding() {
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun observeViewModel() {
        detailsViewModel.uiStatus.observe(this, { status ->
            when (status) {
                is HasData -> {
                    viewHasData()
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

    private fun viewHasData() {
        binding.mainLayout.visibility = View.VISIBLE
        binding.progressBar.visibility = View.GONE
        detailsViewModel.getMovieEntity().observe(this,  {

            binding.txtTitle.text = it.title
            binding.txtVoteAverage.text = binding.txtVoteAverage.text.toString().plus(" ").plus(it.vote_average.toString())
            binding.txtOverview.text = it.overview
            it.full_backdrop_path?.let { imageUrl -> binding.imgPoster.loadImageUrl(imageUrl, null) }

        })
    }

    private fun viewErrorData() {
        binding.mainLayout.visibility = View.GONE
        binding.progressBar.visibility = View.GONE
        ErrorHandler.handleError(
            findViewById(android.R.id.content),
            Error(NoResponseException("")),
            shouldShowSnackBar = true)
    }

    private fun viewLoadingData() {
        binding.mainLayout.visibility = View.GONE
        binding.progressBar.visibility = View.VISIBLE
    }

}