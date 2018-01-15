package com.merkmod.kotlindemo.kotlindemo.dependencyinjections

import com.merkmod.kotlindemo.kotlindemo.services.SamacharService
import com.merkmod.kotlindemo.kotlindemo.utils.baseUrl
import org.koin.dsl.module.applicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun samacharModule() = listOf(serviceModule)

val serviceModule = applicationContext {
    provide { createWebService() }
}


fun createWebService(): SamacharService = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(SamacharService::class.java)