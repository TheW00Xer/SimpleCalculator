package com.example.simplecalcualtor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val editTextFirst = findViewById<EditText>(R.id.editTextFirstNumber).text.toString().toInt()
            val editTextSecond = findViewById<EditText>(R.id.editTextSecondNumber).text.toString().toInt()

            val resultOf = findViewById<TextView>(R.id.resultOf)

            val plusButton = findViewById<Button>(R.id.plus_button)
            plusButton.setOnClickListener {
                findViewById<TextView>(R.id.resultOf).apply {
                    resultOf.setText(editTextFirst + editTextSecond)
                }
            }
        } catch (e: NumberFormatException) {
            println("wrong input format")
        }
    }
}
