package com.example.practice_design.customContact

import com.example.practice_design.domain.Person
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practice_design.databinding.ItemHolderBinding

class ContactAdapter(contex:Context): ListAdapter<Person, ContactAdapter.ViewHolder>(DiffUtilCallback) {
    private val adapterContext = contex

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var item = ItemHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bind(getItem(position), position)
    }

    //item holder: puede ser cualquier xml donde se quiera ponder los datos a partir del recycler
    inner class ViewHolder(private val binding: ItemHolderBinding): RecyclerView.ViewHolder(binding.root) {

        //Con esta funcion hacemos binding a cada holder por item de la lista
        fun bind(item: Person, position: Int) {
            binding.name.text = item.name
            Glide.with(adapterContext).load(item.pic).into(binding.circleImage)

            binding.check.setOnClickListener {
                Toast.makeText(adapterContext, "${item.name}", Toast.LENGTH_SHORT).show()
            }
            binding.delete.setOnClickListener {
                Toast.makeText(adapterContext, "${item.name}" + " Cancel", Toast.LENGTH_SHORT).show()
            }
            binding.cardBinding.setOnClickListener {

            }
        }
    }

    //Estos métodos no se ocupan pero son obligatorios para que el adapter funcione correctamente
    private object DiffUtilCallback:DiffUtil.ItemCallback<Person>() {
        override fun areContentsTheSame(oldItem: Person, newItem: Person): Boolean {
            return  true
        }

        override fun areItemsTheSame(oldItem: Person, newItem: Person): Boolean {
            return newItem == oldItem
        }
    }


}