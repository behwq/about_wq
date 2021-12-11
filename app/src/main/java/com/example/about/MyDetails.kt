package com.example.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_details)

        val actionBar = supportActionBar

        actionBar!!.title="My Details"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}