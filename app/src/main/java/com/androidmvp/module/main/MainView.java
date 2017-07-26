package com.androidmvp.module.main;

import com.androidmvp.local.table.WeatherInfo;

public interface MainView {

    void initView();
    void showData(WeatherInfo bean);
    void showProgressBar();
    void hideProgressBar();

}
