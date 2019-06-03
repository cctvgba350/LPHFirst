package com.example.qigaimvp;


import android.os.Handler;

public class MvpModel {

    /**
     * 获取网络请求接口
     *
     * @param param  请求参数
     * @param mvpCallback  数据回调接口
     */
    public static void getNewData(final String param, final MvpCallback mvpCallback) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (param) {
                    case "normal":
                        mvpCallback.onSuccess("根据参数"+param+"的请求网络数据请求成功");
                        break;
                    case "failure":
                        mvpCallback.onFailsure("请求失败，参数错误");
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
