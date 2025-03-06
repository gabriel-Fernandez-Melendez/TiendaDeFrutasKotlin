package com.example.practicatiendadefrutas.MVVM.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicatiendadefrutas.MVVM.viewmodel.ViewModelFrutas

val viewModel: ViewModelFrutas = ViewModelFrutas()

@Composable
fun TiendaDeFrutas(modifier: Modifier=Modifier,viewModel: ViewModelFrutas){
Column (modifier = Modifier.fillMaxSize())
{
    LazyVerticalGrid(columns = GridCells.Fixed(2), content ={items(viewModel.ListaFrutas()){ fruta -> //esto hace que cada objeto de la lista itere y pase a ser fruta si se tiene que pasar por parametro
        Image(painter = painterResource(fruta.imagen ) ,
            contentDescription = "imagen de la fruta de la lista",
            modifier = Modifier.padding(20.dp)) } } )
    Divider(thickness = 1.dp, color = Color.Blue)
    Column(modifier = Modifier.fillMaxWidth().background(Color.Cyan)) {
        Text(text = "dfgesrgetbrs")
    }

}
}











@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviewLogin_Instagram() {
    TiendaDeFrutas(Modifier, viewModel )
}