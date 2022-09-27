package com.example.practice_design.views.simpleForm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.MainMenuActivity
import com.example.practice_design.databinding.ActivityFormDataBinding
import com.example.practice_design.domain.Person

class SimpleFormActivity : AppCompatActivity() {
    lateinit var binding: ActivityFormDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {
            startActivity(
                Intent(this, SeeInfoFormActivity::class.java)
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
        binding.buttonback.setOnClickListener{
            startActivity(Intent(this, MainMenuActivity::class.java))
            finish()
        }
    }
}