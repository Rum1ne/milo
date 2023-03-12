package com.example.flexible_talk.database;

import android.graphics.Bitmap;

public class User {
    public int id;
    public String nickName;
    public String email;

    public User(int id, String nickName, String email) {
        this.id = id;
        this.nickName = nickName;
        this.email = email;
    }
}
