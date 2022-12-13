package com.example.practice_design.views.crudMVVM.view.service

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    var retrofit:Retrofit? = null

    fun GetInstance (url:String): Retrofit? {
        if (retrofit == null){
            var gson = GsonBuilder().setLenient().serializeNulls().create()
            var httpInterceptor = HttpLoggingInterceptor()
            httpInterceptor.level = HttpLoggingInterceptor.Level.BODY

            var instance = OkHttpClient.Builder().addInterceptor(httpInterceptor).build()

            retrofit = Retrofit.Builder()
                .baseUrl(url)
                .client(instance)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
        }
        return retrofit
    }
}