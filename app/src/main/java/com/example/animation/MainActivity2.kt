package com.example.animation

import android.os.Bundle
import com.example.animation.databinding.ActivityMain2Binding
import com.example.animation.ext.BaseActivity

class MainActivity2 : BaseActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgLotti.playAnimation()
        var count = 0

        binding.animationLotti.setOnClickListener {
            when(count % 2){
                0->{
                    binding.imgLotti.pauseAnimation()
                }
                1->{binding.imgLotti.playAnimation()}
            }
            count +=1
        }
    }
}