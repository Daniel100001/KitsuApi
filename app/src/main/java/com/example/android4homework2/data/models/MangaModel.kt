package com.example.android4homework2.data.models

import com.example.android4homework2.data.models.attributes.Attributes
import com.google.gson.annotations.SerializedName

data class MangaModel(

    @SerializedName("id")
    val id: String,

    @SerializedName("attributes")
    val attributes: Attributes
)