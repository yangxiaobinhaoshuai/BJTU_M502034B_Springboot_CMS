package org.bjtu.cms.bjtucms.controller

import org.bjtu.cms.bjtucms.service.TravelerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TravelerController {

    @Autowired
    lateinit var travelerService: TravelerService

    @GetMapping("/traveler")
    fun hello(): String {
        val t = travelerService.getTravelerById("1")
        return "hello world traveler controller, $t"
    }


}