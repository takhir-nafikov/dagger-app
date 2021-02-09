package com.takhir.daggerapp.di;

import com.takhir.daggerapp.di.auth.AuthModule;
import com.takhir.daggerapp.di.auth.AuthScope;
import com.takhir.daggerapp.di.auth.AuthViewModelModule;
import com.takhir.daggerapp.di.main.MainFragmentBuildersModule;
import com.takhir.daggerapp.di.main.MainModule;
import com.takhir.daggerapp.di.main.MainScope;
import com.takhir.daggerapp.di.main.MainViewModelsModule;
import com.takhir.daggerapp.ui.auth.AuthActivity;
import com.takhir.daggerapp.ui.main.MainActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
