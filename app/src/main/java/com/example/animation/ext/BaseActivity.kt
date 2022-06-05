package com.example.animation.ext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.animation.R

open class BaseActivity: AppCompatActivity() {

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransitionExit()
    }

    override fun finish() {
        super.finish()
        overridePendingTransitionExit()
    }

    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        overridePendingTransitionOpen()
    }

    private fun overridePendingTransitionOpen() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
    }

    private fun overridePendingTransitionExit() {
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}