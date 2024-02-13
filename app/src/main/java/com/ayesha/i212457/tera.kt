package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class tera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tera)
        val secondActButton = findViewById<Button>(R.id.button)
        secondActButton.setOnClickListener {
            val intent = Intent(this, bookedsession::class.java)
            startActivity(intent)


        }
        val firstActButton = findViewById<ImageButton>(R.id.vec)
        firstActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)


        }
    }
}