package com.baiyyyhjl.citylist;

import android.app.Application;
import android.content.Context;

/**
 * Created by huangjinlong on 2016/3/9.
 */
public class MyApplication extends Application{
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
    }

    public static Context getContextObject(){
        return mContext;
    }
}
