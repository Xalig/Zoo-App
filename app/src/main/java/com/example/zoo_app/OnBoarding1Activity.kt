package com.example.zoo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding1.*

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)
        onboarding1button.setOnClickListener { openOnBoarding2() }
    }
    fun openOnBoarding2() {
        val intent = Intent(this, OnBoarding2Activity::class.java)
        startActivity(intent)
    }
}