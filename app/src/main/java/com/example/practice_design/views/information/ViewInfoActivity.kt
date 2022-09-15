package com.example.practice_design.views.information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.practice_design.databinding.ActivityViewInfoBinding
import com.example.practice_design.domain.Person

class ViewInfoActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var personalInfo = intent.getSerializableExtra("personalInformation") as Person
        binding.personalInfo = personalInfo

        Handler(Looper.getMainLooper()).postDelayed({
            Toast.makeText(this, "Redirecting...", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, InformationActivity::class.java))
            finish()
        }, 2000)
    }
}