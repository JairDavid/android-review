package com.example.practice_design.views.calculatorMVP.view

interface ICalculatorActivity {
    fun showResult(result: String)
    fun showError(error: String)
}