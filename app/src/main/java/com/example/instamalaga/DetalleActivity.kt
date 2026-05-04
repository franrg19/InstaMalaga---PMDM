package com.example.instamalaga

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        // Recibimos los datos enviados desde MainActivity
        val imagenId = intent.getIntExtra("imagen", 0)
        val titulo = intent.getStringExtra("titulo") ?: ""

        // Referencias a las vistas
        val imgDetalle = findViewById<ImageView>(R.id.imgDetalle)
        val txtTitulo = findViewById<TextView>(R.id.txtTituloDetalle)
        val txtDescripcion = findViewById<TextView>(R.id.txtDescripcion)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        // Asignamos los datos recibidos
        imgDetalle.setImageResource(imagenId)
        txtTitulo.text = titulo

        // Descripción según el título de la foto
        txtDescripcion.text = obtenerDescripcion(titulo)

        // Volver a la galería
        btnVolver.setOnClickListener {
            finish()
        }
    }

    // Devuelve una descripción según el título de la foto
    private fun obtenerDescripcion(titulo: String): String {
        return when (titulo) {
            "Espetos en una barca" -> "El espeto de sardinas es el plato más típico de Málaga, cocinado en barcas varadas en la playa."
            "Balcón de Europa, Nerja" -> "Mirador espectacular sobre el Mediterráneo en el municipio de Nerja, joya de la Costa del Sol."
            "Ronda" -> "Ciudad milenaria suspendida sobre el Tajo, famosa por su Puente Nuevo y su plaza de toros."
            "Torcal de Antequera" -> "Paraje natural único con formaciones rocosas kársticas de más de 150 millones de años."
            "Desfiladero de los Gaitanes (caminito del rey)" -> "Uno de los senderos más espectaculares de España, colgado sobre el desfiladero del río Guadalhorce."
            "Plaza de toros La Malagueta" -> "Plaza de toros histórica de Málaga, construida en 1876 y símbolo de la ciudad."
            "torres galletas, Torcal" -> "Formaciones rocosas con forma de torres en el Paraje Natural del Torcal de Antequera."
            "Frigiliana pueblo" -> "Uno de los pueblos más bonitos de España, con sus calles blancas y vistas al Mediterráneo."
            else -> "Un rincón especial de la provincia de Málaga."
        }
    }
}