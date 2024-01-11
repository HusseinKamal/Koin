package com.hussein.koininjection

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
    ) : ViewModel() {

    fun doNetworkCall(){
        //repository.doNetworkCall()
        print("Koin Injection")
    }
}