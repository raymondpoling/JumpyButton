package com.americanairlines.customviewsandanimations.view.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.util.Log
import android.view.View
import java.util.*

class RoundedButton(context: Context, attributeSet: AttributeSet?): View(context, attributeSet) {
    //Popular interview question - How do I create a customView
    //Answer: Extend from the view class and override the onDraw method

    constructor(context: Context): this(context, null)

    private var paint: Paint = Paint()


    val circleRadius = 100f
    val circleColor = Color.BLACK

    var buttonText = "Start"

    var midX = 0.5f
    var midY = 0.5f

    var incX = 0
    var incY = 0

    var speedX= 10
    var speedY= 10

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        midX = width/2.toFloat() + incX
        midY = height/2.toFloat() + incY

        paint.color = Color.BLACK
        // draw the circle
        canvas.drawCircle(midX, midY, circleRadius, paint)

        // update the logic for the circle AFTER drawing it

        if(midX + circleRadius > canvas.width || midX - circleRadius < 0) {
            speedX *= - 1
        }

        if(midY + circleRadius > height || midY + circleRadius < 0)
            speedY *= -1

        incX += speedX
        incY += speedY


        paint.color = Color.CYAN
        paint.textSize = 40f

        val rect = Rect()
        paint.getTextBounds(buttonText, 0, buttonText.length, rect)

        canvas.drawText(buttonText, midX- rect.width()/2, midY + rect.height()/2, paint)

        invalidate()


    }
}













