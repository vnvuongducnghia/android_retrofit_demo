package com.nghia.androidretrofitdemo.objects

import com.google.gson.annotations.SerializedName

/**
 * Created by nghia.vuong on 28,May,2021
 */
class Comment {
    val postId = 0
    val id = 0
    val name: String? = null
    val email: String? = null

    @SerializedName("body")
    val text: String? = null
}
