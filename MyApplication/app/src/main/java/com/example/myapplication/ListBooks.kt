package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityRecyclerViewBinding
import com.google.gson.Gson

class ListBooks : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val content = assets.open("mostpopulartvs.json").bufferedReader().use { it.readText() }
        val pagingData = Gson().fromJson(content, ResponseTVs::class.java)
        val data = arrayListOf<DataBooks>()

        pagingData.items?.forEach{items ->
            data.add(
                DataBooks (items?.image, items?.title, items?.year.toString())
            )
        }

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = Adapter3(data) {
            Toast.makeText(this, it.judul, Toast.LENGTH_SHORT).show()}

    }
}
