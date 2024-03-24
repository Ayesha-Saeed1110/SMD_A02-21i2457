package com.ayesha.i212457

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
/*import androidx.annotation.RequiresApi*/
import com.google.firebase.auth.FirebaseAuth


class login : AppCompatActivity()
{



    private lateinit var emailtext: EditText
    private lateinit var passwordtext: EditText
    private lateinit var profilebtn: Button

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val secondActButton = findViewById<Button>(R.id.profilebtn)
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

        firebaseAuth= FirebaseAuth.getInstance()
        emailtext= findViewById(R.id.emailtext)
        passwordtext= findViewById(R.id.passwordtext)
        profilebtn= findViewById(R.id.profilebtn)

        profilebtn.setOnClickListener {
            val emailtext = emailtext.text.toString()
            val passwordtext = passwordtext.text.toString()

            loginpage(emailtext, passwordtext)
          }

    }
    private fun loginpage(emailtext: String, passwordtext: String) {
        firebaseAuth.signInWithEmailAndPassword(emailtext, passwordtext)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful)
                {
                    val intent = Intent(this@login, dashboard::class.java)
                    startActivity(intent)
                }
                 else
                {
                Toast.makeText(this@login, "User doesn't exist", Toast.LENGTH_SHORT).show()

                }
            }
    }
}