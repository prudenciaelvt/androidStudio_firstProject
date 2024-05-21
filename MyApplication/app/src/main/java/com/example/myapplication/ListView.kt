package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.listView
        val adapter:ArrayAdapter<*>
        val listBarang = arrayOf("Penggaris", "Laptop", "Mouse", "HDMI", "Kuas")

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listBarang)
        listView.adapter = adapter

    }
}