package com.example.qigaimvp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements MvpView {

    private TextView text;
    private ProgressDialog progressDialog;
    private MvpPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        //初始化进度条
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("正在加载数据");
        progressDialog.setCancelable(false);

        mvpPresenter = new MvpPresenter(this);
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

    @Override
    public void showLoading() {
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    @Override
    public void hideLoding() {
        if (progressDialog .isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showData(String data) {
        text.setText(data);
    }

    @Override
    public void showFailureMessage(String message) {
        text.setText(message);
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "异常", Toast.LENGTH_SHORT).show();
    }
}
