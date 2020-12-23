package com.example.photogallery.model;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Photo {
    @NonNull
    @PrimaryKey
    public String id;
    public String owner;
    public String secret;
    public String server;
    public Integer farm;
    public String title;
    public Integer ispublic;
    public Integer isfriend;
    public Integer isfamily;
    public String url_s;
    public String height_s;
    public String width_s;
}
