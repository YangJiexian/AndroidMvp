package top.daxianwill.frame.module.mvp.simple5.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.PriorityQueue;

import top.daxianwill.frame.module.mvp.simple4.base.BaseView4;

/**
 * 第七步：抽象出BaseActivity
 * Created by admin on 2018/6/4.
 */

public abstract class BaseActivity5<V extends BaseView5,P extends BasePresenter5<V>> extends AppCompatActivity {

    private V view;
    private P presenter;

    public P getPresenter(){
        return presenter;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.presenter == null){
            this.presenter = createPresenter();
        }
        if (this.view == null) {
            this.view = createView();
        }
        if (this.presenter == null){
            throw new NullPointerException("presneter不能够为空");
        }
        if (this.view == null) {
            throw new NullPointerException("view不能够为空");
        }
        this.presenter.attachView(view);
    }

    //第八步：MVP实现-优化第六步 BaseActivity中的抽象0- 抽象实现（BasePresenter和BaseView）
    public abstract V createView();
    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
            super.onDestroy();
            this.presenter.detachView();
    }
}
