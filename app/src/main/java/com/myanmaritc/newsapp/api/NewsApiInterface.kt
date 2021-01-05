package com.myanmaritc.newsapp.api

import com.myanmaritc.newsapp.News
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiInterface {

    @GET("top-headlines")
    fun getNewsWithCategory(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("apiKey") apiKey: String
    ): Call<News>

    @GET("everything")
    fun getEverything(
        @Query("q") query: String,
        @Query("apiKey") apiKey: String
    ): Call<News>


}