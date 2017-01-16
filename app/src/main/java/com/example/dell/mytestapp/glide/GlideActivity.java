package com.example.dell.mytestapp.glide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dell.mytestapp.R;
import com.example.dell.mytestapp.bean.GlideBean;

/**
 * Created by dell on 2017/1/13.
 */
public class GlideActivity extends Activity{
    private ImageView imgIv;
    private String imgUrl="http://i4.piimg.com/11340/7f638e192b9079e6.jpg";

    private GlideBean glideBean;
    private Intent itt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        initView();
        initData();
    }

    public void initData(){
        itt=getIntent();
        glideBean=(GlideBean) itt.getSerializableExtra("bean");
        if(glideBean==null){
            Glide.with(this).load(imgUrl).into(imgIv);
            return;
        }
        Glide.with(this).load(glideBean.getUrl()).into(imgIv);
    }

    public void initView(){
        imgIv=(ImageView)findViewById(R.id.glide_img_iv);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
