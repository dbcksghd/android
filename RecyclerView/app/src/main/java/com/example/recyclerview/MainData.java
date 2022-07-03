package com.example.recyclerview;

public class MainData {

    private int imageview;
    private String tv_name;
    private String tv_content;

    public MainData(int imageview, String tv_name, String tv_content) {
        this.imageview = imageview;
        this.tv_name = tv_name;
        this.tv_content = tv_content;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_content() {
        return tv_content;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }
}
