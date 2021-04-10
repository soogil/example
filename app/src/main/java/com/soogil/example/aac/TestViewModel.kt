package com.soogil.example.aac

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class TestViewModel: ViewModel() {

    private val dataRepository: DataRepository = DataRepository()

    private val data: MutableLiveData<List<Objects>> by lazy {
        /* .also: scope function */
        MutableLiveData()
    }

//    fun getData(): LiveData<List<Objects>> {
//        return dataRepository.getUser()
//    }

    fun getData(): LiveData<String> {
        return dataRepository.getData("")
    }

    private fun loadData() {
        // Do an asynchronous operation to fetch users.
    }
}