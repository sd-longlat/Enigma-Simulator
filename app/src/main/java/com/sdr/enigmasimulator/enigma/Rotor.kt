package com.sdr.enigmasimulator.enigma

class Rotor(var position: Int, var wheel: CharArray) {
    fun incrementPosition(): Boolean {
        shiftRotor()
        return if (position + 1 <= 26) {
            position++
            false
        } else {
            position = 0
            true
        }
    }

    private fun shiftRotor() {
        val last = wheel[wheel.size - 1]
        System.arraycopy(wheel, 0, wheel, 1, wheel.size - 1)
        wheel[0] = last
    }

    @JvmOverloads
    fun swap(c: Char, reverse: Boolean = false): Char {
        return if (reverse) {
            (String(wheel).indexOf(c) + 'A'.toInt()).toChar() // Find the position of the rotor and return the character at that position in the
            // alphabet
        } else wheel[c - 'A']
        // Find the character at the position of the current character in the alphabet
    }

    init {
        for (i in 0 until position) {
            shiftRotor()
        }
    }
}