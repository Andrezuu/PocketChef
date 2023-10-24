package com.example.popipa.dataClases

data class TipoDePlato(
    val titulo: String,
    val descripcion: String,
    val imagen: Int,
    val tiempoDePreparacion: String,
    val dificultad: Int, //1 facil , 2 media,3 dificil
    var Megusta :Boolean
)
