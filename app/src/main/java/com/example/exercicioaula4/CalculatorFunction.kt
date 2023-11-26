package com.example.exercicioaula4

class CalculatorFunction {
}

fun main(){
    val resultadoSoma = calculadora(3, 4, ::soma)
    println("Resultado da soma: $resultadoSoma")

    val resultadoMultiplicacao = calculadora(3, 4, ::multiplicacao)
    println("Resultado da multiplicação: $resultadoMultiplicacao")
}

fun soma(a: Int, b: Int): Int { return a + b }
fun multiplicacao(a: Int, b: Int): Int {return a * b}

fun calculadora(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
  return operation(num1, num2)

}

