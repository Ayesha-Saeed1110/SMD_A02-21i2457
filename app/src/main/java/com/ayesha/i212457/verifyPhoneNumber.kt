package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class verifyPhoneNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_phone_number)
        val firstActButton = findViewById<ImageButton>(R.id.backbtn)
        firstActButton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)


        }
        val secondActButton = findViewById<Button>(R.id.verify)
        secondActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)


        }
    }
}