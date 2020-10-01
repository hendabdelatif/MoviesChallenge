package com.hend.movieschallenge.ui.details;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hend.movieschallenge.repository.CatalogueRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailsViewModel> {
  private final Provider<CatalogueRepository> catalogueRepository;

  @Inject
  DetailsViewModel_AssistedFactory(Provider<CatalogueRepository> catalogueRepository) {
    this.catalogueRepository = catalogueRepository;
  }

  @Override
  @NonNull
  public DetailsViewModel create(SavedStateHandle arg0) {
    return new DetailsViewModel(catalogueRepository.get());
  }
}
