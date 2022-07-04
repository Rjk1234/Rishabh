package com.rspl.kmmmvvmexample

import com.rspl.kmmmvvmexample.user.viewmodel.LoginViewModel
import com.rspl.kmmmvvmexample.user.viewmodel.SampleViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class LoginViewModelHelper : KoinComponent {
    private val loginViewModel: LoginViewModel by inject();
    private val sampleViewModel: SampleViewModel by inject();

    fun loginW() {
        sampleViewModel.testFunction()
        loginViewModel.login()
    }
}