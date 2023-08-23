package com.example.a230823tdd

import org.junit.Test

import org.junit.Assert.*
import java.util.Date

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val tennis = Tennis()

    @Test
    fun `love_all`() {
        scoreShouldBe()
        return
    }

    private fun scoreShouldBe() {
        val score = tennis.getScore()
        assertEquals("love all", score)
    }

    @Test
    fun `fifteen love`() {
//        tennis.playgetone
//        assertEquals(scoreShouldBe(), "fifteen love" )

    }

    @Test
    fun 'QQ' () {
        val date = Date()

        date.time
    }

}