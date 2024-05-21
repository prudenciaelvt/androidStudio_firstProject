package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class Adapter(val list: ArrayList<Data>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.onBindView(list[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivImageSatu = itemView.findViewById<ImageView>(R.id.ivImageSatu)


        fun onBindView(data: Data){
            Picasso.get().load(data.image).resize(1920, 1080).onlyScaleDown().centerCrop().into(ivImageSatu)
        }


    }
}