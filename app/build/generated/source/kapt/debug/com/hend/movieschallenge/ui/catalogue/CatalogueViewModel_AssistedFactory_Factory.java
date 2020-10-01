package com.hend.movieschallenge.ui.catalogue;

import com.hend.movieschallenge.network.connection.NetworkHelper;
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
public final class CatalogueViewModel_AssistedFactory_Factory implements Factory<CatalogueViewModel_AssistedFactory> {
  private final Provider<CatalogueRepository> catalogueRepositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public CatalogueViewModel_AssistedFactory_Factory(
      Provider<CatalogueRepository> catalogueRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.catalogueRepositoryProvider = catalogueRepositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public CatalogueViewModel_AssistedFactory get() {
    return newInstance(catalogueRepositoryProvider, networkHelperProvider);
  }

  public static CatalogueViewModel_AssistedFactory_Factory create(
      Provider<CatalogueRepository> catalogueRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new CatalogueViewModel_AssistedFactory_Factory(catalogueRepositoryProvider, networkHelperProvider);
  }

  public static CatalogueViewModel_AssistedFactory newInstance(
      Provider<CatalogueRepository> catalogueRepository, Provider<NetworkHelper> networkHelper) {
    return new CatalogueViewModel_AssistedFactory(catalogueRepository, networkHelper);
  }
}
