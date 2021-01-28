package com.americanairlines.customviewsandanimations.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.americanairlines.customviewsandanimations.R
import com.americanairlines.customviewsandanimations.view.customview.RoundedButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = RoundedButton(this)
        setContentView(view)
    }
}