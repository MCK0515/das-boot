package com.boot.dasboot.model

import org.springframework.data.annotation.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
@Table(name = "shipwreck")
data class Shipwreck (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: String? = null,
        var name: String,
        var description: String,
        var condition: String,
        var depth: Int,
        var latitude: Double,
        var longitude: Double,
        var yearDiscovered: Int

)
