package com.example.photogallery.api;

import com.example.photogallery.model.PhotosResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrAPI {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=11f229c1e22485d9973068505c9c4f85&extras=url_s&format=json&nojsoncallback=1")
            Call<PhotosResponse> getRecent();
            @GET("services/rest/?method=flickr.photos.search&api_key=11f229c1e22485d9973068505c9c4f85&extras=url_s&format=json&nojsoncallback=1")
                    Call<PhotosResponse> getSearchPhotos(@Query("text") String keyWord);

}
