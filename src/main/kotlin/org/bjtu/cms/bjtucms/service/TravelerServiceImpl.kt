package org.bjtu.cms.bjtucms.service

import org.bjtu.cms.bjtucms.dao.Traveler
import org.bjtu.cms.bjtucms.log.MyLogger
import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TravelerServiceImpl : TravelerService {

    init {
        MyLogger.i("TravelerServiceImpl initialized.")
    }

    @Autowired
    lateinit var repo: TravelerRepo

    override fun save(traveler: Traveler): Traveler {
        return repo.save(traveler)
    }

    override fun getTravelerById(id: String): Traveler? {
        return repo.getTravelerById(id)
    }
}