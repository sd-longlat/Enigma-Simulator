package com.sdr.enigmasimulator.enigma

class Reflector(var reflector: Array<CharArray>) {
    fun swap(c: Char): Char {
        for (i in reflector[0].indices) {
            if (c == reflector[0][i]) {
                return reflector[1][i]
            } else if (c == reflector[1][i]) {
                return reflector[0][i]
            }
        }
        return c // This line should never be reached, acts as a failsafe.
    }

}