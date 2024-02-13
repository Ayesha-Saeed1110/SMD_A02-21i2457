package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val thirdActButton = findViewById<ImageButton>(R.id.search)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, eighth::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.chat)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<ImageButton>(R.id.profilebtn)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.bell)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<ImageButton>(R.id.jc)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

        }
        val eighthActButton = findViewById<Button>(R.id.button)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)

        }
    }
}