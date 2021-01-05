package com.myanmaritc.newsapp.ui.technology

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myanmaritc.newsapp.News
import com.myanmaritc.newsapp.api.NewsApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val news: MutableLiveData<News> = MutableLiveData()

    fun getNews(): LiveData<News> = news

    fun loadNews() {
        val apiClient = NewsApiClient()

        val apiCall = apiClient.getNewsWithCategory("technology")

        apiCall.enqueue(object : Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {

            }

            override fun onFailure(call: Call<News>, t: Throwable) {

            }

        })
    }
}