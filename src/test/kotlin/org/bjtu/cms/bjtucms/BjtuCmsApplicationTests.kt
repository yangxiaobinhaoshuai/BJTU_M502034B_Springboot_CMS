package org.bjtu.cms.bjtucms

import org.bjtu.cms.bjtucms.dao.Traveler
import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BjtuCmsApplicationTests {

    @Autowired
    lateinit var travelerRepo: TravelerRepo

    @Test
    fun contextLoads() {
        val traveler = Traveler()
    }

}
