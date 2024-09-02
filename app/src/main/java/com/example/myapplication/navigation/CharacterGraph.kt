package com.example.myapplication.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.myapplication.ui.CharacterDetailScreen
import com.example.myapplication.ui.CharacterListScreen

fun NavGraphBuilder.characterGraph(navController: NavHostController) {
    composable<Character> {
        CharacterListScreen(
            onNavigateDetail = {
                navController.navigate(CharacterDetail("123"))
            }
        )
    }
    composable<CharacterDetail> { backStackEntry ->
        val character = backStackEntry.toRoute<CharacterDetail>()
        CharacterDetailScreen(
            id = character.id,
            onNavigateUp = { navController.navigateUp() }
        )
    }
}