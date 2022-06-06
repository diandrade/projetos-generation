package com.generation.activities_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo","onCreate")

        val buttonNext = findViewById<Button>(R.id.buttonNext)

        val intentSegunda = Intent(this, SegundaActivity::class.java)

        buttonNext.setOnClickListener{
            startActivity(intentSegunda)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo","onDestroy")
    }

}