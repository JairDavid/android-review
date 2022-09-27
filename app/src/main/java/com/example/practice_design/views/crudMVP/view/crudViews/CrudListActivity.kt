package com.example.practice_design.views.crudMVP.view.crudViews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityCrudListBinding

class CrudListActivity : AppCompatActivity() {
    lateinit var binding:ActivityCrudListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityCrudListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}