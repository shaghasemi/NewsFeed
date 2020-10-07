package com.example.newsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapter.NewsMainAdapter
import com.example.newsfeed.data.dataData.newsData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_main.adapter = NewsMainAdapter(newsData)
        rv_main.layoutManager = LinearLayoutManager(applicationContext)
    }
}