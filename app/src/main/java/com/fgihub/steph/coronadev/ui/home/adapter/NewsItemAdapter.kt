package com.fgihub.steph.coronadev.ui.home.adapter

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.fgihub.steph.coronadev.databinding.CartViewBinding
import com.fgihub.steph.coronadev.network.news.NewsProperty

/**
 *  Create by stephcyrille (Stephcyril.sc@gmail.com) -- 4/13/20
 */
class NewsItemAdapter: ListAdapter<NewsProperty, NewsItemAdapter.NewsPropertyViewHolder>(DiffCallback)  {
    class NewsPropertyViewHolder(private var binding: CartViewBinding):
            RecyclerView.ViewHolder(binding.root) {
        fun bind(newsProperty: NewsProperty){
            binding.property = newsProperty
            binding.executePendingBindings()
        }

    }

    object DiffCallback: DiffUtil.ItemCallback<NewsProperty>() {
        override fun areItemsTheSame(oldItem: NewsProperty, newItem: NewsProperty): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: NewsProperty, newItem: NewsProperty): Boolean {
            return oldItem.id === newItem.id
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsItemAdapter.NewsPropertyViewHolder {
        return NewsPropertyViewHolder(CartViewBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: NewsItemAdapter.NewsPropertyViewHolder, position: Int) {
        val newsProperty = getItem(position)
        holder.bind(newsProperty)
    }
}