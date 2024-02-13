package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ninth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth)
        val thirdActButton = findViewById<ImageButton>(R.id.backbtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.home)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<ImageButton>(R.id.chat)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, fifteenth::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.profilebtn)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
    }
}