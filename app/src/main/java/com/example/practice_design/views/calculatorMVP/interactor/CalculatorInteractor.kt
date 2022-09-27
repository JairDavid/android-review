package com.example.practice_design.views.calculatorMVP.interactor

import com.example.practice_design.views.calculatorMVP.presenter.CalculatorPresenter

class CalculatorInteractor(private val  presenter: CalculatorPresenter): ICalculatorInteractor {

    val expr = Regex("^[0-9]+$")

    override fun suma(n1: String, n2: String) {
        var total = 0
        if(n1.isNullOrEmpty() || n2.isNullOrEmpty()){
            presenter.showError("Necesita los dos numeros para hacer esto!!")
        }else if(n1.matches(regex = expr) ||n2.matches(regex = expr)){
            var n1Number:Int = n1.toInt()
            var n2Number:Int = n2.toInt()
            total = n1Number + n2Number
            presenter.showResult(total.toString())
        }else{
            presenter.showError("Necesita usar digitos")
        }

    }

    override fun multiplicacion(n1: String, n2: String) {
        var total = 0
        if(n1.isNullOrEmpty() || n2.isNullOrEmpty()){
            presenter.showError("Necesita los dos numeros para hacer esto!!")
        }else if(n1.matches(regex = expr) ||n2.matches(regex = expr)){
            var n1Number:Int = n1.toInt()
            var n2Number:Int = n2.toInt()
            total = n1Number * n2Number
            presenter.showResult(total.toString())
        } else{
            presenter.showError("Necesita usar digitos")
        }
    }

    override fun division(n1: String, n2: String) {
        var total = 0
        if(n1.isNullOrEmpty() || n2.isNullOrEmpty()){
            presenter.showError("Necesita los dos numeros para hacer esto!!")
        }else if(n1.matches(regex = expr) ||n2.matches(regex = expr)){
            var n1Number:Int = n1.toInt()
            var n2Number:Int = n2.toInt()
            total = n1Number / n2Number
            presenter.showResult(total.toString())
        } else{
            presenter.showError("Necesita usar digitos")
        }
    }

}