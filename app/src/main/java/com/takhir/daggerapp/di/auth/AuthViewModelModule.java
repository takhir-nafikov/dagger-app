package com.takhir.daggerapp.di.auth;

import androidx.lifecycle.ViewModel;

import com.takhir.daggerapp.di.ViewModelKey;
import com.takhir.daggerapp.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModule(AuthViewModel viewModel);
}
