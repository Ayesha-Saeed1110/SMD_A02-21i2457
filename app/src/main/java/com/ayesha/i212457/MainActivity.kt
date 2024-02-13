package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondActButton = findViewById<Button>(R.id.btn)
        secondActButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)

        }
        val thirdActButton = findViewById<Button>(R.id.signupbtn)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }

    fun openLogin(view: View) {}
    fun openProfile(view: View) {}
    fun openVideo(view: View) {}
    fun openPhoto(view: View) {}
    fun openMainActivity(view: View) {}
    fun openSignUp(view: View) {}
    fun openBookedSession(view: View) {}

}

