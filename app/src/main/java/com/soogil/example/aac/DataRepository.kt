package com.soogil.example.aac

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataRepository: WebInterface {
    override fun getData(uid: String): LiveData<String> {
        //todo get async data
        return MutableLiveData<String>("dfd") // getData
    }
}