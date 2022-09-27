package com.example.practice_design.views.customList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityItemContactBinding
import com.example.practice_design.domain.Person

class ItemContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityItemContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityItemContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var person = intent.getSerializableExtra("person") as Person
        binding.person = person

    }
}