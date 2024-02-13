package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class eighth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighth)
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
        val fifthActButton = findViewById<ImageButton>(R.id.searchone)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, ninth::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.chat)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<ImageButton>(R.id.profilebtn)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }

    }
}