package com.ebookfrenzy.tipcalculatorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.ebookfrenzy.tipcalculatorproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Amount = findViewById<EditText>(R.id.billAmount)
        val calculateBtn = findViewById<Button>(R.id.tipBtn)
        val DisplayTip = findViewById<TextView>(R.id.output)

        calculateBtn.setOnClickListener {
            calculateTip()


    val stringInTextField = R.id.billAmount.toString()
    val input = stringInTextField.toDouble()
    fun calculateTip() {

            "mm"+R.id.billAmount -> 0.02


        else -> {"YOU MUST ENTER A BILL AMOUNT"}
    }
       }
       val tipPercentage = when (Amount) {
          R.id.tipBtn -> 0.02
          0.10 -> "10%"
           else -> {
             println("15%")
          }
       }}
   }

