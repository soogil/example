package com.soogil.example.aac

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class TestViewModel: ViewModel() {

    private val dataRepository: DataRepository = DataRepository()

//    fun getData(): LiveData<List<Objects>> {
//        return dataRepository.getUser()
//    }

    fun getData(): String? {
        return dataRepository.getData("").value
    }

    private fun loadData() {
        // Do an asynchronous operation to fetch users.
    }
}