package org.bjtu.cms.bjtucms.service

import org.bjtu.cms.bjtucms.dao.Traveler
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
interface TravelerService {

    fun save(traveler: Traveler): Traveler

    fun getTravelerById(id: String): Traveler?

    fun getAllTravelers(): List<Traveler>

    fun getTravelersByBirthYearRange(from: Int, to: Int): List<Traveler>
    fun getTravelersByMileRange(from: Int, to: Int): List<Traveler>
    fun getTravelersByTimeRange(from: Int, to: Int): List<Traveler>
}
