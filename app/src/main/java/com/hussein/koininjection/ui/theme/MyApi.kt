package com.hussein.koininjection.ui.theme

import retrofit2.http.GET

interface MyApi {

    @GET("my/endpoint")
    fun callAPI()
}