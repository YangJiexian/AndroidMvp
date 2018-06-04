package top.daxianwill.frame.module.mvp.simple5;

import top.daxianwill.frame.module.main.WeatherSubscriber;
import top.daxianwill.frame.module.mvp.simple4.base.BasePresenter4;
import top.daxianwill.frame.module.mvp.simple5.base.BasePresenter5;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter5 extends BasePresenter5<MainView5> {

    private MainModel5 mainModel1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter5() {
        this.mainModel1 = new MainModel5();
    }

    public void getWeather(){
        weatherSubscriber = new WeatherSubscriber(getView());
        mainModel1.getData(weatherSubscriber);
    }
}
