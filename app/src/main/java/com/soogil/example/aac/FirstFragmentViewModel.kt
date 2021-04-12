package com.soogil.example.aac

import android.app.Application
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.soogil.example.R

class FirstFragmentViewModel(private val application: Application?): ViewModel() {

    private val dataRepository: DataRepository = DataRepository() // test 용

//    fun getData(): LiveData<List<Objects>> {
//        return dataRepository.getUser()
//    }

    fun fragmentString(): String = application!!.getString(R.string.hello_first_fragment)

    fun buttonText() = "nextFragment"

    fun buttonClick() {
        println("buttonClick")
        Toast.makeText(application!!, "Button Click!", Toast.LENGTH_SHORT)!!.show()
    }
}