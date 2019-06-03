package com.example.pingminmvp;

public interface MvpCallback <T> {
    void onSuccess(T data);

    void onFailuure(String msg);

    void onError();

    void onComplete();
}
