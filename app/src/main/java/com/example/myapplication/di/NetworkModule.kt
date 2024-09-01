package com.example.myapplication.di

import com.example.myapplication.data.apis.core.MarvelApiService
import com.example.myapplication.data.repositories.MarvelRepositoryImpl
import com.example.myapplication.domain.repositories.MarvelRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

private const val TIME_OUT = 30L

val networkModule = module {

    single { createService(get()) }

    single { createRetrofit(get()) }

    single { createOkHttpClient() }

}

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
    return OkHttpClient.Builder()
        .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
        .readTimeout(TIME_OUT, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor).build()
}

fun createRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun createService(retrofit: Retrofit): MarvelApiService {
    return retrofit.create(MarvelApiService::class.java)
}

fun createMarvelRepository(apiService: MarvelApiService): MarvelRepository {
    return MarvelRepositoryImpl(apiService)
}
