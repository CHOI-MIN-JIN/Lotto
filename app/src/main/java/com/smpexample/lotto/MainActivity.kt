package com.smpexample.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardRandom)
        val cardConstell = findViewById<CardView>(R.id.cardConstell)
        val cardName = findViewById<CardView>(R.id.cardName)
        var intent : Intent

        cardRandom.setOnClickListener {
            intent = Intent(this@MainActivity, ResultActivity::class.java)
            startActivity(intent)
        }
        cardConstell.setOnClickListener {
            intent = Intent(this@MainActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }
        cardName.setOnClickListener {
            intent = Intent(this@MainActivity, NameActivity::class.java)
            startActivity(intent)
        }
    }
}