package com.androidmvp.module.main;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.androidmvp.R;
import com.androidmvp.injector.components.DaggerMainComponent;
import com.androidmvp.injector.modules.MainPresenterModule;
import com.androidmvp.local.table.WeatherInfo;
import com.androidmvp.local.table.WeatherinfoEntity;
import com.androidmvp.module.base.BaseActivity;
import javax.inject.Inject;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements MainView{

    @BindView(R.id.tv_displayWeather)
    TextView tv;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.display_weather)
    Button displayWeather;



    //Dagger不能注入私有变量
    @Inject
    public MainPresenter myPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        listener();
    }

    @Override
    public void initView() {
        DaggerMainComponent.builder()
                .mainPresenterModule(new MainPresenterModule(this))
                .build()
                .inject(this);
    }

    private void listener(){
        displayWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPresenter.getData();
            }
        });
    }

    @Override
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
        hideProgressBar();
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }
}
