package com.example.exercicioaula4

class sumFunction {
}

fun main(){
    val soma = { number1: Int, number2: Int -> number1 + number2 }
    println(soma(7,2))
}