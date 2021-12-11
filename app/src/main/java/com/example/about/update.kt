package com.example.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class update : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update)

        val actionBar = supportActionBar

        actionBar!!.title="Update Password"
        actionBar.setDisplayHomeAsUpEnabled(true)

    }
}