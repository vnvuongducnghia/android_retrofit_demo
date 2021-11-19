package com.nghia.androidretrofitdemo

import com.nghia.androidretrofitdemo.objects.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by ${nghia.vuong} on 25,June,2021
 * Retrofit instance class
 */
class ApiClient {

    private lateinit var apiService: ApiService
    fun getApiService(): ApiService
    {
        // Initialize ApiService if not initialized yet
        if (!::apiService.isInitialized) {
            val retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        return apiService
    }
}