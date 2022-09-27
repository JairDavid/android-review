package com.example.practice_design.views.crudMVP.view.crudViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityCrudDeleteBinding

class CrudDeleteActivity : AppCompatActivity() {
    lateinit var binding:ActivityCrudDeleteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}