package com.example.simplecalcualtor

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sumOf(view: View) {
        try {
            val editTextFirst = findViewById<EditText>(R.id.editTextFirstNumber)
            val editTextSecond = findViewById<EditText>(R.id.editTextSecondNumber)
            val resultOf = findViewById<TextView>(R.id.resultOf)

            val plusButton = findViewById<Button>(R.id.plusButton)
            plusButton.setOnClickListener {
                findViewById<TextView>(R.id.resultOf).apply {
                    val val1 = editTextFirst.text.toString().toInt()
                    val val2 = editTextSecond.text.toString().toInt()
                    text = (val1 + val2).toString()
                }
            }
        } catch (e: NumberFormatException) {
            println("wrong input format")
        }
    }
}
