package com.example.myanywhereapplication.simpsons.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myanywhereapplication.databinding.TextItemBinding

class SimpsonsAdapter: RecyclerView.Adapter<SimpsonsAdapter.SimpsonsViewholder>() {
    private var myList = ArrayList<String>()

    class SimpsonsViewholder(var binding: TextItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpsonsViewholder {
        val binding = TextItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SimpsonsViewholder(binding)
    }

    override fun onBindViewHolder(holder: SimpsonsViewholder, position: Int) {
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