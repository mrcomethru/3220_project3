package com.example.a3220_project3

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import android.graphics.drawable.Drawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val imageView: ImageView = findViewById(R.id.imageView)

        // Scale the drawable for button1 programmatically
        val drawable: Drawable = ContextCompat.getDrawable(this, R.drawable.ic_bach)!!
        drawable.setBounds(0, 0, 60, 60) // Set the desired width and height
        button1.setCompoundDrawables(drawable, null, null, null)

        // Scale the drawable for button2 programmatically
        val drawable2: Drawable = ContextCompat.getDrawable(this, R.drawable.ic_mountain)!!
        drawable2.setBounds(0, 0, 60, 60) // Adjust size
        button2.setCompoundDrawables(drawable2, null, null, null)

        // Scale the drawable for button3 programmatically
        val drawable3: Drawable = ContextCompat.getDrawable(this, R.drawable.ic_city)!!
        drawable3.setBounds(0, 0, 60, 60) // Adjust size
        button3.setCompoundDrawables(drawable3, null, null, null)



        button1.setOnClickListener {
            fadeImage(imageView, R.drawable.beach)
        }

        button2.setOnClickListener {
            fadeImage(imageView, R.drawable.mountain)
        }

        button3.setOnClickListener {
            fadeImage(imageView, R.drawable.city)
        }
    }

    // Function to fade the image
    private fun fadeImage(imageView: ImageView, imageResId: Int) {
        // Fade out
        val fadeOut = AlphaAnimation(1f, 0f)
        fadeOut.duration = 500 // 500 ms fade out

        fadeOut.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {
                // Do nothing on animation start
            }

            override fun onAnimationEnd(animation: Animation?) {
                // Change the image after fade-out completes
                imageView.setImageResource(imageResId)

                // Fade in after changing the image
                val fadeIn = AlphaAnimation(0f, 1f)
                fadeIn.duration = 500 // 500 ms fade in
                imageView.startAnimation(fadeIn)
            }

            override fun onAnimationRepeat(animation: Animation?) {
                // Do nothing on animation repeat
            }
        })

        // Start fade-out animation
        imageView.startAnimation(fadeOut)
    }
}
