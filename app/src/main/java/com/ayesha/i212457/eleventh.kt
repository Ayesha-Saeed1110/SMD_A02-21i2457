package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class eleventh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)
        val fourthActButton = findViewById<ImageButton>(R.id.vec)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)


        }
        val fifthActButton = findViewById<Button>(R.id.buttonone)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)


        }
    }
}