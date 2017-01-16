package com.example.dell.mytestapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dell.mytestapp.R;
import com.example.dell.mytestapp.bean.GlideBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/1/13.
 */
public class GlideListAdapter extends BaseAdapter{
    private List<GlideBean> list=new ArrayList<GlideBean>();
    private Context context;

    public GlideListAdapter(Context context,List<GlideBean> list) {
        this.list = list;
        this.context = context;
    }

    public GlideBean getBean(int position){
        if(position<list.size()){
            return list.get(position);
        }else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if(convertView==null){
            holder=new Holder();
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_glide_list_item,null);
            holder.textView=(TextView)convertView.findViewById(R.id.glide_item_tv);
            holder.imageView=(ImageView)convertView.findViewById(R.id.glide_item_img);
            convertView.setTag(holder);
        }else{
            holder=(Holder)convertView.getTag();
        }
        GlideBean bean=list.get(position);
        holder.textView.setText(bean.getName());
        Glide.with(context).load(bean.getUrl()).centerCrop().placeholder(R.mipmap.ic_launcher).crossFade().into(holder.imageView);
        return convertView;
    }

    class Holder{
        private ImageView imageView;
        private TextView textView;
    }
}
