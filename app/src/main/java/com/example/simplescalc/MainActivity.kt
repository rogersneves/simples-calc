package com.example.simplescalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var display: TextView
    private var input = ""
    private var operator = ""
    private var firstNumber = 0.0
    private var shouldResetDisplay = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display = findViewById(R.id.display)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnDot = findViewById<Button>(R.id.btnDot)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        val btnEquals = findViewById<Button>(R.id.btnEquals)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val numberListener = { number: String ->
            if (shouldResetDisplay) {
                input = number
                shouldResetDisplay = false
            } else {
                input += number
            }
            display.text = input
        }

        btn0.setOnClickListener { numberListener("0") }
        btn1.setOnClickListener { numberListener("1") }
        btn2.setOnClickListener { numberListener("2") }
        btn3.setOnClickListener { numberListener("3") }
        btn4.setOnClickListener { numberListener("4") }
        btn5.setOnClickListener { numberListener("5") }
        btn6.setOnClickListener { numberListener("6") }
        btn7.setOnClickListener { numberListener("7") }
        btn8.setOnClickListener { numberListener("8") }
        btn9.setOnClickListener { numberListener("9") }

        btnDot.setOnClickListener {
            if (!input.contains(".")) {
                input += "."
                display.text = input
            }
        }

        btnAdd.setOnClickListener { setOperator("+") }
        btnSubtract.setOnClickListener { setOperator("-") }
        btnMultiply.setOnClickListener { setOperator("*") }
        btnDivide.setOnClickListener { setOperator("/") }

        btnEquals.setOnClickListener { calculate() }
        btnClear.setOnClickListener { clear() }
    }

    private fun setOperator(op: String) {
        if (input.isNotEmpty()) {
            firstNumber = input.toDouble()
            operator = op
            input = ""
            shouldResetDisplay = true
        }
    }

    private fun calculate() {
        if (input.isNotEmpty() && operator.isNotEmpty()) {
            val secondNumber = input.toDouble()
            val result = when (operator) {
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else 0.0
                else -> 0.0
            }
            input = result.toString()
            display.text = input
            operator = ""
            shouldResetDisplay = true
        }
    }

    private fun clear() {
        input = ""
        operator = ""
        firstNumber = 0.0
        shouldResetDisplay = false
        display.text = "0"
    }
}
