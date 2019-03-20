package com.boot.dasboot.model


import javax.persistence.*

@Entity
@Table(name = "shipwreck")
data class Shipwreck (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        @Column
        var name: String,
        @Column
        var description: String,
        @Column
        var condition: String,
        @Column
        var depth: Int,
        @Column
        var latitude: Double,
        @Column
        var longitude: Double,
        @Column
        var yearDiscovered: Int
)
