package com.example.practice_design.views.retrofit2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityMenuRestBinding
import com.example.practice_design.views.retrofit2.view.RetrofitViewActivity

class MenuRestActivity : AppCompatActivity() {
    lateinit var binding:ActivityMenuRestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuRestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listRestBtn.setOnClickListener {
            startActivity(Intent(this, RetrofitViewActivity::class.java))
        }

    }
}