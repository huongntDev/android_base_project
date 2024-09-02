package com.example.myapplication.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun CharacterDetailScreen(onNavigateUp: () -> Unit, id: String) {
    Text(text = "Go back Character $id", modifier = Modifier.padding(top = 100.dp).clickable {
        onNavigateUp()
    })
}