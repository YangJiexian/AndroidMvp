package top.daxianwill.frame.module.main;
import top.daxianwill.frame.local.dao.WeatherDao;
import top.daxianwill.frame.local.table.WeatherInfo;

import java.util.List;


/**
 * Presenter 主要起连接 View 和 Dao 的作用
 */
public class MainPresenter {

    private MainView mainView;
    public WeatherDao weatherDao =new WeatherDao(this);

    public MainPresenter(MainView mainView) {
        this.mainView=mainView;

    }
    public void getData(){
        mainView.showProgressBar();
        weatherDao.getData();
    }
    public void loadDataSuccess(List<WeatherInfo> list) {

        mainView.showData(list.get(0));
    }
    public void loadDataFailure(){
        mainView.showData(null);
    }
}
