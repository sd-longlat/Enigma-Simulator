package com.sdr.enigmasimulator.enigma


class PlugBoard(switches: Array<PlugBoardSwitch>) {
    var switches: Array<PlugBoardSwitch>
    fun swap(c: Char): Char {
        for (s in switches) {
            if (s.checkSwap(c)) {
                return s.swap(c)
            }
        }
        return c
    }

    init {
        this.switches = switches
    }
}