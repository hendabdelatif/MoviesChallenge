package com.hend.movieschallenge.ui.errors

import android.content.Context
import android.view.View
import android.widget.Toast
import com.hend.movieschallenge.R
import com.hend.movieschallenge.utils.Error
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.Moshi
import okhttp3.ResponseBody
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

/**
 * Singleton Handler to parse and handle errors
 */
object ErrorHandler {

    lateinit var moshi: Moshi

    fun initialize(moshi: Moshi){
        this.moshi = moshi
    }

    fun handleError(
        view: View,
        throwable: Error,
        shouldToast: Boolean = false,
        shouldShowSnackBar: Boolean = false
    ) {
        if (shouldShowSnackBar) {
            IndefiniteSnackbar.show(view, throwable.message)
        } else {
            if (shouldToast) {
                showLongToast(view.context, throwable.message)
            }
        }
        when (throwable.exception) {
            is IOException -> Timber.e(view.context.getString(R.string.no_internet_connection))
            is HttpException -> Timber.e(
                "HTTP Exception: ${throwable.exception.code()}"
            )
            is NoResponseException -> Timber.e(view.context.getString(R.string.empty_response))
            else -> Timber.e(throwable.message)
        }
    }

    private fun showLongToast(context: Context, message: String) = Toast.makeText(
        context,
        message,
        Toast.LENGTH_LONG
    ).show()

    inline fun <reified T> parseError(responseBody: ResponseBody?): T? {
        val parser = moshi.adapter(T::class.java)
        val response = responseBody?.string()
        if (response != null)
            try {
                return parser.fromJson(response)
            } catch (e: JsonDataException) {
                e.printStackTrace()
            }
        return null
    }

}