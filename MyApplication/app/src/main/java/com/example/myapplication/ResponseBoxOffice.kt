package com.example.myapplication

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseBoxOffice(

	@field:SerializedName("errorMessage")
	val errorMessage: String? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
) : Parcelable

@Parcelize
data class ItemsItem2(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("weeks")
	val weeks: String? = null,

	@field:SerializedName("gross")
	val gross: String? = null,

	@field:SerializedName("weekend")
	val weekend: String? = null,

	@field:SerializedName("rank")
	val rank: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null,
	val year: String?
) : Parcelable
