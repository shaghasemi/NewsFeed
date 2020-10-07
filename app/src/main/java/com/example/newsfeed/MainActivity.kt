package com.example.newsfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsfeed.adapter.NewsMainAdapter
import com.example.newsfeed.model.NewsDataModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsData = listOf(
            NewsDataModel(
                "Fake Title",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the " +
                        "1500s, when an unknown printer took a galley of type and scrambled it to " +
                        "make a type specimen book. It has survived not only five centuries, but " +
                        "also the leap into electronic typesetting, remaining essentially unchanged." +
                        " It was popularised in the 1960s with the release of Letraset sheets " +
                        "containing Lorem Ipsum passages, and more recently with desktop publishing" +
                        " software like Aldus PageMaker including versions of Lorem Ipsum.",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                        "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
                        "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
                        "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate " +
                        "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat" +
                        " cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id" +
                        " est laborum.",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            ),
            NewsDataModel(
                "Fake Title",
                "Fake description",
                "Fake Date and Time",
                R.drawable.placeholder_image
            )
        )

        rv_main.adapter = NewsMainAdapter(newsData)
        rv_main.layoutManager = LinearLayoutManager(applicationContext)
    }
}