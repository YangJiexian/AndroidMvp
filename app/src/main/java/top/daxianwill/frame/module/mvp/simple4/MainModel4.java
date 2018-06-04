package top.daxianwill.frame.module.mvp.simple4;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import top.daxianwill.frame.api.RetrofitManager;
import top.daxianwill.frame.api.WeatherApi;
import top.daxianwill.frame.module.main.WeatherSubscriber;

/**
 * Created by admin on 2018/5/30.
 */

public class MainModel4 {

    public void getData(WeatherSubscriber weatherSubscriber){
        WeatherApi weatherApi = RetrofitManager.creatApi(WeatherApi.class);
        weatherApi.getModelBean("101010100")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(weatherSubscriber);
    }

}
