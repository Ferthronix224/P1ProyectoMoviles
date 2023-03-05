package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController

class PrimerFragment : Fragment(R.layout.fragment_primer) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_navegar)
        val resultado = view.findViewById<TextView>(R.id.txt_output)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_primerFragment_to_segundoFragment)
        }
        setFragmentResultListener("requestKey") { key, bundle ->
            val result = bundle.getString("bundleKey")
            resultado.text = result
        }
    }
}