package top.daxianwill.frame.module.mvp.simple3.base;

import top.daxianwill.frame.module.main.WeatherSubscriber;
import top.daxianwill.frame.module.mvp.simple3.MainView3;

/**
 * Created by admin on 2018/5/30.
 */

public class BasePresenter {

    private MainView3 mainView1;

    public MainView3 getView(){
        return mainView1;
    }

    public void attachView(MainView3 mainView){
        this.mainView1 = mainView;
    }

    public void detachView(){
        this.mainView1 = null;
    }
}
