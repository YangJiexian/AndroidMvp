package top.daxianwill.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import top.daxianwill.mvp.api.RetrofitService;
import top.daxianwill.mvp.api.WeatherApi;
import top.daxianwill.mvp.entity.WeatherInfo;
import top.daxianwill.mvp.entity.WeatherinfoEntity;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt)
    Button bt;
    @BindView(R.id.tv)
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getWeather();

    }

    //第一步：不同代码实现
    private void getWeather() {
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherApi weatherApi = RetrofitService.creatApi(WeatherApi.class);
                weatherApi.getModelBean("101010100")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new MySubscriber());
            }
        });
    }

    class MySubscriber extends Subscriber<WeatherInfo> {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(WeatherInfo mainModelBean) {
            showData(mainModelBean);
        }
    }

    public void showData(WeatherInfo beans) {
        if(beans==null){
            tv.setText("请求失败");
        }
        else{
            WeatherinfoEntity bean = beans.getWeatherinfo();
            String city=bean.getCity();
            String wd=bean.getWD();
            String ws=bean.getWS();
            String time=bean.getTime();
            String data="城市:"+city+"\n风向:"+wd+"\n风级:"+ws+"\n发布时间:"+time;
            tv.setText(data);
        }
    }
}
