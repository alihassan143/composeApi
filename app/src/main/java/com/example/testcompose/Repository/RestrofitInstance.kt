package com.example.testcompose.Repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiInstance {
    companion object {
        val  instance: ApiRepository by lazy {
            Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com").addConverterFactory(
                GsonConverterFactory.create()).build().create(ApiRepository::class.java)
        }
    }
}