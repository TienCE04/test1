package com.example.tesst1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFile(val listItemFile: List<ItemFile>) :
    RecyclerView.Adapter<AdapterFile.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_file, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val item = listItemFile[position]
        holder.img.setImageResource(item.img)
        holder.nameFile.text = item.nameFile
        holder.sizeFile.text = item.sizeFile
    }

    override fun getItemCount(): Int {
        return listItemFile.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById<ImageView>(R.id.icon_file)
        val nameFile: TextView = itemView.findViewById<TextView>(R.id.name_file)
        val sizeFile: TextView = itemView.findViewById<TextView>(R.id.tv_size_file)
    }
}