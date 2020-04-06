package com.example.practiceapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val innerCircle = findViewById<CircleSeekBar>(R.id.inner_circle)
        innerCircle.curProcess = 1

        //kajal
        innerCircle.maxProcess = 5
        //kajal

        innerCircle.reachedColor = resources.getColor(R.color.green_color)
        innerCircle.unreachedColor = resources.getColor(R.color.diff_circle_color)

        val outerCircle = findViewById<CircleSeekBar>(R.id.outer_circle)
        outerCircle.curProcess = 4

        //kajal
        outerCircle.maxProcess = 8
        //kajal

        outerCircle.reachedColor = resources.getColor(R.color.def_reached_color)
        outerCircle.unreachedColor = resources.getColor(R.color.diff_circle_color)

    }
}
