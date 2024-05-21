package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class Adapter1(val list: MutableList<DataMovies>, val eventHandling: (DataMovies) -> Unit): RecyclerView.Adapter<Adapter1.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_movies, parent, false)
        return ViewHolder(view, eventHandling)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindView(list[position])
    }

    class ViewHolder(itemView: View, val eventHandling: (DataMovies) -> Unit): RecyclerView.ViewHolder(itemView){
        val ivImageSatu = itemView.findViewById<ImageView>(R.id.ivImageSatu)
        val tvJudul = itemView.findViewById<TextView>(R.id.tvJudul)
        val tvTahun = itemView.findViewById<TextView>(R.id.tvTahun)

        fun onBindView(data: DataMovies){
            Picasso.get().load(data.image).resize(600, 899).onlyScaleDown().centerCrop().into(ivImageSatu)
            tvJudul.text = data.judul
            tvTahun.text = data.tahun


            itemView.setOnClickListener { eventHandling(data) }
        }


    }
}