package top.daxianwill.frame.module.mvp.simple6;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.local.table.WeatherinfoEntity;
import top.daxianwill.frame.module.mvp.simple5.base.BaseActivity5;
import top.daxianwill.frame.module.mvp.simple6.base.BaseActivity6;

/**
 * @author admin
 */
public class MainActivity6 extends BaseActivity6<MainView6,MainPresenter6> implements MainView6 {

    @BindView(R.id.tv_displayWeather)
    TextView tv;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.display_weather)
    Button displayWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        displayWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().getWeather();
            }
        });
    }

    @Override
    public MainView6 createView() {
        return this;
    }

    @Override
    public MainPresenter6 createPresenter() {
        return new MainPresenter6();
    }


    @Override
    public void onResult(WeatherInfo weatherInfo) {
        showData(weatherInfo);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void showData(WeatherInfo mybean) {
        if(mybean==null){
            tv.setText("请求失败");
        }
        else{
            WeatherinfoEntity bean = mybean.getWeatherinfo();
            String city=bean.getCity();
            String wd=bean.getWD();
            String ws=bean.getWS();
            String time=bean.getTime();
            String data="城市:"+city+"\n风向:"+wd+"\n风级:"+ws+"\n发布时间:"+time;
            tv.setText(data);
        }

    }
}
