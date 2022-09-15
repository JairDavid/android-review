package com.example.practice_design.views.information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.databinding.ActivityFormDataBinding
import com.example.practice_design.domain.Person

class FormDataActivity : AppCompatActivity() {
    lateinit var binding: ActivityFormDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {
            startActivity(
                Intent(this, ViewInfoActivity::class.java)
                    .putExtra(
                        "personalInformation",
                        Person(
                            binding.nameInput.text.toString(),
                            binding.lastnameInput.text.toString(),
                            binding.addressInput.text.toString(),
                            binding.zipInput.text.toString(),
                            "xd"
                        )
                    )
            )
            finish()
        }
    }
}