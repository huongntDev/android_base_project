package com.example.myapplication.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.domain.repositories.MarvelRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MarvelViewModel(
    private val repository: MarvelRepository
) : ViewModel() {

    fun getCharacters(apiKey: String, timeStamp: String, hash: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getCharacters(
                apiKey, timeStamp, hash
            )
            Log.e("MarvelViewModel", "GET $response ")
        }
    }

}