package com.example.qigaimvp;

public class MvpPresenter {

    private MvpView mView;

    public MvpPresenter(MvpView view) {
        mView = view;
    }

    /**
     * 获取网络数据
     * @param params
     */
    public void getData(String params){
        mView.showLoading();
        MvpModel.getNewData(params, new MvpCallback() {
            @Override
            public void onSuccess(String data) {
                //调用view接口显示数据
                mView.showData(data);
            }

            @Override
            public void onFailsure(String msg) {
                mView.showFailureMessage(msg);
            }

            @Override
            public void onError() {
                mView.showErrorMessage();
            }

            @Override
            public void onComplete() {
                mView.hideLoding();
            }
        });
    }
}
