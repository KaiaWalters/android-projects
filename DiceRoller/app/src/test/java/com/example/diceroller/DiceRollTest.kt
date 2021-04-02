package com.example.diceroller

import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class DiceRollTest : MainActivity() {
    @Test
   fun display_value_when_button_is_clicked()
    {
        //arrange
        var subject = MainActivity()
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

