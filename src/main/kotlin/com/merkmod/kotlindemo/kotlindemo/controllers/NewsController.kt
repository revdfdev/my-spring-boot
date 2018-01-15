package com.merkmod.kotlindemo.kotlindemo.controllers

import com.merkmod.kotlindemo.kotlindemo.models.Articles
import com.merkmod.kotlindemo.kotlindemo.services.SamacharService
import com.merkmod.kotlindemo.kotlindemo.utils.apiKey
import org.funktionale.option.Option
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class NewsController : KoinComponent {

    val samacharService: SamacharService by inject()

    @GetMapping("/test")
    fun headlines():ResponseEntity<Articles> {
        val call = samacharService.topHeadlinesFromCountries("us", apiKey)
        val response = call.execute()
        return if (response.isSuccessful) {
            ResponseEntity.ok(response.body())
        } else {
            ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(response.body())
        }
    }
}