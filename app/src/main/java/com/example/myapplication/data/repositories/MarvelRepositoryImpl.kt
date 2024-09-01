package com.example.myapplication.data.repositories

import com.example.myapplication.data.apis.core.MarvelApiService
import com.example.myapplication.data.apis.core.Result
import com.example.myapplication.data.apis.safeApiCall
import com.example.myapplication.data.models.MarvelCharacterResponse
import com.example.myapplication.domain.repositories.MarvelRepository

class MarvelRepositoryImpl(
    private val marvelApiService: MarvelApiService
) : MarvelRepository {
    override suspend fun getCharacters(
        apiKey: String,
        timestamp: String,
        hash: String
    ): Result<MarvelCharacterResponse> {
        return safeApiCall {
            marvelApiService.getCharacters(
                apiKey, timestamp, hash
            )
        }

    }
}