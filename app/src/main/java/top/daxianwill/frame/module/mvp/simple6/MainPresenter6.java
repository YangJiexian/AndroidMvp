package top.daxianwill.frame.module.mvp.simple6;

import top.daxianwill.frame.module.main.WeatherSubscriber;
import top.daxianwill.frame.module.mvp.simple5.base.BasePresenter5;
import top.daxianwill.frame.module.mvp.simple6.base.BasePresenter6;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter6 extends BasePresenter6<MainView6> {

    private MainModel6 mainModel1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter6() {
        this.mainModel1 = new MainModel6();
    }

    public void getWeather(){
        weatherSubscriber = new WeatherSubscriber(getView());
        mainModel1.getData(weatherSubscriber);
    }
}
