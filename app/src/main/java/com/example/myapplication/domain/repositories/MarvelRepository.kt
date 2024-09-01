package com.example.myapplication.domain.repositories

import com.example.myapplication.data.apis.core.Result
import com.example.myapplication.data.models.MarvelCharacterResponse


interface MarvelRepository {
    suspend fun getCharacters(
        apiKey: String,
        timestamp: String,
        hash: String
    ): Result<MarvelCharacterResponse>

}