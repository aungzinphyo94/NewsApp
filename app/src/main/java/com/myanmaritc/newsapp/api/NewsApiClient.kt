package com.myanmaritc.newsapp.api

import com.myanmaritc.newsapp.News
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsApiClient {

    private val BASE_URL = "http://newsapi.org/v2/"

    private var newsApiInterface: NewsApiInterface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsApiInterface = retrofit.create(NewsApiInterface::class.java)
    }

    fun getNewsWithCategory(category: String): Call<News> {
        return newsApiInterface.getNewsWithCategory(
            "us",
            category,
            "e5a7abe04cb44e41843fc49f810f6591"
        )
    }

    fun getEverything(query:String): Call<News> {
        return newsApiInterface.getEverything(
            "a", "e5a7abe04cb44e41843fc49f810f6591"
        )
    }
}