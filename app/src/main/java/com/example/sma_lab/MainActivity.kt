package com.example.sma_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setDefaultText(view: View){

        val defaultText = DefaultTextHolder();

        val textView = findViewById<TextView>(R.id.helloWorldTW);
        textView.apply {
            text = defaultText.text;
        }

    }

    fun setNewText(view: View){

        val plainText = findViewById<TextView>(R.id.newTextInput);
        val newText = plainText.text.toString();

        val textView = findViewById<TextView>(R.id.helloWorldTW);
        textView.apply {
            text = newText;
        }

    }


}