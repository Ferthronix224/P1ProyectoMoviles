package com.example.proyecto

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class CuartoFragment : Fragment(R.layout.fragment_cuarto) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_navegar)
        val button2 = view.findViewById<Button>(R.id.salir)

        button.setOnClickListener {
            val result = "Regreso del cuarto fragment"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            findNavController().navigate(R.id.action_cuartoFragment_to_primerFragment)
        }

        button2.setOnClickListener{
            System.exit(0)
        }
    }

}