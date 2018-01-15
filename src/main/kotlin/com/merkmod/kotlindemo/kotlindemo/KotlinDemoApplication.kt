package com.merkmod.kotlindemo.kotlindemo

import com.merkmod.kotlindemo.kotlindemo.dependencyinjections.samacharModule
import org.koin.standalone.StandAloneContext.startKoin
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
class KotlinDemoApplication


fun main(args: Array<String>) {
    runApplication<KotlinDemoApplication>(*args)
    startKoin(samacharModule())
}
