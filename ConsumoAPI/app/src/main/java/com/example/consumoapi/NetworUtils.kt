package com.example.consumoapi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworUtils {
    companion object{
        fun getRetrofitInstance(baseUrl: String): Retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}