package com.example.dell.mytestapp.glideList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dell.mytestapp.R;
import com.example.dell.mytestapp.adapter.GlideListAdapter;
import com.example.dell.mytestapp.bean.GlideBean;
import com.example.dell.mytestapp.glide.GlideActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/13.
 */
public class GlideListActivity extends Activity implements AdapterView.OnItemClickListener{
    private ListView listView;

    private GlideListAdapter glideListAdapter;

    private List<GlideBean> list=new ArrayList<GlideBean>();
    private GlideBean glideBean;
    private Intent itt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_list);
        initView();
        initData();
    }

    public void initData(){
//        list.add(new GlideBean("GlideListView0",""));
        list.add(new GlideBean("GlideListView1","http://i4.piimg.com/11340/7f638e192b9079e6.jpg"));
        list.add(new GlideBean("GlideListView2","http://pic47.nipic.com/20140902/12918166_193551217000_2.jpg"));
        list.add(new GlideBean("GlideListView3","http://tupian.enterdesk.com/2014/mxy/02/11/4/4.jpg"));
        list.add(new GlideBean("GlideListView4","http://tupian.enterdesk.com/2013/mxy/12/10/15/3.jpg"));
        list.add(new GlideBean("GlideListView5","http://img.taopic.com/uploads/allimg/140826/267848-140R60T34860.jpg"));
        list.add(new GlideBean("GlideListView6","http://pic17.nipic.com/20111122/6759425_152002413138_2.jpg"));
        list.add(new GlideBean("GlideListView7","http://img.51ztzj.com/upload/image/20170112/2017011203_670x419.jpg"));
        list.add(new GlideBean("GlideListView8","http://pic72.nipic.com/file/20150716/21422793_144600530000_2.jpg"));
        list.add(new GlideBean("GlideListView9","http://pic24.nipic.com/20120925/4388163_012802746180_2.jpg"));
        list.add(new GlideBean("GlideListView10","http://img.taopic.com/uploads/allimg/140326/235113-1403260I05466.jpg"));
        list.add(new GlideBean("GlideListView11","http://www.pp3.cn/uploads/201508/2015083012.jpg"));
        list.add(new GlideBean("GlideListView12","http://pic76.nipic.com/file/20150826/12702443_165135194000_2.jpg"));
        list.add(new GlideBean("GlideListView13","http://m2.quanjing.com/2m/rob_pre007/rob-478-4987.jpg"));
        list.add(new GlideBean("GlideListView14","http://tupian.enterdesk.com/2012/1030/gha/2/enterdesk%20%284%29.jpg"));
        list.add(new GlideBean("GlideListView15","http://img.taopic.com/uploads/allimg/130331/240460-13033106243430.jpg"));
        list.add(new GlideBean("GlideListView16","http://tupian.enterdesk.com/2012/0917/gha/1/enterdesk%20%288%29.jpg"));
        list.add(new GlideBean("GlideListView17","http://pic74.nipic.com/file/20150809/21519723_051112912000_2.jpg"));
        list.add(new GlideBean("GlideListView18","http://rescdn.qqmail.com/dyimg/20140921/7DB20144DE1A.jpg"));
        list.add(new GlideBean("GlideListView19","http://www.pp3.cn/uploads/201608/201608192.jpg"));
        list.add(new GlideBean("GlideListView20","http://dl.bizhi.sogou.com/images/2013/11/07/401031.jpg"));

        glideListAdapter=new GlideListAdapter(this,list);
        listView.setAdapter(glideListAdapter);
    }

    public void initView(){
        listView=(ListView)findViewById(R.id.normal_list);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()){
            case R.id.normal_list:
                glideBean=glideListAdapter.getBean(position);
                itt=new Intent(this, GlideActivity.class);
                itt.putExtra("bean",glideBean);
                startActivity(itt);
                break;
        }
    }
}
