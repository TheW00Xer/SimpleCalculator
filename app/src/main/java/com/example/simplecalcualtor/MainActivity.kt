package com.example.simplecalcualtor

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextFirst = findViewById<EditText>(R.id.editTextFirstNumber).toString().toInt()
        val editTextSecond = findViewById<EditText>(R.id.editTextSecondNumber).toString().toInt()
        val resultOf = findViewById<TextView>(R.id.resultOf)

        val plus = findViewById<Button>(R.id.plus_button)

        plus.setOnClickListener {

            findViewById<TextView>(R.id.resultOf).apply {
                resultOf.setText(editTextFirst + editTextSecond)
            }
        }
    }
}
