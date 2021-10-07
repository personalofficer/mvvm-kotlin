package com.example.heykt.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userId",alternate = ["UserId"])
    @Expose
    val image: String,
    @SerializedName("id",alternate = ["Id"])
    @Expose
    val userEmail: String,
    @SerializedName("body",alternate = ["Body"])
    @Expose
    val userId: String,
    @SerializedName("title",alternate = ["Title"])
    @Expose
    val userName: String
)
