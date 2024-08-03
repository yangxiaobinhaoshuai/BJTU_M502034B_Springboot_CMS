package org.bjtu.cms.bjtucms

import org.bjtu.cms.bjtucms.log.MyLogger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BjtuCmsApplication

fun main(args: Array<String>) {
    runApplication<BjtuCmsApplication>(*args)
    MyLogger.i("After runApplication.")
}

