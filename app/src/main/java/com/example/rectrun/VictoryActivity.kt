package com.example.rectrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VictoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_victory)
    }

    fun fullrestart(view: View) {
        val fullrestart = Intent(this, MainActivity::class.java)
        startActivity(fullrestart)
    }
}