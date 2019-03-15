package com.boot.dasboot.repository

import com.boot.dasboot.model.Shipwreck
import org.springframework.data.mongodb.repository.MongoRepository

interface ShipwreckRepository : MongoRepository<Shipwreck, String>{

}
