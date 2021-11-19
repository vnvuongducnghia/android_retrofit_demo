package com.nghia.androidretrofitdemo

import com.nghia.androidretrofitdemo.objects.Constants
import com.nghia.androidretrofitdemo.objects.LoginRequest
import com.nghia.androidretrofitdemo.objects.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by nghia.vuong on 28,May,2021
 * Where we will define our api request functions.
 */
interface ApiService {

    @POST(Constants.LOGIN_URL)
    fun login(@Body r: LoginRequest): Call<LoginResponse>

}
