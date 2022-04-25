package com.example.evolutionoffindingviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife

class ButterknifeActivity : AppCompatActivity() {
    @BindView(R.id.btn_butter) lateinit var btn_butter: Button
    @BindView(R.id.tv_butter) lateinit var tv_butter: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ButterKnife.bind(this)
        setContentView(R.layout.activity_butterknife)
        initViews()
    }

    private fun initViews() {
        btn_butter.setOnClickListener {
            tv_butter.text = "Butter Knife"
        }
    }
}