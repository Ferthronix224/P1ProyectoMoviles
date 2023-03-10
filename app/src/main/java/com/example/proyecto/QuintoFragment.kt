package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class QuintoFragment : Fragment(R.layout.fragment_quinto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.back)
        button.setOnClickListener {
            val result = "Consultó Mantenimiento"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            findNavController().navigate(R.id.action_quintoFragment_to_menuFragment)
        }
    }
}