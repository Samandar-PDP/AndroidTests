package com.sdk.androidtests

abstract class Calculator {
    abstract fun add(a: Int, b: Int): Int
    abstract fun mul(a: Int, b: Int): Int
    abstract fun div(a: Int, b: Int): Int
    abstract fun sub(a: Int, b: Int): Int
}

class CalculatorImpl : Calculator() {
    override fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun mul(a: Int, b: Int): Int {
        return a * b
    }

    override fun div(a: Int, b: Int): Int {
        return if (a == 0 || b == 0)
            0
        else if (a > b)
            a / b
        else
            b / a
    }

    override fun sub(a: Int, b: Int): Int {
        return a - b
    }
}
