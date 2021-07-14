package com.mastermind.daggerhilt.data

import com.mastermind.daggerhilt.model.Post
import retrofit2.http.GET

interface PostRequest {


    @GET("posts")
    suspend fun getPost():List<Post>

}