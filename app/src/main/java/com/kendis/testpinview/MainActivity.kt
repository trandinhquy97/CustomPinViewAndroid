package com.kendis.testpinview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.kendis.pinview.CustomPinView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pinview = findViewById<CustomPinView>(R.id.pv)

        pinview.setOnCodeInputSatisfiedListener {
            Log.d("CUSTOMPINVIEW", "Satisfied $it")
        }
        pinview.setOnCodeInputCompleteListener {
            Log.d("CUSTOMPINVIEW", "Complete $it")
        }
        pinview.setOnActionDoneListener {
            Log.d("CUSTOMPINVIEW", "Done")
        }
    }
}