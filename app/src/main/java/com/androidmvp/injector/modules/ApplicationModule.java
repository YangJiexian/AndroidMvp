package com.androidmvp.injector.modules;

import android.content.Context;

import com.androidmvp.AndroidApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/7/26.
 */
@Module
public class ApplicationModule {

    private final AndroidApplication mApplication;

    public ApplicationModule(AndroidApplication application) {
        this.mApplication = application;
    }
    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.mApplication;
    }
}
