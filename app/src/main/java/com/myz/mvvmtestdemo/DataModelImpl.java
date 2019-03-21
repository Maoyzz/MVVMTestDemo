package com.myz.mvvmtestdemo;

import android.os.Handler;
import android.os.Looper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author myz
 * @date 2019/3/21
 * desc:
 */
public class DataModelImpl implements DataModel{

    public DataModelImpl(){
        initData();
    }

    @Override
    public void getData(final int num, final callBack<TestBean> callBack) {
        new Handler(Looper.getMainLooper())
                .postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        TestBean testBean = new TestBean();
                        testBean.setNum(num);
                        testBean.setUrl(getImage(num));
                        callBack.success(testBean);
                    }
                }, 1000);
    }

    private List<String> list = new ArrayList<String>();

    private void initData(){
        list.add("http://img1.imgtn.bdimg.com/it/u=4206294871,879077254&fm=26&gp=0.jpg");
        list.add("http://img1.imgtn.bdimg.com/it/u=1901690610,3955011377&fm=200&gp=0.jpg");
        list.add("http://img3.imgtn.bdimg.com/it/u=1546158593,2358526642&fm=200&gp=0.jpg");
        list.add("http://img0.imgtn.bdimg.com/it/u=3792909229,2321547963&fm=200&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=1621655683,865218969&fm=200&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=4286838121,1364454560&fm=26&gp=0.jpg");
        list.add("http://img5.imgtn.bdimg.com/it/u=551944592,1654216059&fm=26&gp=0.jpg");
        list.add("http://img1.imgtn.bdimg.com/it/u=2550323596,2167297465&fm=200&gp=0.jpg");
        list.add("http://img4.imgtn.bdimg.com/it/u=952962361,1269259737&fm=26&gp=0.jpg");
    }

    private String getImage(int position){
        if(position <= 8){
            return list.get(position);
        }else {
            return list.get(position % 9);
        }


    }
}
