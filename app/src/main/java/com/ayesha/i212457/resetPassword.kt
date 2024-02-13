package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button


class resetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password2)

        val firstActButton = findViewById<ImageButton>(R.id.backbtn)
        firstActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)


        }
        val secondActButton = findViewById<Button>(R.id.loginbtn)
        secondActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
        val thirdActButton = findViewById<Button>(R.id.loginb)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
    }
}