package com.hend.movieschallenge.utils

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.hend.movieschallenge.R
import kotlinx.coroutines.Job
import okhttp3.Call
import okhttp3.Request
import retrofit2.Retrofit
import timber.log.Timber

/**
 * Extension to set OnClick event on a recyclerview item
 */
fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int) -> Unit): T {
    itemView.setOnClickListener {
        event.invoke(adapterPosition)
    }
    return this
}

/**
 * Extension to call factory when create a new Retrofit instance
 */
@PublishedApi
internal inline fun Retrofit.Builder.callFactory(crossinline body: (Request) -> Call) =
    callFactory(object : Call.Factory {
        override fun newCall(request: Request): Call = body(request)
    })

/**
 * Extension to cancel current job if active
 */
fun Job?.cancelIfActive() {
    if (this?.isActive == true)
        cancel()
}

/**
 * Extension to render, load and cash imageUrl into ImageView
 */
fun ImageView.loadImageUrl(imageUrl: String, progressBar: ProgressBar?) {
    val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA)

    if (progressBar != null)
        progressBar.visibility = View.VISIBLE

    val requestListener = object : RequestListener<Drawable> {
        override fun onLoadFailed(
            p0: GlideException?,
            p1: Any?,
            p2: Target<Drawable>?,
            p3: Boolean
        ): Boolean {
            progressBar?.visibility = View.GONE
            return false
        }

        override fun onResourceReady(
            p0: Drawable?,
            p1: Any?,
            p2: Target<Drawable>?,
            p3: DataSource?,
            p4: Boolean
        ): Boolean {
            Timber.d("OnResourceReady")
            progressBar?.visibility = View.GONE
            return false
        }
    }

    Glide.with(context)
        .load(imageUrl)
        .placeholder(R.drawable.placeholder)
        .apply(requestOptions)
        .listener(requestListener)
        .into(this)
}

