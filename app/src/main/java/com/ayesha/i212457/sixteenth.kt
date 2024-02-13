package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class sixteenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixteenth)
        val thirdActButton = findViewById<ImageButton>(R.id.backbtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
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
        val eighthActButton = findViewById<ImageButton>(R.id.add)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)

        }
        val ninthActButton = findViewById<ImageButton>(R.id.phone)
        ninthActButton.setOnClickListener {
            val intent = Intent(this, audioCall::class.java)
            startActivity(intent)

        }

        val tenthActButton = findViewById<ImageButton>(R.id.vid)
        tenthActButton.setOnClickListener {
            val intent = Intent(this, videoCall::class.java)
            startActivity(intent)

        }
    }
}