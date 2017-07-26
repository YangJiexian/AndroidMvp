package com.androidmvp.injector.components;

import android.content.Context;

import com.androidmvp.module.base.BaseActivity;
import com.androidmvp.injector.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin on 2017/7/26.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);

    // provide
    Context getContext();
}
