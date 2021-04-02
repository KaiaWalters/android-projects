package com.example.diceroller
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

//@RunWith(RobolectricTestRunner.class)
class DiceRollTest {
    @Test
   fun displayvaluewhenbuttonisclicked()
    {
        //arrange
        var subject: MainActivity = MainActivity()
        var diceValue = subject.resultText.text
        diceValue = "Dice Rolled!"
        var diceType = (diceValue is String)
        var actual = diceType

        assertEquals(true, actual)

        //action
        subject.rollButton.performClick()

        //assert
        assertEquals(false, actual)
    }
}