package com.boot.dasboot

import com.boot.dasboot.controller.HomeController
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Assert.assertEquals

@RunWith(SpringRunner::class)
@SpringBootTest
class DasBootApplicationTests {

    @Test
    fun testApp() {
        val hc = HomeController()
        val result: String = hc.home()
        assertEquals("Das Boot, reporting for duty!", result)
    }

}
