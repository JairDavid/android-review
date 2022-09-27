package com.example.practice_design.views.calculatorMVP.presenter

interface ICalculatorPresenter {

    fun suma(n1:String, n2:String)
    fun multiplicacion(n1:String, n2:String)
    fun division(n1:String, n2:String)

    fun showResult(result: String)
    fun showError(error: String)
}