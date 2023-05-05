package com.example.rectrun

import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class LevelThreeActivity : AppCompatActivity() {

    lateinit var draggableText: ImageView
    lateinit var draggableTextRect: Rect

    lateinit var detectableImage: ImageView
    lateinit var detectableImageRect: Rect

    lateinit var detectableImageTwo: ImageView
    lateinit var detectableImageTwoRect: Rect

    lateinit var detectableImageThree: ImageView
    lateinit var detectableImageThreeRect: Rect

    lateinit var detectableImageFour: ImageView
    lateinit var detectableImageFourRect: Rect

    lateinit var detectableImageFive: ImageView
    lateinit var detectableImageFiveRect: Rect

    lateinit var detectableImageSix: ImageView
    lateinit var detectableImageSixRect: Rect

    lateinit var detectablegoal: ImageView
    lateinit var detectablegoalRect: Rect

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_three)

        draggableText = findViewById(R.id.TextView3)
        detectableImage = findViewById(R.id.imageView10)
        detectableImageTwo = findViewById(R.id.imageView11)
        detectableImageThree = findViewById(R.id.imageView12)
        detectableImageFour = findViewById(R.id.imageView13)
        detectableImageFive = findViewById(R.id.imageView14)
        detectableImageSix = findViewById(R.id.imageView15)
        detectablegoal = findViewById(R.id.imageView16)

        detectablegoalRect = Rect(
            detectablegoal.x.toInt(),
            detectablegoal.y.toInt(),
            detectablegoal.x.toInt() + detectablegoal.width,
            detectablegoal.y.toInt() + detectablegoal.height)

        draggableTextRect = Rect(
            draggableText.x.toInt(),
            draggableText.y.toInt(),
            draggableText.x.toInt() + draggableText.width,
            draggableText.y.toInt() + draggableText.height)

        detectableImageRect = Rect(
            detectableImage.x.toInt(),
            detectableImage.y.toInt(),
            detectableImage.x.toInt() + detectableImage.width,
            detectableImage.y.toInt() + detectableImage.height)

        detectableImageTwoRect = Rect(
            detectableImageTwo.x.toInt(),
            detectableImageTwo.y.toInt(),
            detectableImageTwo.x.toInt() + detectableImageTwo.width,
            detectableImageTwo.y.toInt() + detectableImageTwo.height)

        detectableImageThreeRect = Rect(
            detectableImageThree.x.toInt(),
            detectableImageThree.y.toInt(),
            detectableImageThree.x.toInt() + detectableImageThree.width,
            detectableImageThree.y.toInt() + detectableImageThree.height)

        detectableImageFourRect = Rect(
            detectableImageFour.x.toInt(),
            detectableImageFour.y.toInt(),
            detectableImageFour.x.toInt() + detectableImageFour.width,
            detectableImageFour.y.toInt() + detectableImageFour.height)

        detectableImageFiveRect = Rect(
            detectableImageFive.x.toInt(),
            detectableImageFive.y.toInt(),
            detectableImageFive.x.toInt() + detectableImageFive.width,
            detectableImageFive.y.toInt() + detectableImageFive.height)

        detectableImageSixRect = Rect(
            detectableImageSix.x.toInt(),
            detectableImageSix.y.toInt(),
            detectableImageSix.x.toInt() + detectableImageSix.width,
            detectableImageSix.y.toInt() + detectableImageSix.height)

        var listener = View.OnTouchListener(function = { view, motionEvent ->

            if (motionEvent.action == MotionEvent.ACTION_MOVE) {

                detectablegoalRect = Rect(
                    detectablegoal.x.toInt(),
                    detectablegoal.y.toInt(),
                    detectablegoal.x.toInt() + detectablegoal.width,
                    detectablegoal.y.toInt() + detectablegoal.height)

                draggableTextRect = Rect(
                    draggableText.x.toInt(),
                    draggableText.y.toInt(),
                    draggableText.x.toInt() + draggableText.width,
                    draggableText.y.toInt() + draggableText.height)

                detectableImageRect = Rect(
                    detectableImage.x.toInt(),
                    detectableImage.y.toInt(),
                    detectableImage.x.toInt() + detectableImage.width,
                    detectableImage.y.toInt() + detectableImage.height)

                detectableImageTwoRect = Rect(
                    detectableImageTwo.x.toInt(),
                    detectableImageTwo.y.toInt(),
                    detectableImageTwo.x.toInt() + detectableImageTwo.width,
                    detectableImageTwo.y.toInt() + detectableImageTwo.height)

                detectableImageThreeRect = Rect(
                    detectableImageThree.x.toInt(),
                    detectableImageThree.y.toInt(),
                    detectableImageThree.x.toInt() + detectableImageThree.width,
                    detectableImageThree.y.toInt() + detectableImageThree.height)

                detectableImageFourRect = Rect(
                    detectableImageFour.x.toInt(),
                    detectableImageFour.y.toInt(),
                    detectableImageFour.x.toInt() + detectableImageFour.width,
                    detectableImageFour.y.toInt() + detectableImageFour.height)

                detectableImageFiveRect = Rect(
                    detectableImageFive.x.toInt(),
                    detectableImageFive.y.toInt(),
                    detectableImageFive.x.toInt() + detectableImageFive.width,
                    detectableImageFive.y.toInt() + detectableImageFive.height)

                detectableImageSixRect = Rect(
                    detectableImageSix.x.toInt(),
                    detectableImageSix.y.toInt(),
                    detectableImageSix.x.toInt() + detectableImageSix.width,
                    detectableImageSix.y.toInt() + detectableImageSix.height)



                view.y = motionEvent.rawY - view.height * 5
                view.x = motionEvent.rawX - view.width / 2

                if (draggableTextRect.intersect(detectableImageRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageTwoRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageThreeRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageFourRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageFiveRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectableImageSixRect)) {
                    val intent = Intent(this, GameOverThreeActivity::class.java)
                    startActivity(intent)
                }
                if (draggableTextRect.intersect(detectablegoalRect)) {
                    val levelup = Intent(this, VictoryActivity::class.java)
                    startActivity(levelup)
                }
            }
            true
        })
        draggableText.setOnTouchListener(listener)
    }
}
