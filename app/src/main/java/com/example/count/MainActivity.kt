package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var button_counter: Button
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button_counter = findViewById(R.id.button_count)

        button.setOnClickListener {
            textView.text = "Hello, friend!"
        }

        button_counter.setOnClickListener {
            textView.text = "Я нажал на кнопку ${++count} раз"
        }
    }

    fun imgClick(view: View) {
        textView.text = "Я нажал на кнопку ${++count} раз"
    }
}