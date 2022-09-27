package com.example.practice_design.views.crudMVP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityCrudMenuBinding

class CrudMenuActivity : AppCompatActivity() {
    lateinit var binding:ActivityCrudMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}