package com.fgihub.steph.coronadev.ui.home.adapter

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.fgihub.steph.coronadev.R
import com.fgihub.steph.coronadev.network.news.NewsProperty
import com.fgihub.steph.coronadev.ui.home.NewsApiStatus
import com.squareup.picasso.Picasso

/**
 *  Create by stephcyrille (Stephcyril.sc@gmail.com) -- 4/13/20
 */

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView, data: List<NewsProperty>?){
    val adapter = recyclerView.adapter as NewsItemAdapter
    adapter.submitList(data)
}

@BindingAdapter("picture")
fun bindingImage(imgView: ImageView, imgUrl: String?) {
    imgUrl?.let {
        val imgUri = it.toUri().buildUpon().scheme("http").build()
        Picasso.get()
            .load(imgUri)
            .into(imgView)
    }
}

@BindingAdapter("newsApiStatus")
fun bindStatus(statusImageView: ImageView, status: NewsApiStatus){
    when (status){
        NewsApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        NewsApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_cloud_off_black_24dp)
        }
        NewsApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }

    }
}