package com.example.sunweather.login.network

import com.example.sunweather.SunnyWeatherApplication
import com.example.sunweather.login.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {


    //https://api.caiyunapp.com/v2/place?query=北京&token={token}&lang=zh_CN
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query: String): Call<PlaceResponse>




}