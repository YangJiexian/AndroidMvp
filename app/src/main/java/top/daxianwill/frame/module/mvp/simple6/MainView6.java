package top.daxianwill.frame.module.mvp.simple6;

import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.module.mvp.simple5.base.BaseView5;
import top.daxianwill.frame.module.mvp.simple6.base.BaseView6;

/**
 * Created by admin on 2018/5/30.
 */

public interface MainView6 extends BaseView6 {

    void onResult(WeatherInfo weatherInfo);

}
