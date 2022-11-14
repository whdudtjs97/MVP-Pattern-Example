package com.example.mvppattern.presenter

interface Presenter {
    interface View{
        fun show(data : Int)
    }
    interface Data{
        fun increase()
        fun discrease()
    }
}