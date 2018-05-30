package top.daxianwill.frame.module.mvp.simple1;

import top.daxianwill.frame.module.main.MainView;
import top.daxianwill.frame.module.main.WeatherSubscriber;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter1 {

    private MainModel1 mainModel1;
    private MainView1 mainView1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter1(MainView1 mainView) {
        this.mainModel1 = new MainModel1();
        this.mainView1 = mainView;
        //在WeatherSubscriber 中修改mainView
        //weatherSubscriber = new WeatherSubscriber(mainView);
    }

    public void getWeather(){
        mainModel1.getData(weatherSubscriber);
    }
}
