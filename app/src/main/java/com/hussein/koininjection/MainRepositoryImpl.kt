package com.hussein.koininjection

import com.hussein.koininjection.ui.theme.MyApi

class MainRepositoryImpl(private val myApi: MyApi): MainRepository {


    override fun doNetworkCall(){
        myApi.callAPI()
    }
}