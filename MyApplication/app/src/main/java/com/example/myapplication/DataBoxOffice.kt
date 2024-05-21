package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class DataBoxOffice(
    val image: String?,
    val judul: String?
): Parcelable


