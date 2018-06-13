package top.daxianwill.frame.module.mvp.simple6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import top.daxianwill.frame.module.main.MainView;
import top.daxianwill.frame.module.mvp.simple6.base.BaseFragment6;
import top.daxianwill.frame.module.mvp.simple6.base.BasePresenter6;
import top.daxianwill.frame.module.mvp.simple6.base.BaseView6;

/**
 * Created by admin on 2018/6/4.
 */

public class MainFragment6 extends BaseFragment6<MainView6,MainPresenter6> implements BaseView6 {

    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main,container,false);
        unbinder = ButterKnife.bind(this,view);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public MainView6 createView() {
        return null;
    }

    @Override
    public MainPresenter6 createPresenter() {
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
