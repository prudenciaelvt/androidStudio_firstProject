package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class Adapter2(val list: MutableList<DataBoxOffice>, val eventHandling: (DataBoxOffice) -> Unit): RecyclerView.Adapter<Adapter2.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_boxoffice, parent, false)
        return ViewHolder(view, eventHandling)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBindView(list[position])
    }

    class ViewHolder(itemView: View, val eventHandling: (DataBoxOffice) -> Unit): RecyclerView.ViewHolder(itemView){
        val ivImageSatu = itemView.findViewById<ImageView>(R.id.ivImageSatu)
        val tvJudul2 = itemView.findViewById<TextView>(R.id.tvJudul2)

        fun onBindView(data: DataBoxOffice){
            Picasso.get().load(data.image).resize(600, 899).onlyScaleDown().centerCrop().into(ivImageSatu)
            tvJudul2.text = data.judul


            itemView.setOnClickListener { eventHandling(data) }
        }


    }
}