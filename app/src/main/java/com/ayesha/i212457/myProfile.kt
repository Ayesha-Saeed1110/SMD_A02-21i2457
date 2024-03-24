package com.ayesha.i212457

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.database

class myProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        val rvv=findViewById<RecyclerView>(R.id.rvv)
        val add=findViewById<Button>(R.id.button)

        add.setOnClickListener {
            var i=Intent(this, EditProfile::class.java)
            startActivity(i)
        }

        val list=ArrayList<modelone>()
        var db= com.google.firebase.Firebase.database.getReference().child("Login")
        db.addChildEventListener(object : com.google.firebase.database.ChildEventListener{
            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                var modelone=snapshot.getValue(modelone::class.java)
                list.add(modelone!!)
                val adapter=myAdap(list,this@myProfile)
                rvv.adapter=adapter
                rvv.layoutManager= LinearLayoutManager(this@myProfile)
            }

            override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {

            }

            override fun onChildRemoved(snapshot: DataSnapshot) {

            }

            override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {

            }

            override fun onCancelled(error: DatabaseError) {

              }
})

        val thirdActButton = findViewById<ImageButton>(R.id.bbone)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.home)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<ImageButton>(R.id.search)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, eighth::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.chat)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<Button>(R.id.booksession)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, bookedsession::class.java)
            startActivity(intent)

        }
        val eighthActButton = findViewById<Button>(R.id.button)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, EditProfile::class.java)
            startActivity(intent)

        }

    }
}