package com.takhir.daggerapp.di.main;

import androidx.lifecycle.ViewModel;

import com.takhir.daggerapp.di.ViewModelKey;
import com.takhir.daggerapp.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel viewModel);
}
