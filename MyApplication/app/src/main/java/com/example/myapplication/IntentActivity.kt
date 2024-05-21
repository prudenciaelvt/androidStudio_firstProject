package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentBinding


class IntentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button = binding.btnPindah
        val buttonWA = binding.btnWA
        val buttonMaps = binding.btnMaps
        val buttonInstagram = binding.btnInstagram
    //  val buttonYouTube = binding.btnYouTube
        val buttonPicture = binding.btnPic
        val buttonMostPopularMovies = binding.btnMPM
        val circleImageView = binding.circleImageView
        val buttonBoxOffice = binding.btnBXO
        val buttonBooks = binding.btnBooks

        button.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        buttonMostPopularMovies.setOnClickListener {
            val intent = Intent(this, ListItemFilm::class.java)
            startActivity(intent)
        }

        circleImageView.setOnClickListener {
            val intent = Intent(this, TargetActivity::class.java)
            startActivity(intent)
        }

        buttonBoxOffice.setOnClickListener {
            val intent = Intent(this, ListBoxOffice::class.java)
            startActivity(intent)
        }

        buttonBooks.setOnClickListener {
            val intent = Intent (this, ListBooks::class.java)
            startActivity(intent)
        }




        val nomor = "+6289518394088"
        val pesan = "morning"

        buttonWA.setOnClickListener{
            val intent = Intent (
                Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=${nomor}&text=${pesan}")
            )
            startActivity(intent)
        }

        buttonMaps.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/@-6.0327009,113.7318673,4.35z?authuser=0&entry=ttu")
            )
            startActivity(intent)
        }

        buttonInstagram.setOnClickListener{
            val intent = Intent(
            Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/")
            )
            startActivity(intent)
        }

 //       buttonYouTube.setOnClickListener{
   //         val intent = Intent (
 //           Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/")
 //           )
 //           startActivity(intent)
 //       }

        binding.btnPic.setOnClickListener {
            val intent = Intent (this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        }
    }


