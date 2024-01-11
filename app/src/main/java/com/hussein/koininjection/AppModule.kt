package com.hussein.koininjection

import com.hussein.koininjection.ui.theme.MyApi
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    //single mean singleton
    single {
        Retrofit.Builder()
            .baseUrl("Https://www.google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }
    single<MainRepository> { //for abstraction
        MainRepositoryImpl(get())
    }
    viewModel{
        MainViewModel(get())
    }

 /*   factory {
        MainRepositoryImpl(get())
    }*/
}