package top.daxianwill.frame.module.main;

import top.daxianwill.frame.local.table.WeatherInfo;

public interface MainView {

    void initView();
    void showData(WeatherInfo bean);
    void showProgressBar();
    void hideProgressBar();

}
