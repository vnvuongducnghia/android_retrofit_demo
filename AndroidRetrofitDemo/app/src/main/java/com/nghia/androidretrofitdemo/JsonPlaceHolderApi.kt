package com.nghia.androidretrofitdemo

import com.nghia.androidretrofitdemo.objects.Comment
import com.nghia.androidretrofitdemo.objects.Post
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by nghia.vuong on 28,May,2021
 */
internal interface JsonPlaceHolderApi {

    @GET("posts")
    fun getPostList(
        @Query("userId") userId: IntArray,
        @Query("_sort") sort: String,
        @Query("_oder") order: String
    ): Call<List<Post>> // api/posts?userId=[1,2,...]&_sort=id&_order=desc

    @GET("posts")
    fun getPostList(@QueryMap parameters: Map<String, String>): Call<List<Post>>

    @GET("posts/{id}/comments")
    fun getComments(@Path("id") postId: Int): Call<List<Comment>>

    @GET
    fun getComments(@Url url: String): Call<List<Comment>>
}
