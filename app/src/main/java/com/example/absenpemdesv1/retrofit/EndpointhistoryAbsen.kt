package com.example.absenpemdesv1.retrofit

import com.example.absenpemdesv1.GetAllResponse
import retrofit2.Call
import retrofit2.http.GET

interface EndpointhistoryAbsen {
    @GET("allabsen")
        fun getAllData(): Call<ArrayList<GetAllResponse>>
}