package com.example.prathamesh.kotlinfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {


    //Views
    private lateinit var buttonAdd: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonMultiply: Button
    private lateinit var buttonDivide: Button
    private lateinit var editTextNo1: EditText
    private lateinit var editTextNo2: EditText
    private lateinit var textViewAns: TextView

    //Variables
    var no1 : Double = 0.0
    var no2 : Double = 0.0
    var ans : Double = 0.0
    var result : String =" "
    var operator: String =""





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd = findViewById(R.id.buttonAdd)
        buttonMinus = findViewById(R.id.buttonMinus)
        buttonMultiply = findViewById(R.id.buttonMultiply)
        buttonDivide = findViewById(R.id.buttonDivide)
        editTextNo1 = findViewById(R.id.editTextNo1)
        editTextNo2 = findViewById(R.id.editTextNo2)
        textViewAns = findViewById(R.id.textViewAns)

        buttonAdd.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)
        buttonMultiply.setOnClickListener(this)
        buttonDivide.setOnClickListener(this)



    }
    override fun onClick(p0: View?)
    {
        var s1: String = editTextNo1.text.toString();
        var s2: String = editTextNo2.text.toString();

        no1 = s1.toDouble()
        no2 = s2.toDouble()


        when(p0?.id)
        {
            R.id.buttonAdd -> {
                ans = no1 + no2
                operator="+"

            }
            R.id.buttonMinus -> {
                ans = no1 - no2
                operator="-"
            }
            R.id.buttonMultiply -> {
                ans = no1 * no2
                operator="*"
            }
            R.id.buttonDivide -> {
                ans = no1 / no2
                operator="/"
            }
        }
        result = ans.toString()
        textViewAns.setText(s1+""+operator+""+s2 +" =" +result)


    }
}
