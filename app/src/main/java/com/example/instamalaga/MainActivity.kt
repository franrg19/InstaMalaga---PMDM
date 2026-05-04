package com.example.instamalaga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Lista de mis  imagenes

    private val imagenes = listOf(
        R.drawable.malaga1,
        R.drawable.malaga2,
        R.drawable.malaga3,
        R.drawable.malaga4,
        R.drawable.malaga5,
        R.drawable.malaga6,
        R.drawable.malaga7,
        R.drawable.malaga8,
    )

    //Titulo para cada foto

    private val titulos = listOf(
        "Espetos en una barca",
        "Balcón de Europa, Nerja",
        "Ronda",
        "Torcal de Antequera",
        "Desfiladero de los Gaitanes (caminito del rey)",
        "Plaza de toros La Malagueta",
        "torres galletas, Torcal",
        "Frigiliana pueblo"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //conectamos grid con adapter

        val gridview = findViewById<GridView>(R.id.gridViewFotos)
        val adapter = FotoAdapter(this,imagenes,titulos)
        gridview.adapter =adapter

        // Al pulsar una foto abrimos el detalle
        gridview.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetalleActivity::class.java)
            intent.putExtra("imagen", imagenes[position])
            intent.putExtra("titulo", titulos[position])
            startActivity(intent)
        }
        // Botón Acerca De
        val btnAcercaDe = findViewById<Button>(R.id.btnAcercaDe)
        btnAcercaDe.setOnClickListener {
            startActivity(Intent(this, AcercaDeActivity::class.java))
        }
    }
}