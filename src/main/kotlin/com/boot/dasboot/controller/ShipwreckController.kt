package com.boot.dasboot.controller


import com.boot.dasboot.model.Shipwreck
import com.boot.dasboot.repository.ShipwreckRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/v1/")
class ShipwreckController{

    @Autowired
    lateinit var  shipwreckRepository: ShipwreckRepository

    @GetMapping("/shipwrecks")
    fun list(): List<Shipwreck> = shipwreckRepository.findAll()

    @GetMapping("/shipwrecks/{id}")
    fun get(@PathVariable id: Long): Shipwreck =
         shipwreckRepository.findById(id).orElse(null)


    @PostMapping("/shipwrecks")
    fun create(@RequestBody shipwreck: Shipwreck): Shipwreck = shipwreckRepository.saveAndFlush(shipwreck)


    @PutMapping("/shipwrecks/{id}")
    fun update(@PathVariable id: Long, @RequestBody shipwreck: Shipwreck) : Shipwreck {

        val existingShipwreck: Shipwreck = shipwreckRepository.findById(id).orElse(null)
        BeanUtils.copyProperties(shipwreck, existingShipwreck)
        return shipwreckRepository.saveAndFlush(existingShipwreck)
    }

    @DeleteMapping("/shipwrecks/{id}")
    fun delete(@PathVariable id: Long) : Shipwreck {
        val existingShipwreck: Shipwreck = shipwreckRepository.findById(id).orElse(null)
        shipwreckRepository.delete(existingShipwreck)
        return existingShipwreck
    }
}
