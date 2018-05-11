package top.daxianwill.mvp.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 对Retrofit2进行简单封装
 * https://juejin.im/post/584eb780128fe10058b4c38b  文章地址
 */

public class RetrofitService {

    private static final String BASE_URL = "http://www.weather.com.cn/";

    private static OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
    private static Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
    private static Retrofit retrofit = builder.client(okHttpClient.build()).build();

    public static <A> A creatApi (Class<A> api){
        return retrofit.create(api);
    }

}
