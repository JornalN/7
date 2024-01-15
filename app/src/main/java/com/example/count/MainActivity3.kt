package com.example.count

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button: Button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val inten = Intent(this@MainActivity3, MainActivity::class.java)
            startActivity(inten)
        }
    }
}