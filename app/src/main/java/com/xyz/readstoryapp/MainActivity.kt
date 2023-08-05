package com.xyz.readstoryapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.xyz.readstoryapp.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
        val btnstory1 = findViewById<CardView>(id.Intent1)
        val btnstory2 = findViewById<CardView>(id.Intent2)
        val btnstory3 = findViewById<CardView>(id.Intent3)
        val btnstory4 = findViewById<CardView>(id.Intent4)
        val btnstory5 = findViewById<CardView>(id.Intent5)
        btnstory1.setOnClickListener {
            val ca1 = Intent(applicationContext, ReadStory::class.java)
            ca1.putExtra("keystory", "storyA")
            startActivity(ca1)
        }
        btnstory2.setOnClickListener {
            val ca2 = Intent(applicationContext, ReadStory::class.java)
            ca2.putExtra("keystory", "storyB")
            startActivity(ca2)
        }
        btnstory3.setOnClickListener {
            val ca3 = Intent(applicationContext, ReadStory::class.java)
            ca3.putExtra("keystory", "storyC")
            startActivity(ca3)
        }
        btnstory4.setOnClickListener {
            val ca4 = Intent(applicationContext, ReadStory::class.java)
            ca4.putExtra("keystory", "storyD")
            startActivity(ca4)
        }
        btnstory5.setOnClickListener {
            val ca5 = Intent(applicationContext, ReadStory::class.java)
            ca5.putExtra("keystory", "storyE")
            startActivity(ca5)
        }
    }
}