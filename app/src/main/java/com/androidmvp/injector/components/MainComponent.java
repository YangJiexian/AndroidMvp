package com.androidmvp.injector.components;

import com.androidmvp.injector.modules.MainPresenterModule;
import com.androidmvp.module.main.MainActivity;

import dagger.Component;

@Component(modules = { MainPresenterModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
