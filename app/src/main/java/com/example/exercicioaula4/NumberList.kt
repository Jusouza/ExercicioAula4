package com.example.exercicioaula4

class NumberList {
}

fun main(){
    var numberList : MutableList<Int> = mutableListOf()
    val numberListFiltered = numberList.filter{it % 2 == 0}

    for (i in 1..99){
        numberList.add(i)
    }

    println(numberListFiltered)
}