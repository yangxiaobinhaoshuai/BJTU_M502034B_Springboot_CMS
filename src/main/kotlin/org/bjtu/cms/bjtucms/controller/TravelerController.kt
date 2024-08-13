package org.bjtu.cms.bjtucms.controller

import org.bjtu.cms.bjtucms.dao.Traveler
import org.bjtu.cms.bjtucms.service.TravelerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
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


    /**
     * http://localhost:8080/traveler/birth_year_range?from=1990&to=2004
     */
    @GetMapping("/traveler/birth_year_range")
    fun getTravelersByBirthYearRange(@RequestParam("from") from: Int, @RequestParam("to") to: Int): List<Traveler> {
        return travelerService.getTravelersByBirthYearRange(from, to)
    }

    /**
     * http://localhost:8080/traveler/mile_range?from=1284&to=14505
     */
    @GetMapping("/traveler/mile_range")
    fun getTravelersByMileRange(@RequestParam("from") from: Int, @RequestParam("to") to: Int): List<Traveler> {
        return travelerService.getTravelersByMileRange(from, to)
    }

    /**
     * http://localhost:8080/traveler/mile_range?from=2&to=63
     */
    @GetMapping("/traveler/time_range")
    fun getTravelersByTimeRange(@RequestParam("from") from: Int, @RequestParam("to") to: Int): List<Traveler> {
        return travelerService.getTravelersByTimeRange(from, to)
    }

    // For Testing
    fun getTravelerById(id: String): Traveler? {
        return travelerService.getTravelerById(id)
    }

    /**
     * http://localhost:8080/traveler/all
     */
    @GetMapping("/traveler/all")
    fun getAllTravelers(): List<Traveler> {
        return travelerService.getAllTravelers()
    }
}
