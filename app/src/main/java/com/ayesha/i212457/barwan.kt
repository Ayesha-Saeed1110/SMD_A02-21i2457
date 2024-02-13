package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class barwan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barwan)

        val firstActButton = findViewById<ImageButton>(R.id.vec)
        firstActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)


        }
        val secondActButton = findViewById<Button>(R.id.button)
        secondActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)


        }
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
        val fifthActButton = findViewById<ImageButton>(R.id.profile)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.add)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<ImageButton>(R.id.home)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
    }
}