package com.nghia.androidretrofitdemo.objects

import com.google.gson.annotations.SerializedName

/**
 * Created by ${nghia.vuong} on 25,June,2021
 */

data class LoginRequest(
    @SerializedName("email")
    var email: String,

    @SerializedName("password")
    var password: String
)

data class LoginResponse(
    @SerializedName("status_code")
    var statusCode: Int,

    @SerializedName("auth_token")
    var authToken: String,

    @SerializedName("user")
    var user: User
)
