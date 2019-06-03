package com.example.pingminmvp;

import android.os.Handler;

public class MvpModel {

    public static void getNewData(final String params, final MvpCallback mvpCallback){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (params){
                    case "normal":
                        mvpCallback.onSuccess("normal请求成功");
                        break;
                    case "failure":
                        mvpCallback.onFailuure("failure请求失败");
                        break;
                    case "error":
                        mvpCallback.onError();
                        break;
                }
                mvpCallback.onComplete();
            }
        }, 2000);
    }
}
