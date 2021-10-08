package com.example.heykt.data.repo

import com.example.heykt.retrofit.ApiHelper
import com.example.heykt.retrofit.modal.request.UserRequestModel

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

    suspend fun getUsersById(id:Int) = apiHelper.getUsersById(id)

    suspend fun getComment() = apiHelper.getComment()

    suspend fun getCommentByPostId(id:Int) = apiHelper.getCommentByPostId(id)

    suspend fun getPostAPost(userRequestModel: UserRequestModel) = apiHelper.getPostAPost(userRequestModel)

}