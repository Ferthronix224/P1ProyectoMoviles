package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val txtMensaje = view.findViewById<TextView>(R.id.mensaje)
        val btnMedicos = view.findViewById<Button>(R.id.servicios_medicos)
        val btnPolicia = view.findViewById<Button>(R.id.policia)
        val btnRestaurantes = view.findViewById<Button>(R.id.restaurantes)
        val btnGasolineras = view.findViewById<Button>(R.id.gasolineras)
        val btnMantenimiento = view.findViewById<Button>(R.id.mantenimiento)
        val btnLimpieza = view.findViewById<Button>(R.id.limpieza)
        val btnVulcanizadoras = view.findViewById<Button>(R.id.vulcanizadora)
        val btnFerreterias = view.findViewById<Button>(R.id.ferreterias)
        val btnSalir = view.findViewById<Button>(R.id.salir)

        btnMedicos.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_primerFragment)
        }

        btnPolicia.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_segundoFragment)
        }

        btnRestaurantes.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_tercerFragment)
        }

        btnGasolineras.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_cuartoFragment)
        }

        btnMantenimiento.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_quintoFragment)
        }

        btnLimpieza.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_sextoFragment)
        }

        btnVulcanizadoras.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_septimoFragment)
        }

        btnFerreterias.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_octavoFragment)
        }

        btnSalir.setOnClickListener {
            System.exit(0)
        }

        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("bundleKey")
            txtMensaje.text = result
        }
    }
}