package top.daxianwill.frame.module.mvp.simple2;

import top.daxianwill.frame.module.main.WeatherSubscriber;

/**
 * Created by admin on 2018/5/30.
 */

public class MainPresenter2 {

    private MainModel2 mainModel1;
    private MainView2 mainView1;

    private WeatherSubscriber weatherSubscriber;

    public MainPresenter2() {
        this.mainModel1 = new MainModel2();
    }

    public void attachView(MainView2 mainView){
        this.mainView1 = mainView;
        weatherSubscriber = new WeatherSubscriber(mainView);
    }

    public void detachView(){
        this.mainModel1 = null;
    }

    public void getWeather(){
        mainModel1.getData(weatherSubscriber);
    }
}
