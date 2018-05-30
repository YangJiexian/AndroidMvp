package top.daxianwill.frame.module.mvp.simple1;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import top.daxianwill.frame.api.RetrofitManager;
import top.daxianwill.frame.api.WeatherApi;
import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.module.main.MainActivity;
import top.daxianwill.frame.module.main.WeatherSubscriber;

/**
 * Created by admin on 2018/5/30.
 */

public class MainModel1 {

    public void getData(WeatherSubscriber weatherSubscriber){
        WeatherApi weatherApi = RetrofitManager.creatApi(WeatherApi.class);
        weatherApi.getModelBean("101010100")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(weatherSubscriber);
    }

}
