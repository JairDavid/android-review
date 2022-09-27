package com.example.practice_design.views.crudMVP.view.crudViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityCrudCreateBinding

class CrudCreateActivity : AppCompatActivity() {
    lateinit var binding:ActivityCrudCreateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}