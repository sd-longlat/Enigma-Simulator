package com.sdr.enigmasimulator

import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        val buttonRes = R.drawable.button_enabled_shape
        when (char) {
            'A' -> {
                buttonLight_A.setBackgroundResource(buttonRes)
            }
            'B' -> {
                buttonLight_B.setBackgroundResource(buttonRes)
            }
            'C' -> {
                buttonLight_C.setBackgroundResource(buttonRes)
            }
            'D' -> {
                buttonLight_D.setBackgroundResource(buttonRes)
            }
            'E' -> {
                buttonLight_E.setBackgroundResource(buttonRes)
            }
            'F' -> {
                buttonLight_F.setBackgroundResource(buttonRes)
            }
            'G' -> {
                buttonLight_G.setBackgroundResource(buttonRes)
            }
            'H' -> {
                buttonLight_H.setBackgroundResource(buttonRes)
            }
            'I' -> {
                buttonLight_I.setBackgroundResource(buttonRes)
            }
            'J' -> {
                buttonLight_J.setBackgroundResource(buttonRes)
            }
            'K' -> {
                buttonLight_K.setBackgroundResource(buttonRes)
            }
            'L' -> {
                buttonLight_L.setBackgroundResource(buttonRes)
            }
            'M' -> {
                buttonLight_M.setBackgroundResource(buttonRes)
            }
            'N' -> {
                buttonLight_N.setBackgroundResource(buttonRes)
            }
            'O' -> {
                buttonLight_O.setBackgroundResource(buttonRes)
            }
            'P' -> {
                buttonLight_P.setBackgroundResource(buttonRes)
            }
            'Q' -> {
                buttonLight_Q.setBackgroundResource(buttonRes)
            }
            'R' -> {
                buttonLight_R.setBackgroundResource(buttonRes)
            }
            'S' -> {
                buttonLight_S.setBackgroundResource(buttonRes)
            }
            'T' -> {
                buttonLight_T.setBackgroundResource(buttonRes)
            }
            'U' -> {
                buttonLight_U.setBackgroundResource(buttonRes)
            }
            'V' -> {
                buttonLight_V.setBackgroundResource(buttonRes)
            }
            'W' -> {
                buttonLight_W.setBackgroundResource(buttonRes)
            }
            'X' -> {
                buttonLight_X.setBackgroundResource(buttonRes)
            }
            'Y' -> {
                buttonLight_Y.setBackgroundResource(buttonRes)
            }
            'Z' -> {
                buttonLight_Z.setBackgroundResource(buttonRes)
            }
        }
    }

    private fun clearDisplay() {
        val buttonRes = R.drawable.button_shape
        buttonLight_A.setBackgroundResource(buttonRes)
        buttonLight_B.setBackgroundResource(buttonRes)
        buttonLight_C.setBackgroundResource(buttonRes)
        buttonLight_D.setBackgroundResource(buttonRes)
        buttonLight_E.setBackgroundResource(buttonRes)
        buttonLight_F.setBackgroundResource(buttonRes)
        buttonLight_G.setBackgroundResource(buttonRes)
        buttonLight_H.setBackgroundResource(buttonRes)
        buttonLight_I.setBackgroundResource(buttonRes)
        buttonLight_J.setBackgroundResource(buttonRes)
        buttonLight_K.setBackgroundResource(buttonRes)
        buttonLight_L.setBackgroundResource(buttonRes)
        buttonLight_M.setBackgroundResource(buttonRes)
        buttonLight_N.setBackgroundResource(buttonRes)
        buttonLight_O.setBackgroundResource(buttonRes)
        buttonLight_P.setBackgroundResource(buttonRes)
        buttonLight_Q.setBackgroundResource(buttonRes)
        buttonLight_R.setBackgroundResource(buttonRes)
        buttonLight_S.setBackgroundResource(buttonRes)
        buttonLight_T.setBackgroundResource(buttonRes)
        buttonLight_U.setBackgroundResource(buttonRes)
        buttonLight_V.setBackgroundResource(buttonRes)
        buttonLight_W.setBackgroundResource(buttonRes)
        buttonLight_X.setBackgroundResource(buttonRes)
        buttonLight_Y.setBackgroundResource(buttonRes)
        buttonLight_Z.setBackgroundResource(buttonRes)
    }

    private fun buttonPressed(action: Int, button: Button) {
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                button.setBackgroundResource(R.drawable.button_enabled_shape)
                charDisplay(button.text[0])
            }
            MotionEvent.ACTION_UP -> {
                button.setBackgroundResource(R.drawable.button_shape)
                clearDisplay()
            }
            else -> {
            }
        }
    }
}

