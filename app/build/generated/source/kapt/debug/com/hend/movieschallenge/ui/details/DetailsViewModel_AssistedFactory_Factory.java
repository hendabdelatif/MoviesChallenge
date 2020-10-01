package com.hend.movieschallenge.ui.details;

import com.hend.movieschallenge.repository.CatalogueRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsViewModel_AssistedFactory_Factory implements Factory<DetailsViewModel_AssistedFactory> {
  private final Provider<CatalogueRepository> catalogueRepositoryProvider;

  public DetailsViewModel_AssistedFactory_Factory(
      Provider<CatalogueRepository> catalogueRepositoryProvider) {
    this.catalogueRepositoryProvider = catalogueRepositoryProvider;
  }

  @Override
  public DetailsViewModel_AssistedFactory get() {
    return newInstance(catalogueRepositoryProvider);
  }

  public static DetailsViewModel_AssistedFactory_Factory create(
      Provider<CatalogueRepository> catalogueRepositoryProvider) {
    return new DetailsViewModel_AssistedFactory_Factory(catalogueRepositoryProvider);
  }

  public static DetailsViewModel_AssistedFactory newInstance(
      Provider<CatalogueRepository> catalogueRepository) {
    return new DetailsViewModel_AssistedFactory(catalogueRepository);
  }
}
