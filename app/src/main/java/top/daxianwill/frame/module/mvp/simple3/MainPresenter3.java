package top.daxianwill.frame.module.mvp.simple3;

import top.daxianwill.frame.module.main.WeatherSubscriber;
import top.daxianwill.frame.module.mvp.simple3.base.BasePresenter;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter3 extends BasePresenter{

    private MainModel3 mainModel1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter3() {
        this.mainModel1 = new MainModel3();
    }

    public void getWeather(){
        weatherSubscriber = new WeatherSubscriber(getView());
        mainModel1.getData(weatherSubscriber);
    }
}
