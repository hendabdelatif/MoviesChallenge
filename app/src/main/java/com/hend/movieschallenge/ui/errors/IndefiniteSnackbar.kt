package com.hend.movieschallenge.ui.errors

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * Singleton object of Snackbar
 */
object IndefiniteSnackbar {

    private var snackbar: Snackbar? = null

    fun show(view: View, text: String) {
        snackbar = Snackbar.make(view, text, Snackbar.LENGTH_INDEFINITE).apply {
            show()
        }
    }

    fun hide() {
        snackbar?.dismiss()
    }
}