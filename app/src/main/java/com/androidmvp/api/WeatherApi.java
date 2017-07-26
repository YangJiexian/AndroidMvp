package com.androidmvp.api;

import com.androidmvp.local.table.WeatherInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by admin on 2017/7/26.
 */

public interface WeatherApi {
    @GET("{cityId}"+".html")
    Observable<WeatherInfo> getModelBean(@Path("cityId") String cityId);
}
