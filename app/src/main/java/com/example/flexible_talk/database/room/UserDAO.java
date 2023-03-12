package com.example.flexible_talk.database.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO{

    @Query("SELECT * FROM UserEntity")
    List<UserEntity> getAll();

    @Insert
    void save(UserEntity user);

    @Query("SELECT * FROM UserEntity WHERE id = :id")
    UserEntity getUserById(int id);

}
