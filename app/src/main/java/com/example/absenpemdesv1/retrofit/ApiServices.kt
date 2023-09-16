package com.example.absenpemdesv1.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServices {
    private val BASE_URL:String = "https://absenpemdes.ukmtechcode.com/api/"

//    buat instance (agar bisa di panggil secara global)
    val instance: EndpointhistoryAbsen by lazy {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
//        .client(client) //get data in client OkHttp
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    retrofit.create(EndpointhistoryAbsen::class.java)
    }
}