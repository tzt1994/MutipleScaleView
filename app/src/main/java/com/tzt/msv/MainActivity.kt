package com.tzt.msv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scale1.mUnitValue = 2f

        scale2.setOnValueChangedListener{
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
    }
}