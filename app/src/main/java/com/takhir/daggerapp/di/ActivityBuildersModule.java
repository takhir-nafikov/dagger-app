package com.takhir.daggerapp.di;

import com.takhir.daggerapp.di.auth.AuthViewModelModule;
import com.takhir.daggerapp.ui.auth.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class}
    )
    abstract AuthActivity contributeAuthActivity();
}
