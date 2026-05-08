package com.example.atvdpesquisa_kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atvdpesquisa_kotlin.databinding.ItemFilmeBinding
import com.example.atvdpesquisa_kotlin.model.Filme

class FilmeAdapter(
    private val lista: List<Filme>
) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    inner class FilmeViewHolder(
        val binding: ItemFilmeBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {

        val binding = ItemFilmeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return FilmeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {

        val filme = lista[position]

        holder.binding.txtTitulo.text = filme.titulo
        holder.binding.txtAno.text = "${filme.ano} - ${filme.genero}"
    }

    override fun getItemCount() = lista.size
}