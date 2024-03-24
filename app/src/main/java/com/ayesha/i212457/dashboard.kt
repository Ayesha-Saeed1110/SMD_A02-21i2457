package com.ayesha.i212457

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        val thirdActButton = findViewById<ImageButton>(R.id.search)
        thirdActButton.setOnClickListener {
            val intent = Intent(this, eighth::class.java)
            startActivity(intent)

        }
        val fourthActButton = findViewById<ImageButton>(R.id.chat)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, fourteenth::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<ImageButton>(R.id.profilebtn)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
        val sixthActButton = findViewById<ImageButton>(R.id.bell)
        sixthActButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)

        }
        val seventhActButton = findViewById<ImageButton>(R.id.jc)
        seventhActButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)

        }
        val eighthActButton = findViewById<Button>(R.id.button)
        eighthActButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)

        }

        val list=ArrayList<Model>()
        list.add(Model("Ali","2345678","Ali@gmail.com"))
        list.add(Model("Ifra","112234","Ifra54@gmail.com"))
        list.add(Model("Ayesha","998732","Ayesha112@hotmail.com"))
        list.add(Model("Sheza","112438","Sheza34@yahoo.com"))

        val adapter= MyAdapter(list, this)
        val rv=findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager= LinearLayoutManager(this)
        rv.adapter=adapter

        var add=findViewById<Button>(R.id.add)
        var resultLauncher=registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        {
            if(it.resultCode== Activity.RESULT_OK)
            {
                val data: Intent?=it.data
                val name=data?.getStringExtra("name")
                val phone=data?.getStringExtra("phone")
                val email=data?.getStringExtra("email")
                list.add(Model(name!!,phone!!,email!!))
                adapter.notifyDataSetChanged()
            }
        }

        add.setOnClickListener()
        {
            val intent= Intent(this, barwan::class.java)
            resultLauncher.launch(intent)
         }
    }
}