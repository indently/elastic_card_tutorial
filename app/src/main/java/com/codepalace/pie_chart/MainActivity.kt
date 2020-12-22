package com.codepalace.pie_chart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.codepalace.pie_chart.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)


        binding.button1.setOnClickListener {
            Snackbar.make(binding.rlLayout, "Button tapped!", 2000).show()
        }
        binding.imageElasticView.setOnClickListener {
            Snackbar.make(binding.rlLayout, "CardView tapped!", 2000).show()
        }

    }

}