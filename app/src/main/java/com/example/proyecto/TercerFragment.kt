package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class TercerFragment : Fragment(R.layout.fragment_tercer) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_navegar)

        button.setOnClickListener {
            findNavController().navigate(R.id.action_tercerFragment_to_cuartoFragment)
        }
    }

}