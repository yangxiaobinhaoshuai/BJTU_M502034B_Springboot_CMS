package org.bjtu.cms.bjtucms.service

import jakarta.annotation.PostConstruct
import org.bjtu.cms.bjtucms.dao.Traveler
import org.bjtu.cms.bjtucms.log.MyLogger
import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.bjtu.cms.bjtucms.saveEmployeesFromTxtFile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TravelerServiceImpl : TravelerService {

    init {
        MyLogger.i("TravelerServiceImpl initialized.")
    }

    @Autowired
    lateinit var repo: TravelerRepo

    @PostConstruct
    fun afterConstruct() {
        MyLogger.i("TravelerServiceImpl afterConstruct, repo:$repo.")
        if (repo.count() == 0L) {
            MyLogger.i("Prepare to insert data into database.")
            saveEmployeesFromTxtFile { repo.save(it) }
        } else {
            MyLogger.i("Database is already initialized.")
        }
    }

    override fun save(traveler: Traveler): Traveler {
        return repo.save(traveler)
    }

    override fun getTravelerById(id: String): Traveler? {
        return repo.getTravelerById(id)
    }

    override fun getAllTravelers(): List<Traveler> {
        return repo.findAll()
    }

    override fun getTravelersByBirthYearRange(from: Int, to: Int): List<Traveler> {
        return repo.findByBirthYearBetween(from, to)
    }

    override fun getTravelersByMileRange(from: Int, to: Int): List<Traveler> {
        return repo.findByTotalTravelMilesBetween(from, to)
    }

    override fun getTravelersByTimeRange(from: Int, to: Int): List<Traveler> {
        return repo.findByTotalTravelTimeBetween(from, to)
    }
}
