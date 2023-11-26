package com.example.exercicioaula4

class StringList {
}

fun main(){
    val listName = listOf("Juliana", "Diego", "Marcia", "Rosi")

    listName.map {
        "Olá $it"
    }.forEach{
        println(it)
    }
}