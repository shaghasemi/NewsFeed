package com.example.newsfeed.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsfeed.R
import com.example.newsfeed.model.NewsDataModel
import kotlinx.android.synthetic.main.item_a_news_main.view.*

class NewsMainAdapter(val newsData: List<NewsDataModel>) :
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
        holder.itemView.tv_item_a_news_desc.text = newsData[position].desc
        holder.itemView.tv_item_a_news_time.text = newsData[position].time
        holder.itemView.iv_item_a_news_thumbnail.setImageResource(newsData[position].image)
    }

    override fun getItemCount(): Int = newsData.size
}