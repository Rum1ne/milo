package com.example.flexible_talk.database.room;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {UserEntity.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract UserDAO UserDao();
}
