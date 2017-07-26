package com.androidmvp;
import android.app.Application;
import android.content.Context;

import com.androidmvp.injector.components.ApplicationComponent;
import com.androidmvp.injector.components.DaggerApplicationComponent;
import com.androidmvp.injector.modules.ApplicationModule;

/**
 */

@SuppressWarnings("unused")//unused to suppress warnings relative to unused code
public class AndroidApplication extends Application{
    private static final String DB_NAME = "mvp-db";
    private static Context mContext;
    private static ApplicationComponent sAppComponent;
    private static AndroidApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mApplication = this;
    }

    public static AndroidApplication getInstance() {
        return mApplication;
    }

    public static ApplicationComponent getAppComponent() {
        return sAppComponent;
    }

    public static Context getContext() {
        return mContext;
    }

    /**
     * 初始化注射器
     */
    private void _initInjector() {
        // 这里不做注入操作，只提供一些全局单例数据
        sAppComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
