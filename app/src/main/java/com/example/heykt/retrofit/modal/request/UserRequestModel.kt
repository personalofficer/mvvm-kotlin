package com.example.heykt.retrofit.modal.request

import com.google.gson.annotations.SerializedName

class UserRequestModel() {

    @SerializedName("userId")
    var userId: Int? = 0;

    @SerializedName("id")
    var id: Int? = 0;

    @SerializedName("title")
    var title: String? = null;

    @SerializedName("body")
    var body: String? = null;

}