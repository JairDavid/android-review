package com.example.practice_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.practice_design.databinding.ActivityMainBinding
import com.example.practice_design.views.information.InformationActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        launchApp()
    }

    fun launchApp(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, InformationActivity::class.java))
            finish()
        },500)
    }
}