package com.example.about

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val eee: Button = findViewById(R.id.emailemail)
        val ttt: Button = findViewById(R.id.termBtn)
        val actionBar = supportActionBar

        actionBar!!.title="About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        eee.setOnClickListener() {
            val intent = Intent(this, com.example.about.emailc::class.java)
            startActivity(intent)
        }

        ttt.setOnClickListener(){
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.termsofusegenerator.net/live.php?token=56SWDt8rPJZrv6KP8OEfFwDQQsMdw9d3"))
            startActivity(browserIntent)
        }



    }


}