package com.example.consumoapi.repository

import com.example.consumoapi.models.ApiResponseModel
import com.example.consumoapi.models.CharacterModel
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterEndpoint {

    @GET("character")
    fun obterPersonagens(): retrofit2.Call<ApiResponseModel<CharacterModel>>

    @GET("character/{id}")
    fun obterDetalhe(@Path("id") id : Int): retrofit2.Call<CharacterModel>

}