package com.example.myapplication

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseMovies(

	@field:SerializedName("errorMessage")
	val errorMessage: String? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
) : Parcelable

@Parcelize
data class ItemsItem4(

	@field:SerializedName("imDbRating")
	val imDbRating: String? = null,

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("fullTitle")
	val fullTitle: String? = null,

	@field:SerializedName("imDbRatingCount")
	val imDbRatingCount: String? = null,

	@field:SerializedName("year")
	val year: String? = null,

	@field:SerializedName("rank")
	val rank: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("rankUpDown")
	val rankUpDown: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("crew")
	val crew: String? = null
) : Parcelable
