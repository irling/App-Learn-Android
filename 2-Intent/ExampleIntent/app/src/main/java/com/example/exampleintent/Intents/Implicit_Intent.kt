package com.example.exampleintent.Intents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exampleintent.R

class Implicit_Intent : AppCompatActivity() {

    private lateinit var btnImplicit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponents()
        exampleImplicitIntent()
    }

    private fun initComponents() {
        btnImplicit = findViewById(R.id.btnEjImplicit)
    }

    private fun exampleImplicitIntent() {
        val intentImplicit = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://www.google.com")
        }
    }
}