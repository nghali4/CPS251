package com.ebookfrenzy.viewmodeldemo.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    var name: MutableLiveData<String> = MutableLiveData()
    var nameDisplay: MutableLiveData<String> = MutableLiveData()


    fun display(value: String) {
        name.let {
            nameDisplay.value.toString()
        }
    }

}