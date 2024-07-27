package org.bjtu.cms.bjtucms

import jakarta.persistence.*


@Entity
@Table(name = "traveler")
class Traveler {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column
    var gender: Int = 0

    @Column
    var birthYear: Int = 0

    @Column
    var totalTravelMiles: Long = 0

    @Column
    var totalTravelTime: Long = 0
}