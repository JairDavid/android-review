package com.example.practice_design.views.retrofit2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityRegisterRestBinding

class RegisterRestActivity : AppCompatActivity() {
    lateinit var binding:ActivityRegisterRestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterRestBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}