package com.example.practice_design.views.calculatorMVP.presenter

import com.example.practice_design.views.calculatorMVP.interactor.CalculatorInteractor
import com.example.practice_design.views.calculatorMVP.view.CalculatorActivity
import com.example.practice_design.views.calculatorMVP.view.ICalculatorActivity

class CalculatorPresenter(private val view:CalculatorActivity): ICalculatorPresenter {
    val interactor = CalculatorInteractor(this)

    override fun suma(n1: String, n2: String) {
        interactor.suma(n1,n2)
    }

    override fun multiplicacion(n1: String, n2: String) {
        interactor.multiplicacion(n1,n2)
    }

    override fun division(n1: String, n2: String) {
        interactor.division(n1,n2)
    }


    override fun showResult(result: String) {
        view.showResult(result)
    }

    override fun showError(error: String) {
        view.showResult(error)
    }
}