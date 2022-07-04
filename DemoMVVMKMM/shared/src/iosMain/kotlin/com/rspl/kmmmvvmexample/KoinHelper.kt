package com.rspl.kmmmvvmexample

import com.rspl.kmmmvvmexample.module.appModule
import org.koin.core.context.startKoin

fun configureKoin() {
    startKoin { modules(appModule) }
}