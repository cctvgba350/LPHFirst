package com.example.pingminmvp.base;

public interface Callback<T> {
    void onSuccess(T data);

    void onFailuure(String msg);

    void onError();

    void onComplete();
}
