package top.daxianwill.frame.module.mvp.simple5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
import top.daxianwill.frame.module.mvp.simple4.MainPresenter4;
import top.daxianwill.frame.module.mvp.simple4.MainView4;
import top.daxianwill.frame.module.mvp.simple5.base.BaseActivity5;
import top.daxianwill.frame.module.mvp.simple5.base.BaseView5;

/**
 * @author admin
 */
public class MainActivity5 extends BaseActivity5<MainView5,MainPresenter5> implements MainView5 {

    @BindView(R.id.tv_displayWeather)
    TextView tv;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.display_weather)
    Button displayWeather;

    //private MainPresenter4 mainPresenter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //mainPresenter1 = new MainPresenter4();
       // mainPresenter1.attachView(this);
        displayWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mainPresenter1.getWeather();
                getPresenter().getWeather();
            }
        });
    }

    @Override
    public MainView5 createView() {
        return this;
    }

    @Override
    public MainPresenter5 createPresenter() {
        return new MainPresenter5();
    }


    @Override
    public void onResult(WeatherInfo weatherInfo) {
        showData(weatherInfo);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //mainPresenter1.detachView();
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
