package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class Adapter3(val list: MutableList<DataBooks>, val eventHandling: (DataBooks) -> Unit): RecyclerView.Adapter<Adapter3.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_books, parent, false)
        return ViewHolder(view, eventHandling)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindView(list[position])
    }

    class ViewHolder(itemView: View, val eventHandling: (DataBooks) -> Unit): RecyclerView.ViewHolder(itemView){
        val ivImageSatu = itemView.findViewById<ImageView>(R.id.ivImageSatu)
        val tvJudul3 = itemView.findViewById<TextView>(R.id.tvJudul3)
        val tvTahun3 = itemView.findViewById<TextView>(R.id.tvTahun3)

        fun onBindView(data: DataBooks){
            Picasso.get().load(data.image).resize(600, 899).onlyScaleDown().centerCrop().into(ivImageSatu)
            tvJudul3.text = data.judul
            tvTahun3.text = data.tahun


            itemView.setOnClickListener { eventHandling(data) }
        }


    }
}