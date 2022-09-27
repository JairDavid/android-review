package com.example.practice_design.views.calculatorMVP.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practice_design.MainMenuActivity
import com.example.practice_design.databinding.ActivityCalculatorBinding
import com.example.practice_design.views.calculatorMVP.presenter.CalculatorPresenter

class CalculatorActivity : AppCompatActivity(), ICalculatorActivity {
    lateinit var binding:ActivityCalculatorBinding
    lateinit var presenter:CalculatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = CalculatorPresenter(this)

        binding.sumBtn.setOnClickListener {
            presenter.suma(binding.n1Input.text.toString(), binding.n2Input.text.toString())
        }

        binding.multiplyBtn.setOnClickListener {
            presenter.multiplicacion(binding.n1Input.text.toString(), binding.n2Input.text.toString())
        }

        binding.divBtn.setOnClickListener {
            presenter.division(binding.n1Input.text.toString(), binding.n2Input.text.toString())
        }

        binding.backMenuBtn.setOnClickListener {
            startActivity(Intent(this, MainMenuActivity::class.java))
            finish()
        }
    }

    override fun showResult(result: String) {
        binding.resultOP.text = result
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}