package org.bjtu.cms.bjtucms.service

import org.bjtu.cms.bjtucms.log.MyLogger
import org.bjtu.cms.bjtucms.repo.TravelerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.File

@Service
class TravelerServiceImpl : TravelerService {

    init {
        //saveEmployeesFromTxtFile("/cit_training_003_data.txt")
        MyLogger.i("TravelerServiceImpl initialized.")
    }

    @Autowired
    lateinit var repo: TravelerRepo

    private fun saveEmployeesFromTxtFile(filePath: String) {
        File(filePath).forEachLine {
            val data = it.split(",")
//            val employee = Employee(name = data[0], department = data[1])
//            employeeRepository.save(employee)
        }
        println("Data inserted successfully.")
    }
}