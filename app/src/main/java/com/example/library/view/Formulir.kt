package com.example.library.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color


@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier= Modifier,
        topBar= {
            TopAppBar(
                title = {Text(text=stringResource(id= R.string.home),
                    color = Color.White)}
            )
        }
        )
}