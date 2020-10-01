package com.hend.movieschallenge.ui.adapters


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.hend.movieschallenge.R
import com.hend.movieschallenge.persistence.dbmodels.MovieEntity
import com.hend.movieschallenge.ui.details.DetailsActivity
import com.hend.movieschallenge.utils.listen
import com.hend.movieschallenge.utils.loadImageUrl
import kotlinx.android.synthetic.main.item_movie.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Movies paging list adapter to display paging feature
 */
class MoviesAdapter : PagedListAdapter<MovieEntity, MoviesAdapter.MyViewHolder>(
    DiffUtilCallBack
) {

    private object DiffUtilCallBack : DiffUtil.ItemCallback<MovieEntity>() {
        override fun areItemsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MovieEntity, newItem: MovieEntity): Boolean {
            return oldItem.title == newItem.title
                    && oldItem.popularity == newItem.popularity
                    && oldItem.vote_average == newItem.vote_average
        }
    }

    @ExperimentalCoroutinesApi
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.create(parent).listen { position ->
            ContextCompat.startActivity(
                parent.context,
                Intent(parent.context, DetailsActivity::class.java)
                    .putExtra("id", getItem(position)?.id), null
            )
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        getItem(position)?.let { holder.bindMovie(it) }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imgMovie = itemView.img_movie
        private val progressBar = itemView.progress_bar

        fun bindMovie(movie: MovieEntity) {
            movie.full_poster_path?.let { imgMovie.loadImageUrl(it, progressBar) }
        }

        companion object {
            fun create(parent: ViewGroup): MyViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_movie, parent, false)
                return MyViewHolder(
                    view
                )
            }
        }
    }
}