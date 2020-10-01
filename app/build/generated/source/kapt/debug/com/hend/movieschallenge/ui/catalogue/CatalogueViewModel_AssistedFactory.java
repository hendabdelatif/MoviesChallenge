package com.hend.movieschallenge.ui.catalogue;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hend.movieschallenge.network.connection.NetworkHelper;
import com.hend.movieschallenge.repository.CatalogueRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CatalogueViewModel_AssistedFactory implements ViewModelAssistedFactory<CatalogueViewModel> {
  private final Provider<CatalogueRepository> catalogueRepository;

  private final Provider<NetworkHelper> networkHelper;

  @Inject
  CatalogueViewModel_AssistedFactory(Provider<CatalogueRepository> catalogueRepository,
      Provider<NetworkHelper> networkHelper) {
    this.catalogueRepository = catalogueRepository;
    this.networkHelper = networkHelper;
  }

  @Override
  @NonNull
  public CatalogueViewModel create(SavedStateHandle arg0) {
    return new CatalogueViewModel(catalogueRepository.get(), networkHelper.get());
  }
}
