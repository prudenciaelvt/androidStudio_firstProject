package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataMovies(
    val image: String?,
    val judul: String?,
    val tahun: String?
):Parcelable

