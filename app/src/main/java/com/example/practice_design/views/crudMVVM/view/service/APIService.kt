package com.example.practice_design.views.crudMVVM.view.service

import com.example.practice_design.views.crudMVVM.model.User
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getAllUsers(@Url url:String):Response<List<User>>

    @GET
    suspend fun getUserById(@Url url: String):Response<User>

    @POST
    suspend fun saveUser(@Url url: String,@Header("Authorization") token:String, user:User):Response<User>

    @PUT
    suspend fun updateUser(@Url url: String):Response<User>

    @DELETE
    suspend fun deleteUser(@Url url: String):Response<User>
}

object ApiUtils{
    var urlBase = "https://gorest.co.in/public/v2/"
    val apiService: APIService
    get() = RetrofitInstance.GetInstance(urlBase)!!.create(APIService::class.java)
}