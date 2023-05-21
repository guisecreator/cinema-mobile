package com.example.cinema_mobile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PosterAdapter (val con:Context, val list2:ArrayList<Poster>):RecyclerView.Adapter<PosterAdapter.Link>() {
    class Link(itemView: View):RecyclerView.ViewHolder(itemView){
        val im_di:ImageView = itemView.findViewById(R.id.image)
        val text_di:TextView = itemView.findViewById(R.id.title)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosterAdapter.Link {
        val root = LayoutInflater.from(con).inflate(R.layout.poster_screen, parent, false)
        return Link(root)
    }

    override fun onBindViewHolder(holder: PosterAdapter.Link, position: Int) {
        holder.im_di.setImageResource(list2[position].imageId)
        holder.text_di.setText(list2[position].title)
    }

    override fun getItemCount(): Int {
        return list2.size
    }
}