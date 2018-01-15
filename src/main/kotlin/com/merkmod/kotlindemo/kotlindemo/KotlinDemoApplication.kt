package com.merkmod.kotlindemo.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDemoApplication

fun main(args: Array<String>) {
    //startKoin(null)
    runApplication<KotlinDemoApplication>(*args)
}
