package com.example.exercicioaula4

class CompactFunction {
}

fun main(){
    val multiplicacao = { number1: Int, number2: Int -> number1 * number2 }
    println(multiplicacao(4,2))
}
