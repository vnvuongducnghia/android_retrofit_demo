package com.nghia.androidretrofitdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nghia.androidretrofitdemo.objects.Post
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Init retrofit
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val jsonPlaceHolderApi = retrofit.create(ApiService::class.java)
        val request = jsonPlaceHolderApi.getPostList()
        // Run request
        request.enqueue(object : Callback<List<Post>> {
            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                if (!response.isSuccessful) {
                    text_view_result.text = "Code: ${response.code()}"
                    return
                }
                text_view_result.text = "Code: ${response.body()!!.size}"
            }

            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                text_view_result.setText(t.message)
            }
        })
    }
}
