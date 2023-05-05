package com.example.rectrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GameOverTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over_two)
    }

    fun Tworestart(view: View) {
        val back = Intent(this, LevelTwoActivity::class.java)
        startActivity(back)
    }
}