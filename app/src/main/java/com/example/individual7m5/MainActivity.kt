package com.example.individual7m5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.individual7m5.components.TextName
import com.example.individual7m5.components.TextoUno
import com.example.individual7m5.components.botonImageText
import com.example.individual7m5.components.showImages

import com.example.individual7m5.ui.theme.Individual7M5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Individual7M5Theme(
            ) {
                Content()

            }


        }
    }
}

@Composable
fun Content() {
    val visible = remember { mutableStateOf(true)

    }
    Box(modifier=Modifier.fillMaxSize()) {
        showImages(visible)
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextoUno()
        Space()
        TextName()
        Space()
        botonImageText(visible)
        Space()


    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}