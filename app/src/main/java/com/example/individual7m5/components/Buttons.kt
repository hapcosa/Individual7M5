package com.example.individual7m5.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.individual7m5.R




@Composable
fun botonImageText(mostrar:MutableState<Boolean>){
    val bText = rememberUpdatedState(if(mostrar.value) "Ocultar" else "Mostrar")

    Button(onClick = { mostrar.value = !mostrar.value}) {
        Text(
            text=bText.value,
            fontSize=30.sp
        )
    }
}


