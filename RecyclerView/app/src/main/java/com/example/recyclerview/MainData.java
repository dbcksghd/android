package com.example.recyclerview;

public class MainData {

    private int imageview;
    private String textview;

    public MainData(int imageview,  String textview) {
        this.imageview = imageview;
        this.textview = textview;
    }

    public int getImageview() {
        return imageview;
    }


    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public String getTv_content() {
        return textview;
    }

    public void setTv_content(String tv_content) {
        this.textview = textview;
    }
}
