package com.takhir.daggerapp.di;

import com.takhir.daggerapp.di.auth.AuthModule;
import com.takhir.daggerapp.di.auth.AuthViewModelModule;
import com.takhir.daggerapp.ui.auth.AuthActivity;
import com.takhir.daggerapp.ui.main.MainActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
