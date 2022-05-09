package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val imageButton3 = findViewById<ImageButton>(R.id.imageButton3)

        button.setOnClickListener{
         callActivity()
        }
        imageButton3.setOnClickListener{
            callActivity()
        }
    }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.etName)
        val message = editText.text.toString()

        val intent = Intent(this, MainActivity2::class.java).also {
            it.putExtra("EXTRA_MESSAGE",message)
            startActivity(it)
        }
        }
}