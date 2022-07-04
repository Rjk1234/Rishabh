package com.rspl.kmmmvvmexample.module

import com.rspl.kmmmvvmexample.user.data.datasource.UserDataSource
import com.rspl.kmmmvvmexample.user.data.datasource.UserDataSourceImpl
import com.rspl.kmmmvvmexample.user.data.repository.UserRepositoryImpl
import com.rspl.kmmmvvmexample.user.domain.repository.UserRepository
import com.rspl.kmmmvvmexample.user.viewmodel.LoginViewModel
import com.rspl.kmmmvvmexample.user.viewmodel.SampleViewModel
import org.koin.dsl.module


val appModule = module {
    // single instance of HelloRepository
    single<UserDataSource> { UserDataSourceImpl() }
    single<UserRepository> { UserRepositoryImpl(get()) }
    single<LoginViewModel> { LoginViewModel(get()) }
    single<SampleViewModel> { SampleViewModel() }
}
