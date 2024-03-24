package com.ayesha.i212457

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage


class EditProfile : AppCompatActivity() {

    var ddp:String?=null
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        var name=findViewById<EditText>(R.id.name)
        var email=findViewById<EditText>(R.id.email)
        var num=findViewById<EditText>(R.id.number)
        var save=findViewById<Button>(R.id.buttontwo)
        var dp=findViewById<ImageView>(R.id.dots)
        save.setOnClickListener {
            var model=modelone(name.text.toString(),email.text.toString(),num.text.toString(),ddp!!)
            var db= Firebase.database.getReference("Contacts")
            db.push().setValue(model)
                .addOnSuccessListener {
                    finish()
                }
                .addOnFailureListener {
                    Toast.makeText(this,"Failed to Add", Toast.LENGTH_LONG).show()
                }
        }
        //add runtime permission for storage'

        var pickImage=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result->
            if(result.resultCode== Activity.RESULT_OK && result.data?.data!=null){

                var img: Uri? =result.data?.data
                dp.setImageURI(img)

                var storageRef = FirebaseStorage.getInstance()
                var filename=System.currentTimeMillis().toString()+"dp.jpg"
                var ref=storageRef.getReference(filename)
                ref.putFile(img!!)
                    .addOnSuccessListener {
                        ref.downloadUrl
                            .addOnSuccessListener {
                                ddp=it.toString()
                            }
                    }
            }
        }
        dp.setOnClickListener {
            pickImage.launch(Intent(Intent.ACTION_PICK,
                MediaStore.Images.Media.INTERNAL_CONTENT_URI))
        }

        val fourthActButton = findViewById<ImageButton>(R.id.vec)
        fourthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
        val fifthActButton = findViewById<Button>(R.id.buttontwo)
        fifthActButton.setOnClickListener {
            val intent = Intent(this, myProfile::class.java)
            startActivity(intent)

        }
    }
}