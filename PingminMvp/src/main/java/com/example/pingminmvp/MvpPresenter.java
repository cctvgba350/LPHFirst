package com.example.pingminmvp;

import com.example.pingminmvp.base.BasePresenter;

public class MvpPresenter extends BasePresenter<MvpView>{


    public MvpPresenter() {

    }



//    /**
//     * 是否与mView建立连接  每次调用业务请求的时候都要先调用方法检查是否与View建立连接
//     *
//     * @return
//     */
//    public boolean isViewAttached() {
//        return mView != null;
//    }

    public void getData(String params) {
        if (!isViewAttached()){
            //如果没有View引用就不加载数据
            return;
        }
        getMvpView().showLoading();

        MvpModel.getNewData(params, new MvpCallback<String>() {
            @Override
            public void onSuccess(String data) {
                if (isViewAttached()) {

                    getMvpView().showData(data);
                }
            }

            @Override
            public void onFailuure(String msg) {
                if (isViewAttached()) {

                    getMvpView().showfailureMessage(msg);
                }
            }

            @Override
            public void onError() {
                if (isViewAttached()) {

                    getMvpView().showErrorMessage();
                }
            }

            @Override
            public void onComplete() {
                if (isViewAttached()) {

                    getMvpView().hideLoding();
                }
            }
        });

    }


}
