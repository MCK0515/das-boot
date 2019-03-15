package com.boot.dasboot.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("shipwreck")
data class Shipwreck(

        @Id
        val id: String? = null,
        var name: String,
        var description: String,
        var condition: String,
        var depth: Int,
        var latitude: Double,
        var longitude: Double,
        var yearDiscovered: Int

)
