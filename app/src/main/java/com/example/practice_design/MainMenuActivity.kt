package com.example.practice_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practice_design.views.simpleList.ContactListActivity
import com.example.practice_design.views.customList.CustomContactListActivity
import com.example.practice_design.databinding.ActivityMainMenuBinding
import com.example.practice_design.views.calculatorMVP.view.CalculatorActivity
import com.example.practice_design.views.simpleForm.SimpleFormActivity
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.card1.setOnClickListener {
            startActivity(Intent(this, SimpleFormActivity::class.java))
            finish()
        }

        binding.card2.setOnClickListener {
            startActivity(Intent(this, ContactListActivity::class.java))
            finish()
        }

        binding.card3.setOnClickListener {
            startActivity(Intent(this, CustomContactListActivity::class.java))
            finish()
        }

        card4.setOnClickListener{
            startActivity(Intent(this, CalculatorActivity::class.java))
            finish()
        }

    }
}