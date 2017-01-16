package com.example.dell.mytestapp.activityLifeCycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.dell.mytestapp.R;

/**
 * Created by dell on 2017/1/16.
 */
public class LifeCycleActivity extends Activity{
    private TextView lifeCycleTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e("生命周期","onRestart");
        initView();
    }

    public void initView(){
        lifeCycleTv=(TextView)findViewById(R.id.life_cycle_tv);
    }

    /**从后台重新回到该页面*/
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("生命周期","onRestart");
    }

    /**Activity创建或者从后台重新回到前台时被调用*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("生命周期","onStart");
    }

    /**
     *Activity创建或者从被覆盖、后台重新回到前台时被调用
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.e("生命周期","onResume");
    }

    /**
     *  Activity被覆盖到下面或者锁屏时被调用
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("生命周期","onPause");
    }

    /**
     *退出当前Activity或者跳转到新Activity时被调用
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.e("生命周期","onStop");
    }

    /**
     *退出当前Activity时被调用,调用之后Activity就结束了
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("生命周期","onDestroy");
    }
}
