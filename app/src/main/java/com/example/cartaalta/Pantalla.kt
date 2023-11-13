package com.example.cartaalta

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
@Preview
@Composable
fun Juego(){

    val context = LocalContext.current
    var dorsoCarta by rememberSaveable { mutableStateOf("detras") }
    var idCarta by rememberSaveable { mutableStateOf(context.resources.getIdentifier(dorsoCarta, "drawable", context.packageName)) }



    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Image(
                painter = painterResource(id = idCarta) , contentDescription = "")
        }
        Row {
            Button(onClick = {
                val carta = Baraja.dameCarta()
                //dorsoCarta = "${carta.palo.toString()[0].lowercase()}${carta.idDrawable}"
                dorsoCarta = "c${carta.idDrawable}"
                println("$carta || $dorsoCarta")

            }) {
                Text(text = "Dame carta")
            }
        }
        Row {
            Button(onClick = {  }) {
                Text(text = "Reiniciar")
            }
        }
        LaunchedEffect(dorsoCarta) {
            val id = context.resources.getIdentifier(dorsoCarta, "drawable", context.packageName)
            idCarta = id
        }
    }
}