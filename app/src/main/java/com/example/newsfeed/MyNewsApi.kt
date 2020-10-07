package com.example.newsfeed

import com.example.newsfeed.model.NewsDataModelReal
import com.example.newsfeed.model.newsListOnline
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MyNewsApi {
    @GET("top-headlines?country=us&apiKey=83f22a5d248b49ccb0cc392687bcd061")

    fun getNewsMain(@Query("api_key") key: String): Call<newsListOnline>

}