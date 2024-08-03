package org.bjtu.cms.bjtucms.service

import org.bjtu.cms.bjtucms.dao.Traveler
import org.springframework.stereotype.Service

@Service
interface TravelerService {

    fun save(traveler: Traveler): Traveler

    fun getTravelerById(id: String): Traveler?
}