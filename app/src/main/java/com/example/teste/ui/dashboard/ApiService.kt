package com.example.teste.ui.dashboard


import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<Users>>
}