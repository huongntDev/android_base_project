package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.ui.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Comic

@Serializable
object Series

@Serializable
object Profile

@Serializable
object Character

@Serializable
data class CharacterDetail(val id: String)

@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier) {
    NavHost(navController = navController, startDestination = Home) {
        characterGraph(navController)

        composable<Home> {
            HomeScreen(DestinationRoute.HOME) {
                navController.navigate(Character)
            }
        }

        composable<Comic> {
            HomeScreen(DestinationRoute.COMIC) {

            }
        }

        composable<Series> {
            HomeScreen(DestinationRoute.SERIES) {

            }
        }

        composable<Profile> {
            HomeScreen(DestinationRoute.PROFILE) {

            }
        }
    }
}