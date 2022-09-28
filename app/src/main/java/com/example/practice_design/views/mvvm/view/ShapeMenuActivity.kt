package com.example.practice_design.views.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityShapeMenuBinding

class ShapeMenuActivity : AppCompatActivity() {
    lateinit var binding:ActivityShapeMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShapeMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}