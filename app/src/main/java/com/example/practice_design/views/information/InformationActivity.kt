package com.example.practice_design.views.information

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.contact.ContactListActivity
import com.example.practice_design.customContact.CustomContactListActivity
import com.example.practice_design.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {
    lateinit var binding: ActivityInformationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.card1.setOnClickListener {
            startActivity(Intent(this, FormDataActivity::class.java))
            finish()
        }

        binding.card2.setOnClickListener {
            startActivity(Intent(this, ContactListActivity::class.java))
        }

        binding.card3.setOnClickListener {
            startActivity(Intent(this, CustomContactListActivity::class.java))
        }

    }
}