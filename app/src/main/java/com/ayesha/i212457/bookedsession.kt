package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class bookedsession : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookedsession)
        val thirdActButton = findViewById<ImageButton>(R.id.backbtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
    }
}