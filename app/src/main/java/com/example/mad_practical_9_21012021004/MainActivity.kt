package com.mad_practical_9_21012021004

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mad_practical_9_21012021004.R

class MainActivity : AppCompatActivity() {
    lateinit var alarmanimation : AnimationDrawable
    lateinit var heartanimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val heart:ImageView=findViewById(R.id.image_heart)
        heart.setBackgroundResource(R.drawable.heart_animation_list)
        heartanimation=heart.background as AnimationDrawable

        val alarm : ImageView = findViewById(R.id.image_alarm)
        alarm.setBackgroundResource(R.drawable.alarm_animation_list)
        alarmanimation = alarm.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            alarmanimation.start()
            heartanimation.start()
        }
        else {
            alarmanimation.stop()
            heartanimation.stop()
        }
    }
}