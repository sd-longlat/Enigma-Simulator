package com.sdr.enigmasimulator.enigma

class PlugBoardSwitch(var `in`: Char, var out: Char) {
    fun checkSwap(c: Char): Boolean {
        return c == `in` || c == out
    }

    fun swap(c: Char): Char {
        if (c == `in`) {
            return out
        }
        return if (c == out) `in` else c
    }

}
