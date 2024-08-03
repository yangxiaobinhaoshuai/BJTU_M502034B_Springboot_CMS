package org.bjtu.cms.bjtucms.dao

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import lombok.ToString

@Entity
@Table(name = "travelers")
class Traveler() {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: String = ""

    @Column
    var gender: Int = 0

    @Column(name = "birth_year")
    var birthYear: Int = 0

    @Column(name = "total_miles")
    var totalTravelMiles: Int = 0

    @Column(name = "total_times")
    var totalTravelTime: Int = 0

    constructor(id: String, gender: Int, birthYear: Int, totalTravelMiles: Int, totalTravelTime: Int) : this() {
        this.id = id
        this.gender = gender
        this.birthYear = birthYear
        this.totalTravelMiles = totalTravelMiles
        this.totalTravelTime = totalTravelTime
    }

    override fun toString(): String {
        return "Traveler(id='$id', gender=$gender, birthYear=$birthYear, totalTravelMiles=$totalTravelMiles, totalTravelTime=$totalTravelTime)"
    }

}