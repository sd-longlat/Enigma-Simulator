package com.sdr.enigmasimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_settings.*

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val rotors = arrayOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII")
        val reflectors = arrayOf("B", "C", "BD", "CD")

        rotorA.minValue = 1
        rotorA.maxValue = rotors.size
        rotorB.minValue = 1
        rotorB.maxValue = rotors.size
        rotorC.minValue = 1
        rotorC.maxValue = rotors.size
        rotorA.displayedValues = rotors
        rotorB.displayedValues = rotors
        rotorC.displayedValues = rotors
        reflector.minValue = 1
        reflector.maxValue = reflectors.size
        reflector.displayedValues = reflectors
    }
}
