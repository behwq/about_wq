package com.example.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import com.example.about.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        /*setContentView(R.layout.activity_main)
        val about: TextView = findViewById(R.id.aboutBtn)
        val my: TextView = findViewById(R.id.myd)
        val update: TextView = findViewById(R.id.up)
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
        }*/

    }

    fun setActionBarTitle(title: String?) {
        supportActionBar!!.title = title
    }
}