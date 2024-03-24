package com.ayesha.i212457

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class recyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var name=findViewById<TextView>(R.id.nametext)
        var number=findViewById<TextView>(R.id.descptext)
        var email=findViewById<TextView>(R.id.statustext)
        var save=findViewById<Button>(R.id.close)

        name.text = intent.getStringExtra("name")
        number.text = intent.getStringExtra("desc")
        email.text = intent.getStringExtra("stat")

        var close = findViewById<TextView>(R.id.close)

        close.setOnClickListener {
            finish()
           }
    }

}