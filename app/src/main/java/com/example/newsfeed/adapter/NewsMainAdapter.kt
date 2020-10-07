package com.example.newsfeed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.R
import com.example.newsfeed.model.NewsDataModelReal
import kotlinx.android.synthetic.main.item_a_news_main.view.*

class NewsMainAdapter(val newsData: List<NewsDataModelReal>) :
    RecyclerView.Adapter<NewsMainAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_a_news_main, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.itemView.tv_item_a_news_title.text = newsData[position].title
        holder.itemView.tv_item_a_news_desc.text = newsData[position].description
        holder.itemView.tv_item_a_news_time.text = newsData[position].publishedAt
        holder.itemView.iv_item_a_news_thumbnail.setImageResource(newsData[position].urlToImage.toInt())
    }

    override fun getItemCount(): Int = newsData.size
}