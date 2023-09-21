package com.example.devmon.ui.creatures

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.devmon.R
import com.example.devmon.model.domain.Creature
import com.example.devmon.model.repository.CreaturesRepository

class CreaturesListAdapter(private val items: List<Creature>) : RecyclerView.Adapter<CreaturesListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: Creature){
            val tvCreatureNumber = itemView.findViewById<TextView>(R.id.tvCreatureNumber)
            val tvCreatureName = itemView.findViewById<TextView>(R.id.tvCreatureName)
            val ivCreature = itemView.findViewById<ImageView>(R.id.ivCreature)

            tvCreatureNumber.text = item.number.toString()
            tvCreatureName.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_devmon, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

}