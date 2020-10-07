package com.example.newsfeed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapter.NewsMainAdapter
import com.example.newsfeed.data.dataData.newsData
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit = Retrofit.Builder().build()
//        var retrofit = retrofit.newBuilder().build()

        rv_main.adapter = NewsMainAdapter(newsData)
        rv_main.layoutManager = LinearLayoutManager(applicationContext)
    }
}