package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val secondActButton = findViewById<Button>(R.id.btn)
        secondActButton.setOnClickListener {
            val intent = Intent(this, verifyPhoneNumber::class.java)
            startActivity(intent)

        }

        val thirdActButton = findViewById<Button>(R.id.login)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }

    }
}