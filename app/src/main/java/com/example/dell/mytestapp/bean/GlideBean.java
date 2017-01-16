package com.example.dell.mytestapp.bean;

import java.io.Serializable;

/**
 * Created by dell on 2017/1/13.
 */
public class GlideBean implements Serializable{
    private String name;
    private String url;

    public GlideBean() {
    }

    public GlideBean(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
