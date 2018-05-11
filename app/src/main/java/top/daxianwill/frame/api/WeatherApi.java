package top.daxianwill.frame.api;

import top.daxianwill.frame.local.table.WeatherInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by admin on 2017/7/26.
 */

public interface WeatherApi {
    @GET("adat/sk/{cityId}"+".html")
    Observable<WeatherInfo> getModelBean(@Path("cityId") String cityId);
}
