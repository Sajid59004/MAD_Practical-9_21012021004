package com.example.mad_practical_9_21012021004

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var imageAnimation : AnimationDrawable
    lateinit var logoimage:ImageView
    lateinit var logoanimation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        logoimage = findViewById(R.id.logo)
        logoimage.setBackgroundResource(R.drawable.logo_animation_list)
        imageAnimation = logoimage.background as AnimationDrawable

        logoanimation = AnimationUtils.loadAnimation(this, R.anim.twin_animation)
        logoanimation.setAnimationListener(this)
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus)
        {
            logoanimation.start()
            logoimage.startAnimation(logoanimation)
        }
        else
        {
            imageAnimation.stop()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {


    }

    override fun onAnimationEnd(p0: Animation?) {
        logoimage.setBackgroundResource(R.drawable.uvpce_logo)

    }
    override fun onAnimationRepeat(p0: Animation?) {

    }
}