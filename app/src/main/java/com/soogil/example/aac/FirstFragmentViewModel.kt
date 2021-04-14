package com.soogil.example.aac

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel(
    val inputText: ObservableField<String> = ObservableField(),
) : ViewModel() {

//    private val dataRepository: DataRepository = DataRepository() // test 용
    private val _nextButtonCallback = MutableLiveData<Event<Boolean>>()

//    fun getData(): LiveData<List<Objects>> {
//        return dataRepository.getUser()
//    }

    fun buttonClick() {
        println("buttonClick")
        _nextButtonCallback.value = Event(true)
    }

    fun inputText(): String? = inputText.get()

    val nextButtonCallback : LiveData<Event<Boolean>> get() = _nextButtonCallback
}


open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content
}