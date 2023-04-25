package com.example.sunweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunweather.login.Repository
import com.example.sunweather.login.model.PlaceResponse

class PlaceViewModel: ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<PlaceResponse.Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData){
        query->Repository.searchPlaces(query)
    }

    fun searchPlaces(query:String){
        searchLiveData.value = query
    }




}