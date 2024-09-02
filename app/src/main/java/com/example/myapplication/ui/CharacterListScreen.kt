package com.example.myapplication.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CharacterListScreen(onNavigateDetail: () -> Unit) {
    Text(text = "Go to Character Detail", modifier = Modifier.padding(top = 100.dp).clickable {
       onNavigateDetail()
    })
}