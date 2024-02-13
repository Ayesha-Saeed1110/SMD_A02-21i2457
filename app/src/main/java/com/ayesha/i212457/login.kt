package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val secondActButton = findViewById<Button>(R.id.profile)
        secondActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val thirdActButton = findViewById<Button>(R.id.forpass)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, forgotPassword::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<Button>(R.id.signup)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)

        }
    }
}