package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityRecyclerViewBinding
import com.google.gson.Gson

class ListItemFilm : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val content = assets.open("mostpopularmovies.json").bufferedReader().use { it.readText() }
        val pagingData = Gson().fromJson(content, ResponseMovies::class.java)
        val data = arrayListOf<DataMovies>()

        pagingData.items?.forEach{items ->
            data.add(
                DataMovies (items?.image, items?.title, items?.year)
            )
        }

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)

        recyclerView.adapter = Adapter1(data) {
            Toast.makeText(this, it.judul, Toast.LENGTH_SHORT).show()}

    }
}
