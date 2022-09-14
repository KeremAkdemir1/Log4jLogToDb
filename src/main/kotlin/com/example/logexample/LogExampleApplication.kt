package com.example.logexample

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class LogExampleApplication()

fun main(args: Array<String>) {


    runApplication<LogExampleApplication>(*args)
}
