package top.daxianwill.frame.module.mvp.simple6.base;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 第七步：抽象出BaseActivity
 * Created by admin on 2018/6/4.
 */

public abstract class BaseFragment6<V extends BaseView6,P extends BasePresenter6<V>> extends Fragment {

    private V view;
    private P presenter;

    public P getPresenter(){
        return presenter;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
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
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.detachView();
    }
}
