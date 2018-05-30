package top.daxianwill.frame.module.main;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mvp.R;

import top.daxianwill.frame.local.table.WeatherInfo;
import top.daxianwill.frame.local.table.WeatherinfoEntity;
import butterknife.BindView;
import butterknife.ButterKnife;
import top.daxianwill.frame.module.mvp.simple1.MainPresenter1;
import top.daxianwill.frame.module.mvp.simple1.MainView1;
import top.daxianwill.frame.module.mvp.simple2.MainPresenter2;
import top.daxianwill.frame.module.mvp.simple2.MainView2;

/**
 * @author admin
 */
public class MainActivity extends AppCompatActivity implements MainView2{

    @BindView(R.id.tv_displayWeather)
    TextView tv;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.display_weather)
    Button displayWeather;

    private MainPresenter2 mainPresenter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter1 = new MainPresenter2();
        mainPresenter1.attachView(this);
        displayWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter1.getWeather();
            }
        });
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

    @Override
    public void onResult(WeatherInfo weatherInfo) {
        showData(weatherInfo);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter1.detachView();
    }
}
