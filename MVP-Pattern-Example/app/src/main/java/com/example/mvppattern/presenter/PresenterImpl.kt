package com.example.mvppattern.presenter

import com.example.mvppattern.model.Count

class PresenterImpl(private val view: Presenter.View) : Presenter.Data {

    val count: Count = Count()

    override fun increase() {
        view.show(count.increase())
    }

    override fun discrease() {
        view.show(count.discrease())
    }
}