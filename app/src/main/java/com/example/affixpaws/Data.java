package com.example.affixpaws;

public class Data {
    private int mimageRes;
    private String user;
    private String mtext1;

    public  Data(int imageresource, String text1, String text2) {
      mimageRes = imageresource;
      mtext1 = text2;
      user = text1;

    }

    public String getUser(){
        return user;
    }

    public int getImageResource(){
        return mimageRes;
    }

    public String gettext1(){
        return mtext1;
    }


}