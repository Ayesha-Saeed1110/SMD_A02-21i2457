package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class myProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)
        val thirdActButton = findViewById<ImageButton>(R.id.bbone)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.home)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<ImageButton>(R.id.search)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, eighth::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.chat)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<Button>(R.id.booksession)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, bookedsession::class.java)
            startActivity(intent)

        }
        val eighthActButton = findViewById<Button>(R.id.button)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)

        }

    }
}