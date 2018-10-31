package br.com.bicmsystems.mongoapi.controller

import br.com.bicmsystems.mongoapi.model.StatusApi
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/status")
@CrossOrigin("*", maxAge = 3600)
class CheckStatusController {

    @GetMapping
    fun checkIsOnline() : StatusApi {
        return StatusApi("OK")
    }

}