package com.sdr.enigmasimulator

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var resultText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rotorA.minValue = 0
        rotorA.maxValue = 25
        rotorB.minValue = 0
        rotorB.maxValue = 25
        rotorC.minValue = 0
        rotorC.maxValue = 25
        button_Q.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_Q)
            true
        }
        button_W.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_W)
            true
        }
        button_E.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_E)
            true
        }
        button_R.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_R)
            true
        }
        button_T.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_T)
            true
        }
        button_Z.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_Z)
            true
        }
        button_U.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_U)
            true
        }
        button_I.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_I)
            true
        }
        button_O.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_O)
            true
        }
        button_A.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_A)
            true
        }
        button_S.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_S)
            true
        }
        button_D.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_D)
            true
        }
        button_F.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_F)
            true
        }
        button_G.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_G)
            true
        }
        button_H.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_H)
            true
        }
        button_J.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_J)
            true
        }
        button_K.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_K)
            true
        }
        button_P.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_P)
            true
        }
        button_Y.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_Y)
            true
        }
        button_X.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_X)
            true
        }
        button_C.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_C)
            true
        }
        button_V.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_V)
            true
        }
        button_B.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_B)
            true
        }
        button_N.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_N)
            true
        }
        button_M.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_M)
            true
        }
        button_L.setOnTouchListener { _, event ->
            val action = event.action
            buttonPressed(action, button_L)
            true
        }
    }

    private fun charDisplay(char: Char) {
        textViewOutput.visibility = View.VISIBLE
        val buttonRes = resources.getColor(R.color.lightTextColorActive)
        if ((resultText.length % 5 == 0) && (resultText.isNotEmpty())) {
            textViewOutput.text = resultText.plus(" ")
        }
        if ((resultText.replace(" ","").length % 5 == 0) && (resultText.isNotEmpty()))
            resultText = resultText.plus(" ")
        resultText = resultText.plus(char.toString())
        textViewOutput.text = resultText

        when (char) {
            'A' -> {
                buttonLight_A.setTextColor(buttonRes)
            }
            'B' -> {
                buttonLight_B.setTextColor(buttonRes)
            }
            'C' -> {
                buttonLight_C.setTextColor(buttonRes)
            }
            'D' -> {
                buttonLight_D.setTextColor(buttonRes)
            }
            'E' -> {
                buttonLight_E.setTextColor(buttonRes)
            }
            'F' -> {
                buttonLight_F.setTextColor(buttonRes)
            }
            'G' -> {
                buttonLight_G.setTextColor(buttonRes)
            }
            'H' -> {
                buttonLight_H.setTextColor(buttonRes)
            }
            'I' -> {
                buttonLight_I.setTextColor(buttonRes)
            }
            'J' -> {
                buttonLight_J.setTextColor(buttonRes)
            }
            'K' -> {
                buttonLight_K.setTextColor(buttonRes)
            }
            'L' -> {
                buttonLight_L.setTextColor(buttonRes)
            }
            'M' -> {
                buttonLight_M.setTextColor(buttonRes)
            }
            'N' -> {
                buttonLight_N.setTextColor(buttonRes)
            }
            'O' -> {
                buttonLight_O.setTextColor(buttonRes)
            }
            'P' -> {
                buttonLight_P.setTextColor(buttonRes)
            }
            'Q' -> {
                buttonLight_Q.setTextColor(buttonRes)
            }
            'R' -> {
                buttonLight_R.setTextColor(buttonRes)
            }
            'S' -> {
                buttonLight_S.setTextColor(buttonRes)
            }
            'T' -> {
                buttonLight_T.setTextColor(buttonRes)
            }
            'U' -> {
                buttonLight_U.setTextColor(buttonRes)
            }
            'V' -> {
                buttonLight_V.setTextColor(buttonRes)
            }
            'W' -> {
                buttonLight_W.setTextColor(buttonRes)
            }
            'X' -> {
                buttonLight_X.setTextColor(buttonRes)
            }
            'Y' -> {
                buttonLight_Y.setTextColor(buttonRes)
            }
            'Z' -> {
                buttonLight_Z.setTextColor(buttonRes)
            }
        }
    }

    private fun clearDisplay() {
        val buttonRes = resources.getColor(R.color.lightTextColor)
        buttonLight_A.setTextColor(buttonRes)
        buttonLight_B.setTextColor(buttonRes)
        buttonLight_C.setTextColor(buttonRes)
        buttonLight_D.setTextColor(buttonRes)
        buttonLight_E.setTextColor(buttonRes)
        buttonLight_F.setTextColor(buttonRes)
        buttonLight_G.setTextColor(buttonRes)
        buttonLight_H.setTextColor(buttonRes)
        buttonLight_I.setTextColor(buttonRes)
        buttonLight_J.setTextColor(buttonRes)
        buttonLight_K.setTextColor(buttonRes)
        buttonLight_L.setTextColor(buttonRes)
        buttonLight_M.setTextColor(buttonRes)
        buttonLight_N.setTextColor(buttonRes)
        buttonLight_O.setTextColor(buttonRes)
        buttonLight_P.setTextColor(buttonRes)
        buttonLight_Q.setTextColor(buttonRes)
        buttonLight_R.setTextColor(buttonRes)
        buttonLight_S.setTextColor(buttonRes)
        buttonLight_T.setTextColor(buttonRes)
        buttonLight_U.setTextColor(buttonRes)
        buttonLight_V.setTextColor(buttonRes)
        buttonLight_W.setTextColor(buttonRes)
        buttonLight_X.setTextColor(buttonRes)
        buttonLight_Y.setTextColor(buttonRes)
        buttonLight_Z.setTextColor(buttonRes)
    }

    private fun buttonPressed(action: Int, button: Button) {
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                button.setBackgroundResource(R.drawable.button_enabled_shape)
                button.setTextColor(resources.getColor(R.color.buttonTextColorActive))
                charDisplay(button.text[0])
            }
            MotionEvent.ACTION_UP -> {
                button.setBackgroundResource(R.drawable.button_shape)
                button.setTextColor(resources.getColor(R.color.buttonTextColor))
                clearDisplay()
            }
            else -> {
            }
        }
    }
}

