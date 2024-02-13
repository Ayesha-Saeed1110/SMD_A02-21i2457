package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class forgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val thirdActButton = findViewById<Button>(R.id.login)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.backbtn)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)


        }
        val fifthActButton = findViewById<Button>(R.id.send)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, resetPassword::class.java)
            startActivity(intent)

        }
    }
}