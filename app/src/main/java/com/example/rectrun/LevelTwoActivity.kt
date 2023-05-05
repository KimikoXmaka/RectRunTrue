package com.example.rectrun

import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class LevelTwoActivity : AppCompatActivity() {

    lateinit var draggableText: ImageView
    lateinit var draggableTextRect: Rect

    lateinit var detectableImage: ImageView
    lateinit var detectableImageRect: Rect

    lateinit var detectableImageTwo: ImageView
    lateinit var detectableImageRectTwo: Rect

    lateinit var detectableImageThree: ImageView
    lateinit var detectableImageRectThree: Rect

    lateinit var detectablegoal: ImageView
    lateinit var detectablegoalrect: Rect

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_two)

        draggableText = findViewById(R.id.TextView1)
        detectableImage = findViewById(R.id.imageView6)
        detectableImageTwo = findViewById(R.id.imageView7)
        detectableImageThree = findViewById(R.id.imageView8)
        detectablegoal = findViewById(R.id.imageView9)

        detectablegoalrect = Rect(
            detectablegoal.x.toInt(),
            detectablegoal.y.toInt(),
            detectablegoal.x.toInt() + detectablegoal.width,
            detectablegoal.y.toInt() + detectablegoal.height
        )

        detectableImageRectThree = Rect(
            detectableImageThree.x.toInt(),
            detectableImageThree.y.toInt(),
            detectableImageThree.x.toInt() + detectableImageThree.width,
            detectableImageThree.y.toInt() + detectableImageThree.height
        )

        detectableImageRectTwo = Rect(
            detectableImageTwo.x.toInt(),
            detectableImageTwo.y.toInt(),
            detectableImageTwo.x.toInt() + detectableImageTwo.width,
            detectableImageTwo.y.toInt() + detectableImageTwo.height
        )

        draggableTextRect = Rect(
            draggableText.x.toInt(),
            draggableText.y.toInt(),
            draggableText.x.toInt() + draggableText.width,
            draggableText.y.toInt() + draggableText.height
        )

        detectableImageRect = Rect(
            detectableImage.x.toInt(),
            detectableImage.y.toInt(),
            detectableImage.x.toInt() + detectableImage.width,
            detectableImage.y.toInt() + detectableImage.height
        )

        var listener = View.OnTouchListener(function = { view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                detectablegoalrect = Rect(
                    detectablegoal.x.toInt(),
                    detectablegoal.y.toInt(),
                    detectablegoal.x.toInt() + detectablegoal.width,
                    detectablegoal.y.toInt() + detectablegoal.height
                )

                detectableImageRectThree = Rect(
                    detectableImageThree.x.toInt(),
                    detectableImageThree.y.toInt(),
                    detectableImageThree.x.toInt() + detectableImageThree.width,
                    detectableImageThree.y.toInt() + detectableImageThree.height
                )

                detectableImageRectTwo = Rect(
                    detectableImageTwo.x.toInt(),
                    detectableImageTwo.y.toInt(),
                    detectableImageTwo.x.toInt() + detectableImageTwo.width,
                    detectableImageTwo.y.toInt() + detectableImageTwo.height
                )

                draggableTextRect = Rect(
                    draggableText.x.toInt(),
                    draggableText.y.toInt(),
                    draggableText.x.toInt() + draggableText.width,
                    draggableText.y.toInt() + draggableText.height
                )

                detectableImageRect = Rect(
                    detectableImage.x.toInt(),
                    detectableImage.y.toInt(),
                    detectableImage.x.toInt() + detectableImage.width,
                    detectableImage.y.toInt() + detectableImage.height
                )


                view.y = motionEvent.rawY - view.height * 5
                view.x = motionEvent.rawX - view.width / 2

                if (draggableTextRect.intersect(detectableImageRect)) {
                    val intent = Intent(this, GameOverTwoActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageRectTwo)) {
                    val intent = Intent(this, GameOverTwoActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageRectThree)) {
                    val intent = Intent(this, GameOverTwoActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectablegoalrect)) {
                    val next = Intent(this, LevelThreeActivity::class.java)
                    startActivity(next)
                }
            }
            true
        })
        draggableText.setOnTouchListener(listener)
    }
}