package com.example.about

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val about: Button = findViewById(R.id.aboutBtn)
        val my: Button = findViewById(R.id.myd)
        val update: Button = findViewById(R.id.up)
        val actionBar = supportActionBar

        actionBar!!.title="Setting"

        about.setOnClickListener() {
            val intent = Intent(this, com.example.about.about::class.java)
            startActivity(intent)
        }

        my.setOnClickListener() {
            val intent = Intent(this, MyDetails::class.java)
            startActivity(intent)
        }

        update.setOnClickListener() {
            val intent = Intent(this, com.example.about.update::class.java)
            startActivity(intent)
        }

    }
}