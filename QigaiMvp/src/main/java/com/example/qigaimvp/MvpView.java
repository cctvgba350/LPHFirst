package com.example.qigaimvp;

public interface MvpView {
    /**
     *显示正在加载进度框
     */
    void showLoading();
    /**
     *隐藏正在加载对话框
     */
    void hideLoding();

    /**
     *当数据请求成功后，调用此接口
     * @param data
     */
    void showData(String data);

    /**
     *当数据请求失败后，调用此借接口提示
     * @param message 失败原因
     */
    void showFailureMessage(String message);
    /**
     * 当数据请求异常，调用此接口提示
     */
    void showErrorMessage();
}
