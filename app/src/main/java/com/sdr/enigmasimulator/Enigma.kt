package com.sdr.enigmasimulator

import java.util.*


/**
 *
 * Title: Enigma
 *
 * Description: A Simulation of the German Military Enigma Machine.
 * Specifications of rotors and reflectors obtained from
 * http://www.codesandciphers.org.uk/enigma/rotorspec.htm and
 * http://homepages.tesco.net/~andycarlson/enigma/simulating_enigma.html
 * @author Meghan Emilio
 * @version 1.0
 */
class Enigma(
    r1: String,
    r2: String,
    r3: String,
    r: String
) {
    //CURRENT ROTORS AND REFLECTOR IN USE
    var firstRotor: StringBuffer?
    var firstRotorT =
        StringBuffer(reflector0.toString())
    var secondRotor: StringBuffer?
    var secondRotorT =
        StringBuffer(reflector0.toString())
    var thirdRotor: StringBuffer?
    var thirdRotorT =
        StringBuffer(reflector0.toString())
    var reflector: StringBuffer?
    //CURRENT PLUGBOARD SETTINGS
    var plugBoard = charArrayOf(
        'A',
        'B',
        'C',
        'D',
        'E',
        'F',
        'G',
        'H',
        'I',
        'J',
        'K',
        'L',
        'M',
        'N',
        'O',
        'P',
        'Q',
        'R',
        'S',
        'T',
        'U',
        'V',
        'W',
        'X',
        'Y',
        'Z'
    )
    //CURRENT ROTOR NOTCHES
    private var n1: StringBuffer?
    private var n2: StringBuffer?
    /**
     * Sets the first Rotor
     * @param r1 rotor to be used as first rotor
     * @return void
     */
    fun setFirstRotor(r1: String) {
        firstRotor = getValue(r1)[0]
        n1 = getValue(r1)[1]
    }

    /**
     * Sets the second Rotor
     * @param r2 rotor to be used as second rotor
     * @return void
     */
    fun setSecondRotor(r2: String) {
        secondRotor = getValue(r2)[0]
        n2 = getValue(r2)[1]
    }

    /**
     * Sets the second Rotor
     * @param r3 rotor to be used as third rotor
     * @return void
     */
    fun setThirdRotor(r3: String) {
        thirdRotor = getValue(r3)[0]
    }

    /**
     * Sets the intial settings of the rotors.
     * @param s1 initial setting for first rotor
     * @param s2 initial setting for second rotor
     * @param s3 initial setting for third rotor
     * @return void
     */
    fun initialSettings(s1: String?, s2: String?, s3: String?) {
        var p: Int
        //First Rotor
        p = firstRotorT.toString().indexOf(s1!!)
        firstRotorT.append(firstRotorT.substring(0, p))
        firstRotorT.delete(0, p)
        //Second Rotor
        p = secondRotorT.toString().indexOf(s2!!)
        secondRotorT.append(secondRotorT.substring(0, p))
        secondRotorT.delete(0, p)
        //Third Rotor
        p = thirdRotorT.toString().indexOf(s3!!)
        thirdRotorT.append(thirdRotorT.substring(0, p))
        thirdRotorT.delete(0, p)
    }

    /**
     * Creates a plubboard connection between two letters
     * @param x first character to be connected
     * @param y second character to be connected
     * @return void
     */
    fun setPlugBoard(x: Char, y: Char) {
        for (i in plugBoard.indices) {
            if (plugBoard[i] == x) plugBoard[i] =
                y else if (plugBoard[i] == y) plugBoard[i] = x
        }
    }

    /**
     * Sets the plug board settings
     * @param str plug board settings formatted in pairs,
     * each pair seperated by a space
     * @return boolean if str entered was in correct format
     * and if the plugboard was set accordingly
     */
    fun setPlugBoard(str: String?): Boolean {
        var s: String
        val tokenCheck = StringTokenizer(str, " ")
        while (tokenCheck.hasMoreTokens()) {
            s = tokenCheck.nextToken()
            if (s.length != 2) return false
            if (s[0].toInt() > 90 || s[0].toInt() < 65 || s[1].toInt() > 90 || s[1].toInt() < 65
            ) return false
        }
        val token = StringTokenizer(str, " ")
        while (token.hasMoreTokens()) {
            s = token.nextToken()
            if (s.length == 2) setPlugBoard(s[0], s[1]) else return false
        }
        return true
    }

    /**
     * Returns the value of the specified Rotor.
     * @param v name or number of rotor
     * @return StringBuffer[] correct rotor
     */
    fun getValue(v: String): Array<StringBuffer?> {
        val result = arrayOfNulls<StringBuffer>(2)
        if (v == "RotorI" || v == "1") {
            result[0] = rotorI
            result[1] = notches[0]
            return result
        }
        if (v == "RotorII" || v == "2") {
            result[0] = rotorII
            result[1] = notches[1]
            return result
        }
        if (v == "RotorIII" || v == "3") {
            result[0] = rotorIII
            result[1] = notches[2]
            return result
        }
        if (v == "RotorIV" || v == "4") {
            result[0] = rotorIV
            result[1] = notches[3]
            return result
        }
        if (v == "RotorV" || v == "5") {
            result[0] = rotorV
            result[1] = notches[4]
            return result
        }
        if (v == "RotorVI" || v == "6") {
            result[0] = rotorVI
            result[1] = notches[5]
            return result
        }
        if (v == "RotorVII" || v == "7") {
            result[0] = rotorVII
            result[1] = notches[6]
            return result
        }
        if (v == "RotorVIII" || v == "8") {
            result[0] = rotorVIII
            result[1] = notches[7]
            return result
        }
        if (v == "ReflectorB") {
            result[0] = reflectorB
            result[1] = StringBuffer("")
            return result
        }
        if (v == "ReflectorC") {
            result[0] = reflectorC
            result[1] = StringBuffer("")
            return result
        }
        if (v == "No Reflector") {
            result[0] = reflector0
            result[1] = StringBuffer("")
            return result
        }
        return arrayOf(
            StringBuffer("ERROR"),
            StringBuffer("")
        )
    }

    /**
     * Returns the character obtained after passing l through
     * the current first rotor
     * @param l character input
     * @return char obtained after passing l through the current first rotor
     */
    fun rotorOne(l: Char): Char {
        val position = firstRotorT.toString().indexOf(l)
        return firstRotor!![position]
    }

    /**
     * Returns the character obtained after passing l through
     * the current second rotor
     * @param l character input
     * @return char obtained after passing l through the current second rotor
     */
    fun rotorTwo(l: Char): Char {
        val position = secondRotorT.toString().indexOf(l)
        return secondRotor!![position]
    }

    /**
     * Returns the character obtained after passing l through
     * the current third rotor
     * @param l character input
     * @return char obtained after passing l through the current third rotor
     */
    fun rotorThree(l: Char): Char {
        val position = thirdRotorT.toString().indexOf(l)
        return thirdRotor!![position]
    }

    /**
     * Returns the character obtained after passing l through
     * the current reflector
     * @param l character input
     * @return char obtained after passing l through the current reflector
     */
    fun reflector(l: Char): Char {
        var l = l
        val position = l.toInt() - 65
        l = reflector!![position]
        return l
    }

    /**
     * Returns the character obtained after passing l through
     * the current first rotor in the reverse direction
     * @param l character input
     * @return char obtained after passing l through the current
     * first rotor in the reverse direction
     */
    fun IrotorOne(l: Char): Char {
        val position = firstRotor.toString().indexOf(l)
        return firstRotorT[position]
    }

    /**
     * Returns the character obtained after passing l through
     * the current second rotor in the reverse direction
     * @param l character input
     * @return char obtained after passing l through the current
     * second rotor in the reverse direction
     */
    fun IrotorTwo(l: Char): Char {
        val position = secondRotor.toString().indexOf(l)
        return secondRotorT[position]
    }

    /**
     * Returns the character obtained after passing l through
     * the current third rotor in the reverse direction
     * @param l character input
     * @return char obtained after passing l through the current
     * third rotor in the reverse direction
     */
    fun IrotorThree(l: Char): Char {
        val position = thirdRotor.toString().indexOf(l)
        return thirdRotorT[position]
    }

    /**
     * Rotates the rotors according to their current settings
     * @param void
     * @return void
     */
    fun rotate() {
        val currentR1 =
            StringBuffer(firstRotorT[0].toString() + "")
        val currentR2 =
            StringBuffer(secondRotorT[0].toString() + "")
        //Rotate first rotor
        firstRotorT.append(firstRotorT[0])
        firstRotorT.delete(0, 1)
        //if first rotor is at notch
        if (currentR1.toString() == n1.toString()) { //then also rotate second rotor
            secondRotorT.append(secondRotorT[0])
            secondRotorT.delete(0, 1)
            //if second rotor is at notch
            if (currentR2.toString() == n2.toString()) { //then also rotate the third rotor
                thirdRotorT.append(thirdRotorT[0])
                thirdRotorT.delete(0, 1)
            }
        }
    }

    /**
     * Returns the result of passing c through
     * the plugboard with its current settings
     * @param c the inputted character
     * @return char the result of passing c through
     * the plugboard with its current settings
     */
    fun plugBoard(c: Char): Char {
        val i = c.toInt() - 65
        return plugBoard[i]
    }

    /**
     * Returns the current setting of the first rotor.
     * @param void
     * @return char that is the current setting of the first rotor
     */
    val fRSetting: Char
        get() = firstRotorT[0]

    /**
     * Returns the current setting of the second rotor.
     * @param void
     * @return char that is the current setting of the second rotor
     */
    val sRSetting: Char
        get() = secondRotorT[0]

    /**
     * Returns the current setting of the third rotor.
     * @param void
     * @return char that is the current setting of the third rotor
     */
    val tRSetting: Char
        get() = thirdRotorT[0]

    /**
     * Encrypts/Decrypts the inputted string using the
     * machine's current settings
     * @param p the text to be encrypted/decrypted
     * @return void
     */
    fun encrypt(p: String): String? {
        var p = p
        p = p.toUpperCase()
        var e = ""
        var c: Char
        var k: Int
        //for the length of the inputted text
        for (i in 0 until p.length) { //store the current character
            c = p[i]
            //if the current character is a letter
            if (c.toInt() <= 90 && c.toInt() >= 65) { //rotate the rotors
                rotate()
                //pass the character through the plugboard
                c = plugBoard(c)
                //then through the first rotor
                c = rotorOne(c)
                //then through the second rotor
                c = rotorTwo(c)
                //then through the third rotor
                c = rotorThree(c)
                //then through the reflector
                c = reflector(c)
                //then through the first rotor in the reverse direction
                c = IrotorThree(c)
                //then through the second rotor in the reverse direction
                c = IrotorTwo(c)
                //then through the third rotor in the reverse direction
                c = IrotorOne(c)
                //and finally back through the plugboard
                c = plugBoard(c)
                //and add the new character to the encrypted/decrypted message
                e = e + c
            } else if (c.toInt() == 32) e = e + c else return null
        }
        //return the complete encrypted/decrpyted message
        return e
    }

    /**
     * Parses Plugboard input to check for repeated letters
     * as each letter can only be used once in the plugboard
     * @param str the inputted plug board settings
     * @return void
     */
    fun pbParser(str: String?): Boolean { //if no plug board settings were input, then continue
        if (str!!.length <= 0 || str == null || str == null) {
            return true
        }
        //otherwise, check to make sure letters are not repeated
        var i = 0
        while (i < str.length - 1) {
            //if not a letter, continue
            if (str[i].toInt() > 90 || str[i].toInt() < 65) i++ else if (str.substring(i + 1).indexOf(
                    str[i]
                ) != -1
            ) return false
            i++
        }
        //otherwise, return true
        return true
    }

    companion object {
        //STATIC ROTORS
        val rotorI = StringBuffer("EKMFLGDQVZNTOWYHXUSPAIBRCJ")
        val rotorII = StringBuffer("AJDKSIRUXBLHWTMCQGZNPYFVOE")
        val rotorIII = StringBuffer("BDFHJLCPRTXVZNYEIWGAKMUSQO")
        val rotorIV = StringBuffer("ESOVPZJAYQUIRHXLNFTGKDCMWB")
        val rotorV = StringBuffer("VZBRGITYUPSDNHLXAWMJQOFECK")
        val rotorVI = StringBuffer("JPGVOUMFYQBENHZRDKASXLICTW")
        val rotorVII = StringBuffer("NZJHGRCXMYSWBOUFAIVLPEKQDT")
        val rotorVIII = StringBuffer("JPGVOUMFYQBENHZRDKASXLICTW")
        //STATIC REFLECTORS
        val reflectorB =
            StringBuffer("YRUHQSLDPXNGOKMIEBFZCWVJAT")
        val reflectorC =
            StringBuffer("FVPJIAOYEDRZXWGCTKUQSBNMHL")
        val reflector0 =
            StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ")
        //STATIC "NOTCHES"  - when each rotor rotates
        val notches = arrayOf(
            StringBuffer("Q"),
            StringBuffer("E"),
            StringBuffer("V"),
            StringBuffer("J"),
            StringBuffer("Z"),
            StringBuffer("Z"),
            StringBuffer("Z"),
            StringBuffer("Z")
        )
    }

    /**
     * Class Constructor
     * @param r1 rotor to be used as first rotor
     * @param r2 rotor to be used as second rotor
     * @param r3 rotor to be used as third rotor
     * @param r reflector to be used
     */
    init {
        firstRotor = getValue(r1)[0]
        n1 = getValue(r1)[1]
        secondRotor = getValue(r2)[0]
        n2 = getValue(r2)[1]
        thirdRotor = getValue(r3)[0]
        reflector = getValue(r)[0]
    }
}
