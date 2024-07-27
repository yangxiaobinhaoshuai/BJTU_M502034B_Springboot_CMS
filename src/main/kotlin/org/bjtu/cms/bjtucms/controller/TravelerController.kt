package org.bjtu.cms.bjtucms.controller

import org.bjtu.cms.bjtucms.TravelerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class TravelerController {

    @Autowired
    lateinit var service: TravelerService



}