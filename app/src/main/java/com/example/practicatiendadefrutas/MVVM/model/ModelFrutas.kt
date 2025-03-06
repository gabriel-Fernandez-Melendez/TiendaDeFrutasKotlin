package com.example.practicatiendadefrutas.MVVM.model


//metemos en esta clase los campos con los cuales va a contas las frutas , en mi caso una imagen un nombre y un precio
data class ModelFrutas(
    var nombre:String,
    var imagen:Int,
    var precio:Float, //si esto da problemas podemos cambiarlo a double
)
