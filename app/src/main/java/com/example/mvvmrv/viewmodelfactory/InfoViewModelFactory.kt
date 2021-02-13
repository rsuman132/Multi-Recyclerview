package com.example.mvvmrv.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmrv.viewmodel.InformationViewModel

class InfoViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InformationViewModel::class.java)){
            return InformationViewModel() as T
        }
        throw IllegalArgumentException ("UnknownViewModel")
    }
}