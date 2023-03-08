package com.example.proyecto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class SeptimoFragment : Fragment(R.layout.fragment_septimo) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.back)
        button.setOnClickListener {
            val result = "Consultó Vulzanizadoras"
            setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            findNavController().navigate(R.id.action_septimoFragment_to_menuFragment)
        }
    }
}