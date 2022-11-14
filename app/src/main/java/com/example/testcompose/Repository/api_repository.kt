package com.example.testcompose.Repository

import com.example.testcompose.Repository.Model.PostModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiRepository {
    @GET("/posts")
    suspend fun getData():List<PostModel>





}