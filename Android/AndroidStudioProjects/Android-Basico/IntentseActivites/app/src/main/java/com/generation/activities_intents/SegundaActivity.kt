package com.generation.activities_intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.generation.activities_intents.R.id.buttonVoltar

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}