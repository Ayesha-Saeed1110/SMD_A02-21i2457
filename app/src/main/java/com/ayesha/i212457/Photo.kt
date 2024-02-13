package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
        val secondActButton = findViewById<Button>(R.id.video)
        secondActButton.setOnClickListener {
            val intent = Intent(this, video::class.java)
            startActivity(intent)

        }
        val thirdActButton = findViewById<ImageButton>(R.id.videobtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, video::class.java)
            startActivity(intent)

        }
    }
}