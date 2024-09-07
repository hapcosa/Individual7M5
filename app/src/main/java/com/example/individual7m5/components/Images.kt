package com.example.individual7m5.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.individual7m5.R

@Composable
fun showImage(visible: MutableState<Boolean>){
    if(visible.value){
        Image(
            painterResource(id = R.drawable.th_3598437966),
            contentDescription = "imagen",
            modifier = Modifier
                .fillMaxSize()
        )
    }
}