package com.blessednafula.myposts

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>

    @GET("/posts/{postsId}")
    fun getPostsById(@Path("postId") PostId:Int):Call<Post>

    @GET("/comments/{postsId}")
    fun getCommentsbyId(@Path("id")comment: String):Call<List<Comment>>


}