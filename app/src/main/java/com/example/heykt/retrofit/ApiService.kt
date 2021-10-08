package com.example.heykt.retrofit

import com.example.heykt.data.model.CommentsDataModel
import com.example.heykt.data.model.User
import com.example.heykt.retrofit.modal.request.UserRequestModel
import retrofit2.http.*

interface ApiService {

    @GET("posts")
    suspend fun getUsers(): List<User>

    @GET("posts/{id}")
    suspend fun getUsersById(@Path( "id") id:Int): User

    @GET("comments")
    suspend fun getComment(): List<CommentsDataModel>

    @GET("comments")
    suspend fun getCommentByPostId(@Query( "postId") id:Int): List<User>

    @POST("posts")
    suspend fun getPostAPost(@Body userRequestModel: UserRequestModel): User

}