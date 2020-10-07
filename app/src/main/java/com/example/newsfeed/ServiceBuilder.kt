package com.example.newsfeed

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {

    val client = OkHttpClient.Builder().build()

    val retrofit = Retrofit.Builder()
        .baseUrl("http://newsapi.org/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}