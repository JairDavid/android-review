package com.example.practice_design.views.retrofit2.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice_design.databinding.ActivityDetailRestBinding
import com.example.practice_design.views.retrofit2.MenuRestActivity
import com.example.practice_design.views.retrofit2.adapter.APIService
import com.example.practice_design.views.retrofit2.adapter.User
import com.example.practice_design.views.retrofit2.adapter.UserAdapter
import kotlinx.coroutines.launch
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetailRestActivity : AppCompatActivity() {
    lateinit var binding:ActivityDetailRestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch{
            var id = intent.getStringExtra("id")
            val call: Response<User> = RetrofitService().create(APIService::class.java).getUserById("users/${id}")
            runOnUiThread {
                if (call.isSuccessful){
                    binding.restName.text = call.body()?.name.toString()
                    binding.restEmail.text = call.body()?.email.toString()
                    binding.restGender.text = call.body()?.gender.toString()
                    binding.restStatus.text = call.body()?.status.toString()
                }else{
                    Toast.makeText(applicationContext, "Ocurrio un error: ${call.errorBody()}", Toast.LENGTH_SHORT).show()
                }
            }
        }


        binding.restBackBtn.setOnClickListener {
            startActivity(Intent(this, MenuRestActivity::class.java))
        }

    }

    private fun RetrofitService():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/public/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}