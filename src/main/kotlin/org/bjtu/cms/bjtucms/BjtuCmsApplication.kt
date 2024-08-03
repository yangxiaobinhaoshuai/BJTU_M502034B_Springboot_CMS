package org.bjtu.cms.bjtucms

import org.bjtu.cms.bjtucms.log.MyLogger
import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BjtuCmsApplication{
    @Autowired
    lateinit var repo: TravelerRepo
    companion object {

    }
}

fun main(args: Array<String>) {
    runApplication<BjtuCmsApplication>(*args)
    MyLogger.i("After runApplication.")
}

