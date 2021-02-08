package com.takhir.daggerapp.network.main;

import com.takhir.daggerapp.models.Post;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    //posts?userId=1
    @GET("posts")
    Flowable<List<Post>> getPostsFromUser(
            @Query("userId") int id
    );
}
