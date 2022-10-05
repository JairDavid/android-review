package com.example.practice_design.views.retrofit2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practice_design.databinding.ActivityRetrofitViewBinding
import com.example.practice_design.views.retrofit2.adapter.APIService
import com.example.practice_design.views.retrofit2.adapter.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitViewActivity : AppCompatActivity() {
    lateinit var binding:ActivityRetrofitViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityRetrofitViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getAllUsersRequest()
    }

    private fun RetrofitService():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun getAllUsersRequest(){
        CoroutineScope(Dispatchers.IO).launch {
            val call: Response<List<User>> = RetrofitService().create(APIService::class.java).getAllUsers("users")
            val users:List<User>? = call.body()
            runOnUiThread {
                if (call.isSuccessful){
                    println(users.toString())
                }else{
                    Toast.makeText(applicationContext, "Ocurrio un error extraño...", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


}