package com.example.myfirstappdevlopment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)

        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.result)

        btn.setOnClickListener {

            val s1 = et1.text.toString().toInt()
            val s2 = et2.text.toString().toInt()
            val s3 = et3.text.toString().toInt()

            val s1cg = s1 / 10.0
            val s2cg = s2 / 10.0
            val s3cg = s3 / 10.0

            val cgpa = (s1cg + s2cg + s3cg) / 3

            result.text = "CGPA: %.2f".format(cgpa)


        }
    }
}
