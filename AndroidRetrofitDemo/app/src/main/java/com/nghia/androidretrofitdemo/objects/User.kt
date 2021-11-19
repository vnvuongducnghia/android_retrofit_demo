package com.nghia.androidretrofitdemo.objects

import com.google.gson.annotations.SerializedName

/**
 * Created by ${nghia.vuong} on 25,June,2021
 */
data class User(
    @SerializedName("id")
    val id: String,

    @SerializedName("first_name")
    var firstName: String,

    @SerializedName("last_name")
    var lastName: String,

    @SerializedName("email")
    var email: String
)