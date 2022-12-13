package com.example.practice_design.views.crudMVVM.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityRegistermvvmBinding

class RegistermvvmActivity : AppCompatActivity() {
    lateinit var binding:ActivityRegistermvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistermvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}