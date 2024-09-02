package com.example.myapplication.navigation

import kotlinx.serialization.Serializable

object DestinationRoute {
    const val CHARACTER_GRAPH = "character_graph"
    const val CHARACTER = "character"
    const val CHARACTER_DETAIL = "character_detail"

    const val HOME = "home"
    const val COMIC = "comic"
    const val SERIES = "series"
    const val PROFILE = "profile"

    object Passedkey {
        const val CHARACTER_ID = "character_id"
    }
}


