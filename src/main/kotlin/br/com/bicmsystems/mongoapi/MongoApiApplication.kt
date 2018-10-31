package br.com.bicmsystems.mongoapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongoApiApplication

fun main(args: Array<String>) {
    runApplication<MongoApiApplication>(*args)
}
