package com.example.atvdpesquisa_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.atvdpesquisa_kotlin.databinding.FragmentAddMovieBinding
import com.example.atvdpesquisa_kotlin.model.Filme

class AddMovieFragment : Fragment() {

    private lateinit var binding: FragmentAddMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentAddMovieBinding.inflate(inflater, container, false)

        binding.btnAdicionar.setOnClickListener {

            val titulo = binding.edtTitulo.text.toString()
            val ano = binding.edtAno.text.toString().toIntOrNull() ?: 0
            val genero = binding.edtGenero.text.toString()

            if (titulo.isNotEmpty() && genero.isNotEmpty()) {

                HomeFragment.listaFilmes.add(
                    Filme(titulo, ano, genero)
                )

                Toast.makeText(
                    requireContext(),
                    "Filme adicionado!",
                    Toast.LENGTH_SHORT
                ).show()

                binding.edtTitulo.text.clear()
                binding.edtAno.text.clear()
                binding.edtGenero.text.clear()
            }
        }

        return binding.root
    }
}