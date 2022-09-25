package com.gauravbora.mvvmarchitecturetwowaydatabinding


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModal : ViewModel() {

    val Et_text= MutableLiveData<String>()


    init {
        Et_text.value="Two Way Data Binding"
    }


}
