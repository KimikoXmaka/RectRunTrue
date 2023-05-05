package com.example.rectrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
        fun levelone(view: View) {
            val levelone = Intent(this, LevelOneActivity::class.java)
            startActivity(levelone)
        }
    }