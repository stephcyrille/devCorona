package com.fgihub.steph.coronadev.network.news

import com.squareup.moshi.Json

/**
 *  Create by stephcyrille (Stephcyril.sc@gmail.com) -- 4/11/20
 */


data class NewsProperty(
    val id: Int,
    val title: String,
    val content: String,
    @Json(name = "created_date") val createdDate: String,
    @Json(name = "pictures") val picture: String
)

data class  Image(val id: Int, val name: String)