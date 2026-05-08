package com.example.atvdpesquisa_kotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.atvdpesquisa_kotlin.databinding.ItemFilmeBinding
import com.example.atvdpesquisa_kotlin.model.Filme

class FilmeAdapter(
    private val lista: MutableList<Filme>
) : RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder>() {

    inner class FilmeViewHolder(
        val binding: ItemFilmeBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmeViewHolder {

        val binding = ItemFilmeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return FilmeViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: FilmeViewHolder,
        position: Int
    ) {

        val filme = lista[position]

        holder.binding.txtTitulo.text =
            filme.titulo

        holder.binding.txtAno.text =
            "${filme.ano} • ${filme.genero}"

        holder.binding.btnFavorito.setImageResource(
            if (filme.favorito)
                android.R.drawable.btn_star_big_on
            else
                android.R.drawable.btn_star_big_off
        )

        // FAVORITAR
        holder.binding.btnFavorito.setOnClickListener {

            filme.favorito = !filme.favorito

            Toast.makeText(
                holder.itemView.context,
                if (filme.favorito)
                    "Adicionado aos favoritos"
                else
                    "Removido dos favoritos",
                Toast.LENGTH_SHORT
            ).show()

            notifyItemChanged(position)
        }

        // EXCLUIR
        holder.binding.btnExcluir.setOnClickListener {

            lista.removeAt(position)

            notifyItemRemoved(position)

            Toast.makeText(
                holder.itemView.context,
                "Filme removido",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount() = lista.size
}