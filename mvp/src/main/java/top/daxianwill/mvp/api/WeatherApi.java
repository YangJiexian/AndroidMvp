package top.daxianwill.mvp.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import top.daxianwill.mvp.entity.WeatherInfo;

/**
 * Created by admin on 2018/4/27.
 */

public interface WeatherApi {

    @GET("adat/sk/{cityId}"+".html")
    Observable<WeatherInfo> getModelBean(@Path("cityId") String cityId);

}
