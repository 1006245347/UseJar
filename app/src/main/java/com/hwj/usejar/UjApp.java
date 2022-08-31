package com.hwj.usejar;

import android.app.Application;

import com.hwj.sdk.SdkLibUtil;

/**
 * @author by jason-何伟杰，2022/8/31
 * des:不加 public竟然崩溃
 */
public class UjApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SdkLibUtil.init(this,"20220831build","666mac");
    }
}
