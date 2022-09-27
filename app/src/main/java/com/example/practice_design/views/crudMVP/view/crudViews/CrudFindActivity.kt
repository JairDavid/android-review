package com.example.practice_design.views.crudMVP.view.crudViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityCrudFindBinding

class CrudFindActivity : AppCompatActivity() {
    lateinit var binding:ActivityCrudFindBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrudFindBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}