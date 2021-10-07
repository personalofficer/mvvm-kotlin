package com.example.heykt.retrofit

import com.example.heykt.data.model.CommentsDataModel
import com.example.heykt.data.model.User
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("posts")
    suspend fun getUsers(): List<User>

    @GET("posts/{id}")
    suspend fun getUsersById(@Path( "id") id:Int): User

    @GET("comments")
    suspend fun getComment(): List<CommentsDataModel>

    @GET("comments")
    suspend fun getCommentByPostId(@Query( "postId") id:Int): List<User>

}