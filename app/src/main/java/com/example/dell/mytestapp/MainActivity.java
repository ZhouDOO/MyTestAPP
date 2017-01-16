package com.example.dell.mytestapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dell.mytestapp.activityLifeCycle.LifeCycleActivity;
import com.example.dell.mytestapp.glide.GlideActivity;
import com.example.dell.mytestapp.glideList.GlideListActivity;

public class MainActivity extends Activity implements View.OnClickListener{
    private TextView glideTv,glideListTv,lifeCycleTv;

    private Intent itt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initData(){

    }

    public void initView(){
        glideTv=(TextView)findViewById(R.id.main_glide_tv);
        glideListTv=(TextView)findViewById(R.id.main_glide_list_tv);
        lifeCycleTv=(TextView)findViewById(R.id.main_life_cycle_tv);

        glideTv.setOnClickListener(this);
        glideListTv.setOnClickListener(this);
        lifeCycleTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_glide_tv:
                itt=new Intent(this, GlideActivity.class);
                startActivity(itt);
                break;
            case R.id.main_glide_list_tv:
                itt=new Intent(this, GlideListActivity.class);
                startActivity(itt);
                break;
            case R.id.main_life_cycle_tv:
                itt=new Intent(this, LifeCycleActivity.class);
                startActivity(itt);
                break;
            default:break;
        }
    }
}
