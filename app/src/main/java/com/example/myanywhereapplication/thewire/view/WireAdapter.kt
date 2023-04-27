package com.example.myanywhereapplication.thewire.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myanywhereapplication.databinding.TextItemBinding

class WireAdapter: RecyclerView.Adapter<WireAdapter.TheWireViewholder>() {
    private var myList = ArrayList<String>()

    class TheWireViewholder(var binding: TextItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheWireViewholder {
        val binding = TextItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TheWireViewholder(binding)
    }

    override fun onBindViewHolder(holder: TheWireViewholder, position: Int) {
        holder.binding.apply {
            characterName.text = myList?.get(position)
        }
    }

    override fun getItemCount(): Int = myList.size

    fun setData(newList : ArrayList<String>){
        myList = newList
        notifyDataSetChanged()
    }
}