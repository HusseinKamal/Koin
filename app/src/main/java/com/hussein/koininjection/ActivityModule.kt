package com.hussein.koininjection

import org.koin.core.qualifier.named
import org.koin.core.qualifier.qualifier
import org.koin.dsl.module

val activityModel = module {
    scope<MainActivity> {
        scoped(qualifier= named("Hello")) {"Hello"}
        scoped(qualifier= named("Bye")) {"Bye"}

    }
}