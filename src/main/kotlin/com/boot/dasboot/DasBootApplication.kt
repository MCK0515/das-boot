package com.boot.dasboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DasBootApplication

fun main(args: Array<String>) {
    runApplication<DasBootApplication>(*args)
}
