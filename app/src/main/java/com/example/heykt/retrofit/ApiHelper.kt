package com.example.heykt.retrofit

import com.example.heykt.retrofit.modal.request.UserRequestModel


class ApiHelper(private val apiService: ApiService) {

    suspend fun getUsers() = apiService.getUsers()

    suspend fun getUsersById(id:Int) = apiService.getUsersById(id)

    suspend fun getComment() = apiService.getComment()

    suspend fun getCommentByPostId(id:Int) = apiService.getCommentByPostId(id)

    suspend fun getPostAPost(userRequestModel: UserRequestModel) = apiService.getPostAPost(userRequestModel)

}