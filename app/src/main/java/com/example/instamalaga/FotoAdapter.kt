package com.example.instamalaga

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class FotoAdapter (
    private val context: Context,
    private val imagenes: List<Int>,      // IDs de los drawables
    private val titulos: List<String>     // Títulos de cada foto
) : BaseAdapter () {

    override fun getCount(): Int=imagenes.size
    override fun getItem(position: Int): Any = imagenes[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_foto,parent,false)

        val imgFoto = view.findViewById<ImageView>(R.id.imgFoto)
        val txtTitulo = view.findViewById<TextView>(R.id.txtTitulo)

        imgFoto.setImageResource(imagenes[position])
        txtTitulo.text =titulos[position]

        return view
    }
    }
