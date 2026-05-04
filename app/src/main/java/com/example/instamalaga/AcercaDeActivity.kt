package com.example.instamalaga

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AcercaDeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        // Botón para volver a la galería
        val btnVolver = findViewById<Button>(R.id.btnVolverMain)
        btnVolver.setOnClickListener {
            finish()
        }
    }
}