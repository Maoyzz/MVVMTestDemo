package com.myz.mvvmtestdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.myz.mvvmtestdemo.databinding.ActivityMainBinding;


/**
 * @author myz
 * @date 2019.3.21
 */
public class MainActivity extends AppCompatActivity implements IView{

    private int num = 1;
    private MyViewModel mVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mVM = new MyViewModel(this,binding);
        binding.setBtnClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("mao", "onClick: "+num );
                mVM.getData(num);
            }
        });
    }


    @Override
    public void onSuccess() {
        num ++;
    }
}
