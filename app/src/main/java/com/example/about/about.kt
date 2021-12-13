package com.example.about

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

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
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.setType("text/plain")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "wecare@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "WeCare Apps")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "We are here for you. ")

            startActivity(Intent.createChooser(emailIntent, "Send Email"))

            if (emailIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(emailIntent)
            } else {
                Toast.makeText(this, "There is no application that support this action",
                    Toast.LENGTH_SHORT).show();
            }
        }
            /*startActivity(Intent.createChooser(intent, "Send Email"))
            val intent = Intent(this, com.example.about.emailc::class.java)
            startActivity(intent)*/

        ttt.setOnClickListener(){
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.termsofusegenerator.net/live.php?token=56SWDt8rPJZrv6KP8OEfFwDQQsMdw9d3"))
            startActivity(browserIntent)
        }



    }


}