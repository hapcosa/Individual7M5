package com.example.individual7m5.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.individual7m5.MainActivity
import com.example.individual7m5.R
import com.example.individual7m5.images
import com.example.individual7m5.imagesId


@Composable
fun showImages(visible: MutableState<Boolean>){
    val imageList = images.imagesList

    if(visible.value){
      LazyColumn(modifier = Modifier.fillMaxSize(),
              horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center){
        items(imageList){
            Image(painterResource(id = it.id), contentDescription = "lista fotos",
                modifier = Modifier.fillMaxSize())
        }
      }
    }
}