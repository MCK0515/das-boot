package com.boot.dasboot

import com.boot.dasboot.controller.ShipwreckController
import com.boot.dasboot.model.Shipwreck
import com.boot.dasboot.repository.ShipwreckRepository
import org.bson.types.ObjectId
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.equalTo
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import java.util.*
import kotlin.test.assertEquals


class ShipwreckControllerTest{
    @InjectMocks
    lateinit var sc: ShipwreckController

    @Mock
    lateinit var shipwreckRepository: ShipwreckRepository

    @Before
    fun init(){
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testShipwreckTest(){
        val sw = Shipwreck(("1"),"","","",0,0.0,0.0,0)

        `when`(shipwreckRepository.findById("1")).thenReturn(Optional.of(sw))
        val wreck: Shipwreck = sc.get("1")

        verify(shipwreckRepository).findById("1")
        //assertEquals(1L, wreck.id.toLong())
        assertThat(wreck.id, `is`(("1")))
    }
}
