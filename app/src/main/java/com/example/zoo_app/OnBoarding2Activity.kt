package com.example.zoo_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding1.*
import kotlinx.android.synthetic.main.activity_onboarding2.*

class OnBoarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)
//        onboarding2button.setOnClickListener { openOnBoarding3() }
    }
//    fun openOnBoarding3() {
//        val intent = Intent(this, OnBoarding3Activity::class.java)
//        startActivity(intent)
//    }
}