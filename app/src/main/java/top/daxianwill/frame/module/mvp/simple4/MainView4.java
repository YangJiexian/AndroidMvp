package top.daxianwill.frame.module.mvp.simple4;

import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.module.mvp.simple4.base.BaseView4;

/**
 * Created by admin on 2018/5/30.
 */

public interface MainView4 extends BaseView4 {

    void onResult(WeatherInfo weatherInfo);

}
