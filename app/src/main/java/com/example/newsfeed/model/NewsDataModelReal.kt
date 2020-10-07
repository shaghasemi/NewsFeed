package com.example.newsfeed.model

data class newsListOnline(
    val results: List<NewsDataModelReal>
)

data class NewsDataModelReal(
    val title: String,
    val description: String,
    val publishedAt: String,
    val urlToImage: String
)