package com.example.sunweather.login

import androidx.lifecycle.liveData
import com.example.sunweather.login.model.PlaceResponse
import com.example.sunweather.login.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

object Repository {

    fun searchPlaces(query:String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlace(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else{
                Result.failure(java.lang.RuntimeException("response statues is ${placeResponse.status}"))
            }

        }catch (e:java.lang.Exception){
            Result.failure<List<PlaceResponse.Place>>(e)
        }
        emit(result)
    }

}