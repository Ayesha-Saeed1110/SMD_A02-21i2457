package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class fourteenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chats)
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
        val fifthActButton = findViewById<ImageButton>(R.id.search)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, eighth::class.java)
            startActivity(intent)

        }

        val seventhActButton = findViewById<ImageButton>(R.id.profilebtn)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
        val eighthActButton = findViewById<ImageButton>(R.id.johncommbtn)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, sixteenth::class.java)
            startActivity(intent)

        }
        val ninthActButton = findViewById<ImageButton>(R.id.johnchatbtn)
        ninthActButton.setOnClickListener {
            val intent = Intent(this, fifteenth::class.java)
            startActivity(intent)

        }
        val tenthActButton = findViewById<ImageButton>(R.id.add)
        tenthActButton.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)

        }
    }
}