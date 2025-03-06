package com.example.practicatiendadefrutas.MVVM.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicatiendadefrutas.MVVM.model.ModelFrutas
import com.example.practicatiendadefrutas.R

class ViewModelFrutas: ViewModel() {


    private  val _operacion = MutableLiveData("")
    val operacion : LiveData<String> = _operacion

    private  val _resultado = MutableLiveData("")
    val resultado : LiveData<String> = _resultado

    fun ListaFrutas():List<ModelFrutas>{
        return listOf(
            ModelFrutas(nombre = "Manzanas", imagen = R.drawable.manzanas, precio = 1f),
            ModelFrutas(nombre = "Peras", imagen = R.drawable.peras, precio = 1.2f),
            ModelFrutas(nombre = "Fresas", imagen = R.drawable.fresas, precio = 1.4f),
            ModelFrutas(nombre = "Naranjas", imagen = R.drawable.naranjas, precio = 1.6f),
            ModelFrutas(nombre = "Kiwis", imagen = R.drawable.kiwi, precio = 1.8f),
            ModelFrutas(nombre = "Plátanos", imagen = R.drawable.pl_tano, precio = 2f),
            ModelFrutas(nombre = "Arándanos", imagen = R.drawable.arandanos, precio = 2.2f),
            ModelFrutas(nombre = "Granadas", imagen = R.drawable.granadas, precio = 2.4f),
            ModelFrutas(nombre = "Frambuesas", imagen = R.drawable.frambuesas, precio = 2.6f),
            ModelFrutas(nombre = "Melocotones", imagen = R.drawable.melocotones, precio = 2.8f),

            // Add more ModelFputas instances here if needed
        )
    }
}