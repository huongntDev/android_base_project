package com.example.myapplication.di
import com.example.myapplication.presentation.viewmodels.MarvelViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MarvelViewModel(get()) }
    single { createMarvelRepository(get()) }
}