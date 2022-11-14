package com.example.testcompose

import com.example.testcompose.Repository.ApiInstance
import com.example.testcompose.Repository.Model.PostModel
import retrofit2.HttpException

class ApiClass {

    suspend fun callApi():List<PostModel>{
        try {
return ApiInstance.instance.getData()
        }catch (
            e:HttpException
        ){
throw  Exception("error")
        }
    }
}