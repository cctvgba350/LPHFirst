package com.example.pingminmvp.base;

public class BasePresenter <V extends BaseView>{

    private V mvpView;

     public void attachView(V mvpView){

        this.mvpView = mvpView;
    }
    /**
     * 断开view，一般在onDestroy中调用
     */
    public void detachView(){
        this.mvpView = null;
    }

    /**
     * 是否与mView建立连接  每次调用业务请求的时候都要先调用方法检查是否与View建立连接
     *
     * @return
     */
    public boolean isViewAttached() {
        return mvpView != null;
    }

    /**
     * 获取连接的view
     */
    public V getMvpView(){
        return mvpView;
    }


}
