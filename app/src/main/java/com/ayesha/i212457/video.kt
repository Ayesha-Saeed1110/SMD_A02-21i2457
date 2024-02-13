package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val secondActButton = findViewById<Button>(R.id.photo)
        secondActButton.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)

        }
        val thirdActButton = findViewById<ImageButton>(R.id.photobtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)

        }
    }
}