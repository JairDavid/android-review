package com.example.practice_design.views.crudMVVM.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityListmvvmBinding

class ListmvvmActivity : AppCompatActivity() {
    lateinit var binding:ActivityListmvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListmvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}