package com.example.flexible_talk.database.room;

import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String nickName;
    public String email;

    public UserEntity(String nickName, String email) {
        this.nickName = nickName;
        this.email = email;
    }
}
