package com.example.sina.networks;

import android.content.Context;

import com.example.sina.module.HttpResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;

public abstract class BaseNetwork {
    private AsyncWeiboRunner asyncWeiboRunner;
    private String url;
    public BaseNetwork(Context context,String url) {
        asyncWeiboRunner=new AsyncWeiboRunner(context);
        this.url=url;
    }


    public RequestListener requestListener=new RequestListener() {
        @Override
        public void onComplete(String s) {
            boolean success=false;
            HttpResponse httpResponse=new HttpResponse();
            JsonParser parser=new JsonParser();
            JsonElement jsonElement = parser.parse(s);
            if (jsonElement.isJsonObject()){
                JsonObject object=jsonElement.getAsJsonObject();
                if (object.has("error_code")) {
                    httpResponse.code = object.get("error_code").getAsInt();
                    success = true;
                }
                if (object.has("error")) {
                    httpResponse.message = object.get("error").getAsString();
                    success = true;
                } else if (object.has("statuses")){
                    httpResponse.response=object.get("statuses").toString();
                    success=true;
                }else if (object.has("users")){
                    httpResponse.response=object.get("users").toString();
                    success=true;
                }else if (object.has("comments")) {
                    httpResponse.response = object.get("comments").toString();
                    success = true;
                }
                else {
                    httpResponse.response=s;
                    success=true;
                }
            }

            onFinish(httpResponse,success);
        }

        @Override
        public void onWeiboException(WeiboException e) {
            HttpResponse httpResponse=new HttpResponse();
            httpResponse.message=e.getMessage();
            onFinish(httpResponse,false);
        }
    };
    public void get(){
        asyncWeiboRunner.requestAsync(url,onPrepare(),"GET",
                requestListener);
    }
    public void post(){
        asyncWeiboRunner.requestAsync(url,onPrepare(),"POST",
                requestListener);
    }
    public void delete(){
        asyncWeiboRunner.requestAsync(url,onPrepare(),"DELETE",
                requestListener);
    }
    public abstract WeiboParameters onPrepare();
    public abstract void onFinish(HttpResponse response, boolean success);
}
