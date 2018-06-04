package top.daxianwill.frame.module.mvp.simple4.base;

import top.daxianwill.frame.module.mvp.simple4.MainView4;

/**
 * Created by admin on 2018/5/30.
 */

public class BasePresenter4<V extends BaseView4> {

    private V mainView1;

    public V getView(){
        return mainView1;
    }

    public void attachView(V mainView){
        this.mainView1 = mainView;
    }

    public void detachView(){
        this.mainView1 = null;
    }
}
