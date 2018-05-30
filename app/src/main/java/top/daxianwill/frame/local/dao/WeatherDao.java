package top.daxianwill.frame.local.dao;

import top.daxianwill.frame.AndroidApplication;
import top.daxianwill.frame.api.RetrofitManager;
import top.daxianwill.frame.api.WeatherApi;
import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.local.table.WeatherinfoEntityDao;
import top.daxianwill.frame.module.main.MainPresenter;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 获取天气数据
 */
public class WeatherDao {

    //地址：http://www.weather.com.cn/adat/sk/101010100.html
    //private String baseUrl="http://www.weather.com.cn/adat/sk/";

    private List<WeatherInfo> list = new ArrayList<>();
    private MainPresenter mainPresenter;
    private WeatherinfoEntityDao weatherinfoEntityDao;
    public WeatherDao(MainPresenter mainPresenter){
        this.mainPresenter = mainPresenter;
        weatherinfoEntityDao = AndroidApplication.getInstance().getDaoSession().getWeatherinfoEntityDao();
    }

    public void getData(){
        WeatherApi weatherApi = RetrofitManager.creatApi(WeatherApi.class);
        weatherApi.getModelBean("101010100")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MySubscriber());
    }

    class MySubscriber extends Subscriber<WeatherInfo> {
        @Override
        public void onCompleted() {
            mainPresenter.loadDataSuccess(list);
        }

        @Override
        public void onError(Throwable e) {
            mainPresenter.loadDataFailure();
        }

        @Override
        public void onNext(WeatherInfo mainModelBean) {
            list.add(mainModelBean);
        }
    }
}
