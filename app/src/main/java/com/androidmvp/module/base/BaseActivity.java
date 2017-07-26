package com.androidmvp.module.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidmvp.injector.modules.ActivityModule;
import com.androidmvp.AndroidApplication;
import com.androidmvp.injector.components.ApplicationComponent;

/**
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication)getApplication()).getAppComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

}
