package com.nghia.androidretrofitdemo.objects

import com.google.gson.annotations.SerializedName

/**
 * Created by nghia.vuong on 28,May,2021
 */
class Post {
    val userId = 0
    val id = 0
    val title: String? = null

    @SerializedName("body")
    val text: String? = null
}