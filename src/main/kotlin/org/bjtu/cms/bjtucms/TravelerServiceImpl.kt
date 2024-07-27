package org.bjtu.cms.bjtucms

import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TravelerServiceImpl : TravelerService {

    @Autowired
    lateinit var repo: TravelerRepo
}