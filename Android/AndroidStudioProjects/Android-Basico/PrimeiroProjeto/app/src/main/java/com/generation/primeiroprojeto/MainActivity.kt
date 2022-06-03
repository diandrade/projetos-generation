package com.generation.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//buttonD20,buttonD12,numberD20,numberD12

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.diceapp)

        val buttonD20 = findViewById<Button>(R.id.buttonD20)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD20.setOnClickListener() {
            rolarDados20(20)
        }
        buttonD12.setOnClickListener() {
            rolarDados12(12)
        }
        buttonD6.setOnClickListener() {
            rolarDados6(6)
        }
    }

    private fun rolarDados20(lados:Int){
        val rolagem = (1..lados).random()

        val numberD20 = findViewById<TextView>(R.id.number)

        numberD20.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageDados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.color_1)
            2 -> image.setImageResource(R.drawable.color_2)
            3 -> image.setImageResource(R.drawable.color_3)
            4 -> image.setImageResource(R.drawable.color_4)
            5 -> image.setImageResource(R.drawable.color_5)
            6 -> image.setImageResource(R.drawable.color_6)
            7 -> image.setImageResource(R.drawable.color_7)
            8 -> image.setImageResource(R.drawable.color_8)
            9 -> image.setImageResource(R.drawable.color_9)
            10 -> image.setImageResource(R.drawable.color_10)
            11 -> image.setImageResource(R.drawable.color_11)
            12 -> image.setImageResource(R.drawable.color_12)
            13 -> image.setImageResource(R.drawable.color_13)
            14 -> image.setImageResource(R.drawable.color_14)
            15 -> image.setImageResource(R.drawable.color_15)
            16 -> image.setImageResource(R.drawable.color_16)
            17 -> image.setImageResource(R.drawable.color_17)
            18 -> image.setImageResource(R.drawable.color_18)
            19 -> image.setImageResource(R.drawable.color_19)
            20 -> image.setImageResource(R.drawable.color_20)
        }
    }

    private fun rolarDados12(lados:Int){
        val rolagem = (1..lados).random()

        val numberD12 = findViewById<TextView>(R.id.number)

        numberD12.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageDados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.color_1)
            2 -> image.setImageResource(R.drawable.color_2)
            3 -> image.setImageResource(R.drawable.color_3)
            4 -> image.setImageResource(R.drawable.color_4)
            5 -> image.setImageResource(R.drawable.color_5)
            6 -> image.setImageResource(R.drawable.color_6)
            7 -> image.setImageResource(R.drawable.color_7)
            8 -> image.setImageResource(R.drawable.color_8)
            9 -> image.setImageResource(R.drawable.color_9)
            10 -> image.setImageResource(R.drawable.color_10)
            11 -> image.setImageResource(R.drawable.color_11)
            12 -> image.setImageResource(R.drawable.color_12)
        }
    }

    private fun rolarDados6(lados:Int){
        val rolagem = (1..lados).random()

        val numberD6 = findViewById<TextView>(R.id.number)

        numberD6.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imageDados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.color_1)
            2 -> image.setImageResource(R.drawable.color_2)
            3 -> image.setImageResource(R.drawable.color_3)
            4 -> image.setImageResource(R.drawable.color_4)
            5 -> image.setImageResource(R.drawable.color_5)
            6 -> image.setImageResource(R.drawable.color_6)
        }
    }
}