package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val fourthActButton = findViewById<ImageButton>(R.id.vec)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)


        }

        val fifthActButton = findViewById<Button>(R.id.button)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, tera::class.java)
            startActivity(intent)


        }

        val sixthActButton = findViewById<Button>(R.id.button2)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, eleventh::class.java)
            startActivity(intent)


        }

        val seventhActButton = findViewById<Button>(R.id.button3)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, barwan::class.java)
            startActivity(intent)


        }
    }
}