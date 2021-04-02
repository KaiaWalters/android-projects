package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

open class MainActivity : AppCompatActivity() {
    var diceValue = 0
    val rollButton: Button = findViewById(R.id.roll_button)
    val countButton: Button = findViewById(R.id.count_button)
    val resultText: TextView = findViewById(R.id.result_text)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        diceValue = randomInt
        resultText.text = "Dice Rolled!"
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        var result = (diceValue + 1).toString()

        Toast.makeText(this, result,
            Toast.LENGTH_SHORT).show()
    }

}