package com.example.count

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Timer
import kotlin.concurrent.schedule

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Timer().schedule(3000){
            val inten = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(inten)
            finish()
        }
    }
}