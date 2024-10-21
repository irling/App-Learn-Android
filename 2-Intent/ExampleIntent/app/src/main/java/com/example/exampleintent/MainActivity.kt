package com.example.exampleintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exampleintent.Intents.Explicit_Intent
import com.example.exampleintent.Intents.Implicit_Intent

class MainActivity : AppCompatActivity() {

    private lateinit var btnImplicit: Button
    private lateinit var btnExplicit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initComponent()
        intentNavigation()
    }

    private fun initComponent() {
        btnImplicit = findViewById(R.id.btnImplicit)
        btnExplicit = findViewById(R.id.btnExplicit)
    }

    private fun intentNavigation() {
        btnImplicit.setOnClickListener {
            val pageImplicit = Intent(this, Implicit_Intent::class.java)
            startActivity(pageImplicit)
        }

        btnExplicit.setOnClickListener {
            val pageExplicit = Intent(this, Explicit_Intent::class.java)
            startActivity(pageExplicit)
        }
    }
}