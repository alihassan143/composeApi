package com.example.testcompose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testcompose.ApiClass
import com.example.testcompose.Repository.Model.PostModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DateViewModel :ViewModel() {


    private val _state = MutableStateFlow(emptyList<PostModel>())
    val state: StateFlow<List<PostModel>>
        get() = _state


    init {

       viewModelScope.launch {
           var data=ApiClass().callApi()
           _state.value=data
       }


    }
}