package org.bjtu.cms.bjtucms

import org.bjtu.cms.bjtucms.dao.Traveler
import org.bjtu.cms.bjtucms.log.MyLogger
import java.io.File


fun saveEmployeesFromTxtFile() {
    MyLogger.i("loadLocalData.")
    val txtPath = "./data/cit_training_003_data.txt"
    val file = File(txtPath)
    MyLogger.i("file: $file")
    if (file.exists()) {
        val context: String = file.readText()
        val travelers: List<String> = context.split("\n")
        travelers.forEach { line: String ->
            // i.e. 541519;0;1986;17413;9
            resolveProps(line)
        }
        MyLogger.i("Insert all travelers ${travelers.size} successfully.")
    } else {
        MyLogger.e("file does not exist")
    }
}

private fun resolveProps(line: String) {
    try {
        val props: List<String> = line.split(";")
        //MyLogger.i("To be resolved: $props.")
        val id = props[0]
        val gender = props[1].toInt()
        val birthYear = props[2].toInt()
        val totalMiles = props[3].toInt()
        val totalTime = props[4].trim().toInt()
        val individual = Traveler(id, gender, birthYear, totalMiles, totalTime)

    } catch (e: Exception) {
        e.printStackTrace()
        MyLogger.e(e, "resolvePops err for: $line.")
    }
}
