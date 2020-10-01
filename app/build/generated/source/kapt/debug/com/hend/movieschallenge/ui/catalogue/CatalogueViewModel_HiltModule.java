package com.hend.movieschallenge.ui.catalogue;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = CatalogueViewModel.class
)
public interface CatalogueViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.hend.movieschallenge.ui.catalogue.CatalogueViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(CatalogueViewModel_AssistedFactory factory);
}
