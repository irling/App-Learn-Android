package com.example.exampleintent.Intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exampleintent.ExampleScreen
import com.example.exampleintent.R

class Explicit_Intent : AppCompatActivity() {

    private lateinit var btnExplitit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponet()
        exampleExplicitIntent()
    }

    private fun initComponet() {
        btnExplitit = findViewById(R.id.btnEjImplicit)
    }

    private fun exampleExplicitIntent() {
        val intentExplicit = Intent(this, ExampleScreen::class.java)
        startActivity(intentExplicit)
    }
}