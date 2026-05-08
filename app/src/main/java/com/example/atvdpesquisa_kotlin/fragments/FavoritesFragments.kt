package com.example.atvdpesquisa_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.atvdpesquisa_kotlin.adapter.FilmeAdapter
import com.example.atvdpesquisa_kotlin.databinding.FragmentFavoritesBinding

class FavoritesFragments : Fragment() {

    private lateinit var binding: FragmentFavoritesBinding
    private lateinit var adapter: FilmeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFavoritesBinding.inflate(
            inflater,
            container,
            false
        )

        binding.recyclerFavoritos.layoutManager =
            LinearLayoutManager(requireContext())

        atualizarLista()

        return binding.root
    }

    override fun onResume() {
        super.onResume()

        atualizarLista()
    }

    private fun atualizarLista() {

        val favoritos =
            HomeFragment.listaFilmes.filter {
                it.favorito
            }

        adapter = FilmeAdapter(favoritos)

        binding.recyclerFavoritos.adapter =
            adapter
    }
}