package com.example.sina.activity;

import android.app.Application;

import com.example.sina.utils.Constants;
import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.auth.AuthInfo;

public class myApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WbSdk.install(this,new AuthInfo(this, Constants.APP_KEY,Constants.REDIRECT_URL,
                Constants.SCOPE));
    }
}
