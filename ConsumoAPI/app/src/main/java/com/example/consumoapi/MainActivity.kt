package com.example.consumoapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.consumoapi.R
import com.example.consumoapi.models.ApiResponseModel
import com.example.consumoapi.models.CharacterModel
import com.example.consumoapi.repository.CharacterEndpoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val httpClient = NetworUtils.getRetrofitInstance(BASE_URL)
        obterPersonagem()

    }

    fun obterPersonagem() {

        var endpoint = httpClient.create(CharacterEndpoint::class.java)

        endpoint.obterPersonagens().enqueue(object : Callback<ApiResponseModel<CharacterModel>> {
            override fun onResponse(
                call: Call<ApiResponseModel<CharacterModel>>,
                response: Response<ApiResponseModel<CharacterModel>>
            ) {
                val resultado = response.body()
                Toast.makeText(this@MainActivity, resultado!!.results[0].name, Toast.LENGTH_LONG)
                    .show()
            }

            override fun onFailure(call: Call<ApiResponseModel<CharacterModel>>, t: Throwable) {
            }

        })

    }


    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api/"
        lateinit var httpClient: Retrofit
    }

}