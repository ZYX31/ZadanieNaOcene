package com.example.zadanienaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private var swipe = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Bprawo).setOnClickListener {
            swipe = if (swipe) {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.kapibar)
                true
            } else {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.zolw)
                false
            }
        }
        findViewById<Button>(R.id.Blewo).setOnClickListener {
            swipe = if (swipe) {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.zolw)
                false
            } else {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.kapibar)
                true
            }
        }
        }
    }
