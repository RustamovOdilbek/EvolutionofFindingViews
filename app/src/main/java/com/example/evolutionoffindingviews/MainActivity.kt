package com.example.evolutionoffindingviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_butterknife: Button
    lateinit var btn_kotlin_synthetics: Button
    lateinit var btn_view_binding: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btn_butterknife = findViewById(R.id.btn_butterknife)
        btn_kotlin_synthetics = findViewById(R.id.btn_kotlin_synthetics)
        btn_view_binding = findViewById(R.id.btn_view_binding)

        btn_butterknife.setOnClickListener { callButterknifeActivity() }

        btn_kotlin_synthetics.setOnClickListener { callKotlinSyntheticsActivity() }

        btn_view_binding.setOnClickListener { callViewBindingActivity() }
    }

    private fun callViewBindingActivity() {
        val intent = Intent(this, ViewBindingActivity::class.java)
        startActivity(intent)
    }

    private fun callKotlinSyntheticsActivity() {
        val intent = Intent(this, KotlinSyntheticsActivity::class.java)
        startActivity(intent)
    }

    private fun callButterknifeActivity() {
        val intent = Intent(this, ButterknifeActivity::class.java)
        startActivity(intent)
    }
}