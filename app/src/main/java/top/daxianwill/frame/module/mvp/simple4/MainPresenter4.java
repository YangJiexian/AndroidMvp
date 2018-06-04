package top.daxianwill.frame.module.mvp.simple4;

import top.daxianwill.frame.module.main.WeatherSubscriber;
import top.daxianwill.frame.module.mvp.simple4.base.BasePresenter4;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter4 extends BasePresenter4<MainView4> {

    private MainModel4 mainModel1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter4() {
        this.mainModel1 = new MainModel4();
    }

    public void getWeather(){
        //weatherSubscriber = new WeatherSubscriber(getView());
        mainModel1.getData(weatherSubscriber);
    }
}
