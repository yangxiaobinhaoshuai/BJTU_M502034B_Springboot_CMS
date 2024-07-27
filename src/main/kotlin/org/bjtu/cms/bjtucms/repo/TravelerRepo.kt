package org.bjtu.cms.bjtucms.repo

import org.bjtu.cms.bjtucms.Traveler
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface TravelerRepo : JpaRepository<Traveler, Long> {

    fun getTravelerById(id: Long): Optional<Traveler>
}