package com.example.sina.activity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;


import com.example.sina.R;

import com.example.sina.utils.SPUtils;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.WbConnectErrorMessage;
import com.sina.weibo.sdk.auth.sso.SsoHandler;


public class LandingPageActivity extends BaseActivity {
    private SsoHandler mssoHandler;
    private SPUtils spUtils;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mssoHandler=new SsoHandler(LandingPageActivity.this);
        spUtils=SPUtils.getInstance(getApplicationContext());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                checkLogin();


            }
        },3000);
        getToolBarx().hide();


    }

    private void checkLogin() {
        if (spUtils.IsLogin()){
            startActivity(new Intent(LandingPageActivity.this,HomePageActivity.class));
            finish();
        }else{
            mssoHandler.authorize(new WbAuthListener() {
                @Override
                public void onSuccess(Oauth2AccessToken oauth2AccessToken) {
                    Log.d("Oauth2AccessToken",oauth2AccessToken.toString());
                    spUtils.SavaToken(oauth2AccessToken);
                    startActivity(new Intent(LandingPageActivity.this,HomePageActivity.class));
                    finish();
                }

                @Override
                public void cancel() {
                    Log.d("Oauth2AccessToken","3");
                }

                @Override
                public void onFailure(WbConnectErrorMessage wbConnectErrorMessage) {
                    Log.d("Oauth2AccessToken", "2");
                }
            });
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // SSO 授权回调
        // 重要：发起 SSO 登陆的 Activity 必须重写 onActivityResults
        if (mssoHandler != null) {
            mssoHandler.authorizeCallBack(requestCode, resultCode, data);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.ac_landing;
    }
}
