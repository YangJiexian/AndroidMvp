package top.daxianwill.frame.module.mvp.simple6.base;

/**
 * Created by admin on 2018/5/30.
 */

public class BasePresenter6<V extends BaseView6> {

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
