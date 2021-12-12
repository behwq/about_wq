package com.example.about

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_emailc.*
import java.lang.NullPointerException

class emailc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emailc)
        val sendmail: Button = findViewById(R.id.sendsend)
        val actionBar = supportActionBar

        actionBar!!.title = "Email"
        actionBar.setDisplayHomeAsUpEnabled(true)

        sendmail.setOnClickListener {

            val UserTo = editTo.text.toString().trim()
            val UserSub = editSub.text.toString().trim()
            val UserMe = editMe.text.toString().trim()

            sendEmail(UserTo, UserSub, UserMe)
        }
    }

    private fun sendEmail(UserTo:String,UserSub:String, UserMe:String){
        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data= Uri.parse("mailto:")
        mIntent.type="text/plain"
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(UserTo))
        mIntent.putExtra(Intent.EXTRA_SUBJECT, UserSub)
        mIntent.putExtra(Intent.EXTRA_TEXT, UserMe)

        try {
            startActivity(Intent.createChooser(mIntent,"Email sender ? "))
        }
        catch (e:Exception){
            Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
        }
    }
}