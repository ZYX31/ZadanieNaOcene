package com.example.zadanienaocene

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var swipe = true
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val silniaRun = findViewById<Button>(R.id.Silniarun)
        val silniaInput = findViewById<EditText>(R.id.Silnia)

        silniaRun.setOnClickListener{
            val inputint = silniaInput.text.toString().toInt()
            var liczbaZSilnia=1
            if(inputint==0 || inputint==1){
                liczbaZSilnia=1
            }
            else{
                for(i in 2 .. inputint)
                    liczbaZSilnia *= i
            }
            val text=liczbaZSilnia.toString()
            findViewById<TextView>(R.id.SilniaOut).text=(text)
        }

        findViewById<Button>(R.id.Bprawo).setOnClickListener {
            swipe = if (swipe) {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.kapibar)
                false
            } else {
                findViewById<ImageView>(R.id.Frogas).setImageResource(R.drawable.zolw)
                true
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
