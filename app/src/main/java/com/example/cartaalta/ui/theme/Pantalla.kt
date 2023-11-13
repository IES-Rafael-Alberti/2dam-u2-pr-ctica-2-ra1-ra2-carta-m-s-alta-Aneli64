package com.example.cartaalta.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Juego(){
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            //Image(painter = (painterResource(id = R.id)), contentDescription = )
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Dame carta")
            }
        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Reiniciar")
            }
        }
    }
}