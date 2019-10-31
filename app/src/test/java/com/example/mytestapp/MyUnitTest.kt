package com.example.mytestapp

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test

class MyUnitTest {

    private var mathematics: Mathematics? = null

    @Before
    fun setThingsUP(){
        mathematics = Mathematics()
    }


    @Test
    fun testAddition(){
        assertEquals(mathematics?.addSum(1, 2), 3)
        assertEquals(mathematics?.addSum(5, 12), 17)
        assertEquals(mathematics?.addSum(3, 4), 7)
        assertEquals(mathematics?.addSum(8, 8), 16)

        assertNotEquals(mathematics?.addSum(1, 1), 0)
    }
    @Test
    fun testSubtraction(){
      assertEquals(mathematics?.subtractSum(9, 9), 0)

    }
    @Test
    fun testDivision(){

        assertEquals(mathematics?.subtractSum(5, 2), 2.5f)

    }@Test
    fun testMultiplication(){
        assertEquals(mathematics?.subtractSum(5, 3), 15)
    }



    @After
    fun tearThingsDown(){
        mathematics = null
    }
}