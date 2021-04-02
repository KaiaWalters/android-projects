package com.example.diceroller

import android.R
import org.junit.Assert.*
import org.junit.Test
import android.view.View
import org.junit.Rule
import javax.security.auth.Subject


class DiceRollTest {

    @Test
    fun display_random_value_when_button_is_clicked() {
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

    @Test
    fun display_diceValue_plus_one_when_button_is_clicked() {

    }
}