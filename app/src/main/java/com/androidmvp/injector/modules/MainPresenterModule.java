package com.androidmvp.injector.modules;

import com.androidmvp.module.main.MainView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainPresenterModule {
    private MainView mainView;
    public MainPresenterModule(MainView mainView){
        this.mainView=mainView;
    }

    @Provides
    public MainView provideMainView(){
        return mainView;
    }
}
