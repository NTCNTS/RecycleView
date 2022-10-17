package com.example.recycleview;

import android.graphics.Bitmap;

public class Game {
    String name,mota;
    int hinh;

    public Game(String name, String mota, int hinh) {
        this.name = name;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
