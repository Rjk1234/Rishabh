package com.rspl.kmmmvvmexample.user.viewmodel

import com.rspl.kmmmvvmexample.core.Resource
import com.rspl.kmmmvvmexample.core.Status
import com.rspl.kmmmvvmexample.user.data.model.UserModel
import com.rspl.kmmmvvmexample.user.domain.repository.UserRepository
import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.livedata.postValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.launch


class LoginViewModel(val userRepository: UserRepository) : ViewModel() {
    private val _userData = MutableLiveData("")
    val userData: LiveData<String> = _userData
    private val _userLoginResource = MutableLiveData<Resource<UserModel>>(
        Resource(
            status = Status.LOADING,
            data = null,
            message = null
        )
    )

    fun login() {
        viewModelScope.launch {
            val userResponse = userRepository.login(username = "rajveer.kaur@rishabhsoft", password = " ")
            print(userResponse.status)
           if (userResponse.status == Status.SUCCESS) {
               _userData.postValue(userResponse.data.toString())
           }
        }
        print("Login viewModelCalled");

    }
}