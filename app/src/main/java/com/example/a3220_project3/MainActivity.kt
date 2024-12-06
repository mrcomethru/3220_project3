package com.example.a3220_project3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val imageView: ImageView = findViewById(R.id.imageView)

        button1.setOnClickListener {
            imageView.setImageResource(R.drawable.vlc)
        }

        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.alien)
        }

        button3.setOnClickListener {
            imageView.setImageResource(R.drawable.dude)
        }
    }
}