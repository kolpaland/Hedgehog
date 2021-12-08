package com.example.hedgehog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val buttonBack = findViewById<ImageButton>(R.id.imageButton3)
        buttonBack.setOnClickListener {
            val intent = Intent(this, FirstPage::class.java)
            startActivity(intent)
        }

        val buttonNext = findViewById<ImageButton>(R.id.imageButton2)
        buttonNext.setOnClickListener {
            val intent = Intent(this, ThirdPage::class.java)
            startActivity(intent)
        }
    }
}