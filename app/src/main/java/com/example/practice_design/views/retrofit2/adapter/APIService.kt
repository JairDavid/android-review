package com.example.practice_design.views.retrofit2.adapter

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET
    suspend fun getAllUsers(@Url url:String):Response<List<User>>

}