package com.example.rectrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GameOverThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over_three)
    }

    fun Threerestart(view: View) {
        val back = Intent(this, LevelThreeActivity::class.java)
        startActivity(back)
    }
}