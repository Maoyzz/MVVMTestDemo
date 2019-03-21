package com.myz.mvvmtestdemo;

import android.databinding.ViewDataBinding;

import com.myz.mvvmtestdemo.databinding.ActivityMainBinding;

/**
 * @author myz
 * @date 2019/3/21
 * desc:
 */
public class MyViewModel {
    private DataModel model = new DataModelImpl();
    private IView iView;
    private ActivityMainBinding binding;

    public MyViewModel(IView iView,ActivityMainBinding binding){
        this.binding = binding;
        this.iView = iView;
    }

    public void getData(int num){
        model.getData(num, new DataModel.callBack<TestBean>() {
            @Override
            public void success(TestBean data) {
                binding.setImage(data);
                iView.onSuccess();
            }

            @Override
            public void error() {

            }
        });
    }
}
