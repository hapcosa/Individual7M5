package com.example.individual7m5.components


import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle


import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants

@Composable
fun TextName(){
    Text(text = "Hernan Paredes",
        fontSize = 35.sp,
    fontStyle = FontStyle.Italic)
}
@Composable
fun TextoUno(){
        Text(
            text="Bienvenido",
            fontSize = 30.sp
        )
}
