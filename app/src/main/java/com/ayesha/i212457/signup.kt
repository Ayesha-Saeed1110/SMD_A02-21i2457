package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.ayesha.i212457.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth
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
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        binding.btn.setOnClickListener {
            val email = binding.emailtext.text.toString()
            val pass = binding.passwordtext.text.toString()
            val city = binding.citytext.text.toString()
            val country = binding.countrytext.text.toString()
            val phone = binding.contacttext.text.toString()
            val name = binding.nametext.text.toString()



            if (email.isNotEmpty() && pass.isNotEmpty()) {
                if (pass.isNotEmpty()) {

                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            val intent = Intent(this, login::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()

                        }
                    }
                } else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }
        }


    }


}
