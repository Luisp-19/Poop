package com.example.poop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val EXTRA_MESSAGE= "Croc"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.welcome, Toast.LENGTH_SHORT).show()
        //Log.d("****TAG", "onCreate")
    }

    fun button1(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(editTextHello.text)
    }

    fun button2(view: View) {
        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)

        val intent = Intent(this, turd::class.java).apply{
            putExtra(EXTRA_MESSAGE, editTextHello.text.toString())
        }
        startActivity(intent)
    }

    

}