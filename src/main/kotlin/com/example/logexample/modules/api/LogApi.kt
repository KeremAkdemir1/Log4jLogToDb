package com.example.logexample.modules.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController



@RestController
@RequestMapping("/log")
class LogApi(val logger: org.apache.log4j.Logger = org.apache.log4j.Logger.getLogger("LogApi")) {





    @GetMapping
    public fun getLogs() : String {

        logger.info("Logs Get")
        return "Mesaj"
    }

}