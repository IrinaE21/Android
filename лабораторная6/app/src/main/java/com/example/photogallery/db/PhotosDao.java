package com.example.photogallery.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import com.example.photogallery.model.Photo;

import java.util.List;

import retrofit2.http.Query;

@Dao
public interface PhotosDao {
    @Query("SELECT * FROM Photo")
    public List<Photo> LoadAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPhoto(Photo photo);

    @Delete
    public void deletePhoto(Photo photo);
}
