package com.myz.mvvmtestdemo;

import java.util.List;

/**
 * @author myz
 * @date 2019/3/21
 * desc:
 */
public interface DataModel {

    void getData(int num,callBack<TestBean> callBack);

    public interface callBack<T>{
        void success(T data);
        void error();
    }

}
