package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.view.animation.*
import com.example.animation.databinding.ActivityMainBinding
import com.example.animation.ext.BaseActivity

class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationAlpha.setOnClickListener {
            val anim = AlphaAnimation(0.5f, 0f)

            anim.duration = 2000
            anim.repeatCount = 4
            anim.repeatMode = Animation.REVERSE
            anim.fillAfter = true
            anim.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {

                }

                override fun onAnimationRepeat(animation: Animation?) {

                }

            })

            binding.imgAnim.startAnimation(anim)
        }

        binding.animationScale.setOnClickListener {
            val anim = ScaleAnimation(
                1f, 2f, 1f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            )

            anim.duration = 3000
            anim.fillAfter = true

            binding.imgAnim.startAnimation(anim)
        }

        binding.animationTranslate.setOnClickListener {
            val anim = TranslateAnimation(0f, 200f, 0f, 500f)
            anim.duration = 10000
            anim.fillAfter = true

            anim.interpolator = CycleInterpolator(2.25f)

            binding.imgAnim.startAnimation(anim)
        }

        binding.animationRotate.setOnClickListener {
            val anim = RotateAnimation(
                0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            )
            anim.duration = 5000
            anim.fillAfter = true
            anim.repeatCount = 5

            binding.imgAnim.startAnimation(anim)
        }

        binding.animationSet.setOnClickListener {
            val anim1 = ScaleAnimation(
                1f, 2f, 1f, 1.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            )

            anim1.duration = 3000

            val anim2 = RotateAnimation(
                0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f
            )
            anim2.duration = 5000
            anim2.repeatCount = 1

            val anim = AnimationSet(true)
            anim.addAnimation(anim1)
            anim.addAnimation(anim2)
            anim.fillAfter = true

            binding.imgAnim.startAnimation(anim)

        }

        binding.animationActivity.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}