package com.example.qigaimvp;

public interface MvpCallback {
    /**
     * 请求数据成功
     *
     * @param data 请求到的数据
     */
    void onSuccess(String data);

    /**
     * 使用网络API接口时，虽然已经请求成功，但是由于code msg的原因 无法正常返回数据
     * @param data
     */
    void onFailsure(String data);

    /**
     * 请求数据失败，指在请求网络API接口请求方式时，出现无法联网、
     * 缺少权限，内存泄露等原因导致无法连接到请求数据源。
     */
    void onError();

    /**
     * 当数据请求结束时，无论请求成功失败哈市异常，都会返回结果给使用者，通常在
     * 此处时可以做隐藏"正在加载的控件"
     */
    void onComplete();
}
