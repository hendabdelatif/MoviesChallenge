package com.hend.movieschallenge.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hend.movieschallenge.R
import com.hend.movieschallenge.network.connection.NetworkConnection
import com.hend.movieschallenge.ui.errors.ErrorHandler
import com.hend.movieschallenge.ui.errors.IndefiniteSnackbar
import com.hend.movieschallenge.ui.errors.NoResponseException
import com.hend.movieschallenge.utils.Error

/**
 * Abstract class with commonly used abstract methods and network connection handler live data through the app
 */
abstract class BaseActivity : AppCompatActivity() {

    private lateinit var networkConnection: NetworkConnection

    protected abstract fun init()
    protected abstract fun initViewBinding()
    protected abstract fun observeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        networkConnection = NetworkConnection(this)

        networkConnection.observe(this, { isConnected ->
            isConnected?.let {
                if (isConnected) {
                    IndefiniteSnackbar.hide()
                } else {
                    ErrorHandler.handleError(
                        findViewById(android.R.id.content),
                        Error(NoResponseException(getString(R.string.no_internet_connection))),
                        shouldShowSnackBar = true
                    )
                }
            }
        })
        init()
        observeViewModel()
        initViewBinding()
    }


}