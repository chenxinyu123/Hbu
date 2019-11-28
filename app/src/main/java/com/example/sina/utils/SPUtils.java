package com.example.sina.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

public class SPUtils {
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;
    private static SPUtils instance;
    private static final String SP_name="Csina";
    private static final String Access_Token="Access_Token";
    private static final String IsLogin="IsLogin";
    private SPUtils(){}

    @SuppressLint("CommitPrefEdits")
    public static SPUtils getInstance(Context context) {
        if (instance==null){
            synchronized (SPUtils.class){
                instance=new SPUtils();
                sharedPreferences=context.getSharedPreferences(SP_name, Activity.MODE_PRIVATE);
                editor=sharedPreferences.edit();
            }
        }
        return instance;
    }
    public void SavaToken(Oauth2AccessToken oauth2AccessToken){
        editor.putString(Access_Token,new Gson().toJson(oauth2AccessToken)).commit();
        editor.putBoolean(IsLogin,true).commit();
    }
    public boolean IsLogin(){
        return sharedPreferences.getBoolean(IsLogin,false);
    }
    public Oauth2AccessToken getToken(){
        String json=sharedPreferences.getString(Access_Token,"");
        if (TextUtils.isEmpty(json)){
            return null;
        }
        return new Gson().fromJson(json,Oauth2AccessToken.class);
    }
    public void delece(){
        editor.remove(Access_Token);
        editor.remove(IsLogin);
        editor.commit();
    }
}
