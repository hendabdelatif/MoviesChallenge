// Generated by view binder compiler. Do not edit!
package com.hend.movieschallenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.hend.movieschallenge.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMovieBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final AppCompatImageView imgMovie;

  @NonNull
  public final ProgressBar progressBar;

  private ItemMovieBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull AppCompatImageView imgMovie, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imgMovie = imgMovie;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_movie, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMovieBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.img_movie;
      AppCompatImageView imgMovie = rootView.findViewById(id);
      if (imgMovie == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      return new ItemMovieBinding((ConstraintLayout) rootView, cardView, imgMovie, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
