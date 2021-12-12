package com.example.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.database.DatabaseReference
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_update.*

class update : AppCompatActivity() {

  //  private lateinit var auth : FirebaseAuthException
    private lateinit var database: DatabaseReference

  //  database = Firebase.database.reference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)
        val updatelo: Button = findViewById(R.id.upBtn)
        val actionBar = supportActionBar

        actionBar!!.title="Update Password"
        actionBar.setDisplayHomeAsUpEnabled(true)


        updatelo.setOnClickListener(){
            uppassuppass()
        }
    }
    private fun uppassuppass(){
        if (currentpass.text.isNotEmpty() && newpass.text.isNotEmpty() && confirmpass.text.isNotEmpty()){
            if (newpass.text.toString()== currentpass.text.toString()){
    //            val user =auth.currentUser
            }
            else{
                Toast.makeText(this,"Password Does Not Match",Toast.LENGTH_SHORT).show()

            }
        }
        else{
            Toast.makeText(this,"Please fill out all the fields",Toast.LENGTH_SHORT).show()
        }

    }
}