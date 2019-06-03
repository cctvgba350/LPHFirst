package com.example.pingminmvp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pingminmvp.base.BaseActivity;

public class MainActivity extends BaseActivity implements MvpView{

    private TextView mText;
    private MvpPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.text);
//        progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("正在加载数据");
//        progressDialog.setCancelable(false);
        mvpPresenter = new MvpPresenter();
        mvpPresenter.attachView(this);
    }

    public void getData(View view) {
        mvpPresenter.getData("normal");
    }

    public void getDataForFailure(View view) {
        mvpPresenter.getData("failure");
    }

    public void getDataForError(View view) {
        mvpPresenter.getData("error");
    }



//    @Override
//    public void showLoading() {
//        if(!progressDialog.isShowing()){
//            progressDialog.show();
//        }
//    }
//
//    @Override
//    public void hideLoding() {
//        if(progressDialog.isShowing()){
//            progressDialog.dismiss();
//        }
//    }

    @Override
    public void showData(String data) {
            mText.setText(data);
    }

    @Override
    public void showfailureMessage(String msg) {
        mText.setText(msg);
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mvpPresenter.detachView();
    }
}
