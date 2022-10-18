package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var resultText = ""
    var firstNum = ""
    var operator = ""


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun numberClick(view: View){
        var result = findViewById<TextView>(R.id.resultText)
        if (view is Button){
            var plusText = resultText + view.text.toString()
            resultText = plusText

            if(plusText == "0"){
                resultText = ""
            }

            result.text = plusText

        }
    }

    fun operatorClick(view: View){
        var result = findViewById<TextView>(R.id.resultText)
        if(view is Button){
            firstNum = result.text.toString()
            operator = view.text.toString()
            result.text = ""
            resultText = ""

        }
    }

    fun showResult (view: View){
        var result = findViewById<TextView>(R.id.resultText)

        var secondNum = result.text
        if (view is Button){
            when(operator){
                "+" -> result.text = (firstNum.toString().toFloat() + secondNum.toString().toFloat()).toString()
                "-" -> result.text = (firstNum.toString().toFloat() - secondNum.toString().toFloat()).toString()
                "*" -> result.text = (firstNum.toString().toFloat() * secondNum.toString().toFloat()).toString()
                "/" -> result.text = (firstNum.toString().toFloat() / secondNum.toString().toFloat()).toString()
                else -> "NoN"
            }

        }
    }

    fun clear (view: View){
        var result = findViewById<TextView>(R.id.resultText)
        if (view is Button){
            result.text = ""
            resultText = ""
        }
    }
}