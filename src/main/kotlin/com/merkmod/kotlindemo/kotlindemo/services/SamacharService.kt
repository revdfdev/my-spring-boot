package com.merkmod.kotlindemo.kotlindemo.services

import com.merkmod.kotlindemo.kotlindemo.models.Articles
import com.merkmod.kotlindemo.kotlindemo.models.ErrorHandler
import kotlinx.coroutines.experimental.Deferred
import org.funktionale.either.Either
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SamacharService {

    @GET("top-headlines")
    fun topHeadlinesFromCountries(@Query("country") country: String, @Query("apiKey") apiKey: String): Call<Articles>

    @GET("top-headlines")
    fun topHeadlinesFromQuery(@Query("q") query: String, @Query("apiKey") apiKey: String): Deferred<Either<Articles, ErrorHandler>>

    @GET("top-headlines")
    fun topHeadlinesFromCountryCategory(@Query("country") country: String, @Query("category") category: String, apiKey: String): Deferred<Either<Articles, ErrorHandler>>

    @GET("top-headlines")
    fun topHeadlinesFromCategory(@Query("category") category: String, @Query("apiKey") apiKey: String): Deferred<Either<Articles, ErrorHandler>>
}