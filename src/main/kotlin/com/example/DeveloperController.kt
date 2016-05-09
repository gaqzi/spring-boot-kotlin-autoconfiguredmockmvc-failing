package com.example

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(name = "developers", path = arrayOf("/api/v1/developers"))
class DeveloperController {

    @PostMapping
    fun create(@RequestParam params: Map<String, String>): Map<String, String> {
        return params
    }
}
