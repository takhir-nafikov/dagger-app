package com.takhir.daggerapp.di;

import androidx.lifecycle.ViewModelProvider;

import com.takhir.daggerapp.viewmodels.ViewModelsProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModeFactorylModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelsProviderFactory modelsProviderFactory);

    @Provides
    static ViewModelProvider.Factory bindFactory(ViewModelsProviderFactory factory) {
        return  factory;
    }
}
