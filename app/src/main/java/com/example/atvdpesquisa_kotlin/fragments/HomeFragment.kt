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

    companion object {

        val listaFilmes = mutableListOf(
            Filme("Interestelar", 2014, "Ficção"),
            Filme("Batman", 2022, "Ação")
        )
    }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: FilmeAdapter

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

        adapter = FilmeAdapter(listaFilmes)

        binding.recyclerFilmes.layoutManager =
            LinearLayoutManager(requireContext())

        binding.recyclerFilmes.adapter = adapter

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        adapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("CICLO", "HomeFragment onDestroy")
    }
}