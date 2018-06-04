package top.daxianwill.frame.module.main;

import rx.Subscriber;
import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.module.mvp.simple1.MainView1;
import top.daxianwill.frame.module.mvp.simple2.MainView2;
import top.daxianwill.frame.module.mvp.simple3.MainView3;
import top.daxianwill.frame.module.mvp.simple4.MainView4;

/**
 * Created by admin on 2018/5/30.
 */

public class WeatherSubscriber extends Subscriber<WeatherInfo> {

    private MainView4 mainView1;

    public WeatherSubscriber(MainView4 mainView1) {
        this.mainView1 = mainView1;
    }

    @Override
    public void onCompleted() {
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onNext(WeatherInfo weatherInfo) {
        mainView1.onResult(weatherInfo);
    }

}
