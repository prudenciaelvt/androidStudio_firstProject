package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityRecyclerViewBinding
import com.google.gson.Gson

class ListBoxOffice : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val content = assets.open("boxoffice.json").bufferedReader().use { it.readText() }
        val pagingData = Gson().fromJson(content, ResponseBoxOffice::class.java)
        val data = arrayListOf<DataBoxOffice>()

        pagingData.items?.forEach{ items ->
            data.add(
                DataBoxOffice (items?.image, items?.title)
            )
        }

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = Adapter2(data) {
            Toast.makeText(this, it.judul, Toast.LENGTH_SHORT).show()}

    }
}
