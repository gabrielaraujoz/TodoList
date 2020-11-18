package com.example.consumoapi.models

import com.google.gson.annotations.SerializedName

data class CharacterModel (
    val id : Int,
    val name : String,
    val status : String,
    @SerializedName("origin")
    val origem : OriginModel,
    val episodes : List<String>
)

