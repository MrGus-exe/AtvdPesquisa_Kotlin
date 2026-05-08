package com.example.atvdpesquisa_kotlin.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atvdpesquisa_kotlin.adapter.FilmeAdapter
import com.example.atvdpesquisa_kotlin.databinding.FragmentHomeBinding
import com.example.atvdpesquisa_kotlin.model.Filme

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("CICLO", "HomeFragment onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val listaFilmes = listOf(

            Filme("Interestelar", 2014, "Ficção"),
            Filme("Batman", 2022, "Ação"),
            Filme("Corra", 2017, "Terror")
        )

        binding.recyclerFilmes.layoutManager =
            LinearLayoutManager(requireContext())

        binding.recyclerFilmes.adapter =
            FilmeAdapter(listaFilmes)

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("CICLO", "HomeFragment onDestroy")
    }
}