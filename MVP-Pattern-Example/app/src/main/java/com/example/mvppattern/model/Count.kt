package com.example.mvppattern.model

class Count {
    var count = 0

    fun increase(): Int{
        ++count
        return count
    }

    fun discrease(): Int{
        --count
        if(count < 0)
            count = 0
        return count
    }
}