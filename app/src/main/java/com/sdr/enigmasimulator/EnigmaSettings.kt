package com.sdr.enigmasimulator

object EnigmaSettings {
    var ROTOR_I = charArrayOf(
        'E', 'K', 'M', 'F', 'L', 'G',
        'D', 'Q', 'V', 'Z', 'N', 'T', 'O', 'W', 'Y', 'H', 'X', 'U', 'S',
        'P', 'A', 'I', 'B', 'R', 'C', 'J'
    )
    var ROTOR_II = charArrayOf(
        'A', 'J', 'D', 'K', 'S', 'I',
        'R', 'U', 'X', 'B', 'L', 'H', 'W', 'T', 'M', 'C', 'Q', 'G', 'Z',
        'N', 'P', 'Y', 'F', 'V', 'O', 'E'
    )
    var ROTOR_III = charArrayOf(
        'B', 'D', 'F', 'H', 'J', 'L',
        'C', 'P', 'R', 'T', 'X', 'V', 'Z', 'N', 'Y', 'E', 'I', 'W', 'G',
        'A', 'K', 'M', 'U', 'S', 'Q', 'O'
    )
    var ROTOR_IV = charArrayOf(
        'E', 'S', 'O', 'V', 'P', 'Z',
        'J', 'A', 'Y', 'Q', 'U', 'I', 'R', 'H', 'X', 'L', 'N', 'F', 'T',
        'G', 'K', 'D', 'C', 'M', 'W', 'B'
    )
    var ROTOR_V = charArrayOf(
        'V', 'Z', 'B', 'R', 'G', 'I',
        'T', 'Y', 'U', 'P', 'S', 'D', 'N', 'H', 'L', 'X', 'A', 'W', 'M',
        'J', 'Q', 'O', 'F', 'E', 'C', 'K'
    )
    var ROTOR_VI = charArrayOf(
        'J', 'P', 'G', 'V', 'O', 'U',
        'M', 'F', 'Y', 'Q', 'B', 'E', 'N', 'H', 'Z', 'R', 'D', 'K', 'A',
        'S', 'X', 'L', 'I', 'C', 'T', 'W'
    )
    var ROTOR_VII = charArrayOf(
        'N', 'Z', 'J', 'H', 'G', 'R',
        'C', 'X', 'M', 'Y', 'S', 'W', 'B', 'O', 'U', 'F', 'A', 'I', 'V',
        'L', 'P', 'E', 'K', 'Q', 'D', 'T'
    )
    var ROTOR_VIII = charArrayOf(
        'N', 'Z', 'J', 'H', 'G',
        'R', 'C', 'X', 'M', 'Y', 'S', 'W', 'B', 'O', 'U', 'F', 'A', 'I',
        'V', 'L', 'P', 'E', 'K', 'Q', 'D', 'T'
    )
    var REFLECTOR_B = arrayOf(
        charArrayOf(
            'A', 'Y', 'B', 'R', 'C', 'D', 'E', 'F', 'G', 'I', 'J', 'K', 'M',
            'T', 'V'
        ), charArrayOf('Y', 'R', 'U', 'H', 'Q', 'S', 'L', 'P', 'X', 'N', 'O', 'Z', 'W')
    )
    var REFLECTOR_C = arrayOf(
        charArrayOf(
            'A',
            'B',
            'C',
            'D',
            'E',
            'G',
            'H',
            'K',
            'L',
            'M',
            'N',
            'T',
            'S'
        ), charArrayOf('F', 'V', 'P', 'J', 'I', 'O', 'Y', 'R', 'Z', 'X', 'W', 'Q', 'U')
    )
    var REFLECTOR_BD = arrayOf(
        charArrayOf(
            'A',
            'B',
            'C',
            'D',
            'F',
            'G',
            'H',
            'I',
            'L',
            'M',
            'R',
            'S',
            'T'
        ), charArrayOf('E', 'N', 'K', 'Q', 'U', 'Y', 'W', 'J', 'O', 'P', 'X', 'Z', 'V')
    )
    var REFLECTOR_CD = arrayOf(
        charArrayOf(
            'A',
            'B',
            'C',
            'E',
            'F',
            'G',
            'H',
            'I',
            'L',
            'P',
            'Q',
            'S',
            'U'
        ), charArrayOf('R', 'D', 'O', 'J', 'N', 'T', 'K', 'V', 'M', 'W', 'Z', 'X', 'Y')
    )
}