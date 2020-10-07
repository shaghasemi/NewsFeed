package com.example.newsfeed

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapter.NewsMainAdapter
import com.example.newsfeed.model.newsListOnline
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val request = ServiceBuilder.buildService(MyNewsApi::class.java)
    val call = request.getNewsMain("api_key")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        call.enqueue(object : Callback<newsListOnline> {
            override fun onResponse(
                call: Call<newsListOnline>,
                response: Response<newsListOnline>
            ) {
                if (response.isSuccessful) {
                    rv_main.adapter = NewsMainAdapter(response.body().results)
                    rv_main.layoutManager = LinearLayoutManager(applicationContext)
                }
            }

            override fun onFailure(call: Call<newsListOnline>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_SHORT).show()
            }

        })


    }
}