package com.mastercode.jokenpo.controller

import com.mastercode.jokenpo.domain.JokenpoRequest
import com.mastercode.jokenpo.domain.JokenpoResponse
import com.mastercode.jokenpo.service.JokenpoService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/jokenpo")
class JokenpoController(
    private val jokenpoService: JokenpoService
) {

    @PostMapping
    fun play(@RequestBody request: JokenpoRequest): JokenpoResponse {
        return jokenpoService.play(request.move)
    }
}