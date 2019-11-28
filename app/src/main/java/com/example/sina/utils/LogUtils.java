package com.example.sina.utils;

import android.text.TextUtils;
import android.util.Log;

public class LogUtils {
    private static final String TAG="chenxinyu";
    public static void e(String message){
        if (!TextUtils.isEmpty(message)){
            Log.e(TAG,message);
        }
    } public static void d(String message){
        if (!TextUtils.isEmpty(message)){
            Log.d(TAG,message);
        }
    }
}
