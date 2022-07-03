package com.example.andreymoney2.viwemodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.andreymoney2.data.repository.AppRepository
import kotlinx.coroutines.launch

class AppViweModel (privet val repository: AppRepository) : ViweModel() {
    init {
        viewModelScope.launch{
            repository.test()
        }
    }
}