package com.example.pingminmvp.base;

import android.content.Context;

public interface BaseView {
    void showLoading();

    void hideLoding();

//    void showData(String data);

    void showfailureMessage(String msg);

//    void showErrorMessage();
    /**
     * 显示请求错误提示
     */
    void showErrorMessage();
    /**
     * 获取上下文
     * @return 上下文
     */
    Context getContext();
}
