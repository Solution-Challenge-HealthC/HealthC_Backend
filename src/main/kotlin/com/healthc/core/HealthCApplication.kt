package com.healthc.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HealthCApplication

fun main(args: Array<String>) {
    runApplication<HealthCApplication>(*args)
}
