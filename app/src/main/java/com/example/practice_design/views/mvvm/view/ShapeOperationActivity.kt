package com.example.practice_design.views.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityShapeOperationBinding

class ShapeOperationActivity : AppCompatActivity() {
    lateinit var binding:ActivityShapeOperationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShapeOperationBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}